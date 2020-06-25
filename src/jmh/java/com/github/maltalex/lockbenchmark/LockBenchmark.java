package com.github.maltalex.lockbenchmark;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.StampedLock;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;
import org.openjdk.jmh.infra.Blackhole;

@Measurement(iterations = 5)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@State(Scope.Benchmark)
public class LockBenchmark {

	public static interface Data {
		void write(double plus);
		double read();
	}

	static class StampedData implements Data {
		private double x;
		private final StampedLock sl = new StampedLock();

		public StampedData(int x) {
			this.x = x;
		}

		public void write(double plus) {
			long stamp = sl.writeLock();
			x += plus;
			sl.unlockWrite(stamp);
		}

		public double read() {
			long stamp = sl.tryOptimisticRead();
			double a = x;
			if (!sl.validate(stamp)) {
				stamp = sl.readLock();
				a = x;
				sl.unlockRead(stamp);
			}
			return a;
		}
	}

	static class ReadWriteData implements Data {
		private double x;
		private final ReentrantReadWriteLock rrwl = new ReentrantReadWriteLock();

		public ReadWriteData(int x) {
			this.x = x;
		}

		public void write(double plus) {
			rrwl.writeLock().lock();
			x += plus;
			rrwl.writeLock().unlock();
		}

		public double read() {
			rrwl.readLock().lock();
			double a = x;
			rrwl.readLock().unlock();
			return a;
		}
	}

	static class ReentrantData implements Data {
		private double x;
		private final ReentrantLock rl = new ReentrantLock();

		public ReentrantData(int x) {
			this.x = x;
		}

		public void write(double plus) {
			rl.lock();
			x += plus;
			rl.unlock();
		}

		public double read() {
			rl.lock();
			double a = x;
			rl.unlock();
			return a;
		}
	}

	static class SynchronizedData implements Data {
		private double x;

		public SynchronizedData(int x) {
			this.x = x;
		}

		public void write(double plus) {
			synchronized (this) {
				x += plus;
			}
		}

		public double read() {
			double a;
			synchronized (this) {
				a = x;
			}
			return a;
		}
	}

	static class SpinData implements Data {
		private double x;
		AtomicBoolean ab = new AtomicBoolean();

		public SpinData(int x) {
			this.x = x;
		}

		public void write(double plus) {
			while (!ab.compareAndSet(false, true)) {
				Thread.yield();
			}
			x += plus;
			ab.set(false);
		}

		public double read() {
			double a;
			while (!ab.compareAndSet(false, true)) {
				Thread.yield();
			}
			a = x;
			ab.set(false);
			return a;
		}
	}

	StampedData stampedData;
	ReentrantData reentrantData;
	ReadWriteData readWriteData;
	SynchronizedData synchronizedData;
	SpinData spinData;
	ExecutorService executor;

	int iterations = 1000;
	int precent10 = 3;
	int percent20 = 2 * precent10;
	int percent50 = 5 * precent10;
	int percent80 = 8 * precent10;
	int percent90 = 9 * precent10;
	int percent100 = 10 * precent10;

	@Setup(Level.Trial)
	public void setUp() {
		stampedData = new StampedData(1);
		reentrantData = new ReentrantData(1);
		readWriteData = new ReadWriteData(1);
		synchronizedData = new SynchronizedData(1);
		spinData = new SpinData(1);
		executor = Executors.newFixedThreadPool(percent100);
	}

	@TearDown(Level.Trial)
	public void tearDown() {
		executor.shutdown();
	}

	public void benchmark(Blackhole hole, Data d, int readers, int writers, int iterations) {
		CompletableFuture<?>[] futures = new CompletableFuture<?>[readers + writers];
		for (int i = 0; i < readers; i++) {
			futures[i] = CompletableFuture.runAsync(() -> {
				for (int j = 0; j < iterations; j++) {
					hole.consume(d.read());
					Thread.yield();
				}
			}, executor);
		}
		for (int i = readers; i < readers + writers; i++) {
			futures[i] = CompletableFuture.runAsync(() -> {
				for (int j = 0; j < iterations; j++) {
					d.write(j);
					Thread.yield();
				}
			}, executor);
		}
		try {
			CompletableFuture.allOf(futures).get();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Benchmark
	public void stamped_r100_w0(Blackhole hole) {
		benchmark(hole, stampedData, percent100, 0, iterations);
	}

	@Benchmark
	public void reentrant_r100_w0(Blackhole hole) {
		benchmark(hole, reentrantData, percent100, 0, iterations);
	}

	@Benchmark
	public void readwrite_r100_w0(Blackhole hole) {
		benchmark(hole, readWriteData, percent100, 0, iterations);
	}

	@Benchmark
	public void synchronized_r100_w0(Blackhole hole) {
		benchmark(hole, synchronizedData, percent100, 0, iterations);
	}

	@Benchmark
	public void spin_r100_w0(Blackhole hole) {
		benchmark(hole, spinData, percent100, 0, iterations);
	}

	@Benchmark
	public void stamped_r90_w10(Blackhole hole) {
		benchmark(hole, stampedData, percent90, precent10, iterations);
	}

	@Benchmark
	public void reentrant_r90_w10(Blackhole hole) {
		benchmark(hole, reentrantData, percent90, precent10, iterations);
	}

	@Benchmark
	public void readwrite_r90_w10(Blackhole hole) {
		benchmark(hole, readWriteData, percent90, precent10, iterations);
	}

	@Benchmark
	public void synchronized_r90_w10(Blackhole hole) {
		benchmark(hole, synchronizedData, percent90, precent10, iterations);
	}

	@Benchmark
	public void spin_r90_w10(Blackhole hole) {
		benchmark(hole, spinData, percent90, precent10, iterations);
	}

	@Benchmark
	public void stamped_r80_w20(Blackhole hole) {
		benchmark(hole, stampedData, percent80, percent20, iterations);
	}

	@Benchmark
	public void reentrant_r80_w20(Blackhole hole) {
		benchmark(hole, reentrantData, percent80, percent20, iterations);
	}

	@Benchmark
	public void readwrite_r80_w20(Blackhole hole) {
		benchmark(hole, readWriteData, percent80, percent20, iterations);
	}

	@Benchmark
	public void synchronized_r80_w20(Blackhole hole) {
		benchmark(hole, synchronizedData, percent80, percent20, iterations);
	}

	@Benchmark
	public void spin_r80_w20(Blackhole hole) {
		benchmark(hole, spinData, percent80, percent20, iterations);
	}

	@Benchmark
	public void stamped_r50_w50(Blackhole hole) {
		benchmark(hole, stampedData, percent50, percent50, iterations);
	}

	@Benchmark
	public void reentrant_r50_w50(Blackhole hole) {
		benchmark(hole, reentrantData, percent50, percent50, iterations);
	}

	@Benchmark
	public void readwrite_r50_w50(Blackhole hole) {
		benchmark(hole, readWriteData, percent50, percent50, iterations);
	}

	@Benchmark
	public void synchronized_r50_w50(Blackhole hole) {
		benchmark(hole, synchronizedData, percent50, percent50, iterations);
	}

	@Benchmark
	public void spin_r50_w50(Blackhole hole) {
		benchmark(hole, spinData, percent50, percent50, iterations);
	}

	@Benchmark
	public void stamped_r0_w100(Blackhole hole) {
		benchmark(hole, stampedData, 0, percent100, iterations);
	}

	@Benchmark
	public void reentrant_r0_w100(Blackhole hole) {
		benchmark(hole, reentrantData, 0, percent100, iterations);
	}

	@Benchmark
	public void readwrite_r0_w100(Blackhole hole) {
		benchmark(hole, readWriteData, 0, percent100, iterations);
	}

	@Benchmark
	public void synchronized_r0_w100(Blackhole hole) {
		benchmark(hole, synchronizedData, 0, percent100, iterations);
	}

	@Benchmark
	public void spin_r0_w100(Blackhole hole) {
		benchmark(hole, spinData, 0, percent100, iterations);
	}
}