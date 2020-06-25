# Summary 

The benchmark ran with `-prof stack` on a Threadripper 2950 (16 Cores 32 Threads) with 30 threads.
Each benchark uses a different lock and a different proportion of readers and writers; `r` and `w` in the benchmark names stand for the percent of readers and writers in a specific test. For example `r80_w20` stands for 80% readers, 20% writers.

If you have any reservations about the validity of the benchmark (benchmarks are hard), please open an issue in this repo.

	Benchmark                                  Mode  Cnt      Score     Error  Units
	LockBenchmark.readwrite_r0_w100            avgt   25  16509.112 ± 188.460  us/op
	LockBenchmark.readwrite_r100_w0            avgt   25   7561.638 ± 613.479  us/op
	LockBenchmark.readwrite_r50_w50            avgt   25  16321.811 ± 211.794  us/op
	LockBenchmark.readwrite_r80_w20            avgt   25  12357.781 ± 189.023  us/op
	LockBenchmark.readwrite_r90_w10            avgt   25  11286.269 ± 328.912  us/op
	LockBenchmark.reentrant_r0_w100            avgt   25  15732.678 ± 554.701  us/op
	LockBenchmark.reentrant_r100_w0            avgt   25  14586.118 ± 153.174  us/op
	LockBenchmark.reentrant_r50_w50            avgt   25  15439.426 ± 397.694  us/op
	LockBenchmark.reentrant_r80_w20            avgt   25  15051.987 ± 210.090  us/op
	LockBenchmark.reentrant_r90_w10            avgt   25  14902.399 ± 115.543  us/op
	LockBenchmark.spin_r0_w100                 avgt   25  16296.223 ± 351.788  us/op
	LockBenchmark.spin_r100_w0                 avgt   25   7103.558 ± 327.008  us/op
	LockBenchmark.spin_r50_w50                 avgt   25  13065.895 ± 155.809  us/op
	LockBenchmark.spin_r90_w10                 avgt   25   9390.915 ± 465.028  us/op
	LockBenchmark.spin_r80_w20                 avgt   25  10431.370 ± 371.228  us/op
	LockBenchmark.stamped_r0_w100              avgt   25  11508.145 ± 599.651  us/op
	LockBenchmark.stamped_r100_w0              avgt   25    863.142 ±  29.717  us/op
	LockBenchmark.stamped_r50_w50              avgt   25   8990.532 ± 408.712  us/op
	LockBenchmark.stamped_r80_w20              avgt   25   5870.741 ±  96.738  us/op
	LockBenchmark.stamped_r90_w10              avgt   25   4337.439 ±  71.332  us/op
	LockBenchmark.synchronized_r0_w100         avgt   25  15404.589 ± 160.709  us/op
	LockBenchmark.synchronized_r100_w0         avgt   25   8564.822 ±  65.918  us/op
	LockBenchmark.synchronized_r50_w50         avgt   25  13890.215 ± 261.045  us/op
	LockBenchmark.synchronized_r80_w20         avgt   25  11450.740 ± 139.611  us/op
	LockBenchmark.synchronized_r90_w10         avgt   25  10172.275 ±  97.704  us/op
	
# Full results:

	# JMH version: 1.21
	# VM version: JDK 11.0.7, OpenJDK 64-Bit Server VM, 11.0.7+10-post-Ubuntu-2ubuntu218.04
	# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
	# VM options: <none>
	# Warmup: 5 iterations, 10 s each
	# Measurement: 5 iterations, 10 s each
	# Timeout: 10 min per iteration
	# Threads: 1 thread, will synchronize iterations
	# Benchmark mode: Average time, time/op
	# Benchmark: com.github.maltalex.lockbenchmark.LockBenchmark.readwrite_r0_w100

	# Run progress: 0.00% complete, ETA 03:28:20
	# Fork: 1 of 5
	# Warmup Iteration   1: 16642.352 us/op
	# Warmup Iteration   2: 16573.274 us/op
	# Warmup Iteration   3: 16793.625 us/op
	# Warmup Iteration   4: 16812.052 us/op
	# Warmup Iteration   5: 16772.292 us/op
	Iteration   1: 16824.817 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 16620.955 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 16928.362 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 16880.884 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 16876.247 us/op
					 ·stack: <delayed till summary>


	# Run progress: 0.80% complete, ETA 03:27:30
	# Fork: 2 of 5
	# Warmup Iteration   1: 16404.066 us/op
	# Warmup Iteration   2: 16264.563 us/op
	# Warmup Iteration   3: 16198.837 us/op
	# Warmup Iteration   4: 16148.504 us/op
	# Warmup Iteration   5: 16208.998 us/op
	Iteration   1: 16136.660 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 16219.944 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 16369.091 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 16129.241 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 16060.294 us/op
					 ·stack: <delayed till summary>


	# Run progress: 1.60% complete, ETA 03:25:46
	# Fork: 3 of 5
	# Warmup Iteration   1: 16567.060 us/op
	# Warmup Iteration   2: 16681.025 us/op
	# Warmup Iteration   3: 16752.245 us/op
	# Warmup Iteration   4: 16502.471 us/op
	# Warmup Iteration   5: 16600.809 us/op
	Iteration   1: 16724.682 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 16676.032 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 16793.164 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 16651.519 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 16589.106 us/op
					 ·stack: <delayed till summary>


	# Run progress: 2.40% complete, ETA 03:24:06
	# Fork: 4 of 5
	# Warmup Iteration   1: 16683.651 us/op
	# Warmup Iteration   2: 16571.617 us/op
	# Warmup Iteration   3: 16545.116 us/op
	# Warmup Iteration   4: 16564.942 us/op
	# Warmup Iteration   5: 16553.972 us/op
	Iteration   1: 16378.996 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 16267.919 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 16590.483 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 16500.407 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 16600.072 us/op
					 ·stack: <delayed till summary>


	# Run progress: 3.20% complete, ETA 03:22:27
	# Fork: 5 of 5
	# Warmup Iteration   1: 16602.308 us/op
	# Warmup Iteration   2: 16347.707 us/op
	# Warmup Iteration   3: 16474.694 us/op
	# Warmup Iteration   4: 16496.413 us/op
	# Warmup Iteration   5: 16493.177 us/op
	Iteration   1: 16353.525 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 16460.820 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 16433.372 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 16367.386 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 16293.821 us/op
					 ·stack: <delayed till summary>



	Result "com.github.maltalex.lockbenchmark.LockBenchmark.readwrite_r0_w100":
	  16509.112 ±(99.9%) 188.460 us/op [Average]
	  (min, avg, max) = (16060.294, 16509.112, 16928.362), stdev = 251.588
	  CI (99.9%): [16320.652, 16697.572] (assumes normal distribution)

	Secondary result "com.github.maltalex.lockbenchmark.LockBenchmark.readwrite_r0_w100:·stack":
	Stack profiler:

	....[Thread state distributions]....................................................................
	 92.5%         WAITING
	  4.4%         RUNNABLE
	  3.1%         TIMED_WAITING

	....[Thread state: WAITING].........................................................................
	 92.5% 100.0% jdk.internal.misc.Unsafe.park

	....[Thread state: RUNNABLE]........................................................................
	  2.2%  50.5% java.lang.Thread.yield
	  1.2%  27.1% jdk.internal.misc.Unsafe.unpark
	  0.5%  12.4% com.github.maltalex.lockbenchmark.LockBenchmark.lambda$benchmark$1
	  0.3%   6.9% java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireQueued
	  0.1%   2.4% jdk.internal.misc.Unsafe.park
	  0.0%   0.2% java.util.concurrent.locks.AbstractQueuedSynchronizer.addWaiter
	  0.0%   0.1% java.util.concurrent.locks.AbstractQueuedSynchronizer.release
	  0.0%   0.1% java.util.concurrent.CompletableFuture.postComplete
	  0.0%   0.1% java.util.concurrent.locks.AbstractQueuedSynchronizer.unparkSuccessor
	  0.0%   0.1% java.util.concurrent.locks.AbstractQueuedSynchronizer.acquire
	  0.0%   0.2% <other>

	....[Thread state: TIMED_WAITING]...................................................................
	  3.1% 100.0% java.lang.Object.wait



	# JMH version: 1.21
	# VM version: JDK 11.0.7, OpenJDK 64-Bit Server VM, 11.0.7+10-post-Ubuntu-2ubuntu218.04
	# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
	# VM options: <none>
	# Warmup: 5 iterations, 10 s each
	# Measurement: 5 iterations, 10 s each
	# Timeout: 10 min per iteration
	# Threads: 1 thread, will synchronize iterations
	# Benchmark mode: Average time, time/op
	# Benchmark: com.github.maltalex.lockbenchmark.LockBenchmark.readwrite_r100_w0

	# Run progress: 4.00% complete, ETA 03:20:46
	# Fork: 1 of 5
	# Warmup Iteration   1: 6643.937 us/op
	# Warmup Iteration   2: 6447.868 us/op
	# Warmup Iteration   3: 6940.543 us/op
	# Warmup Iteration   4: 6742.305 us/op
	# Warmup Iteration   5: 6955.340 us/op
	Iteration   1: 6963.827 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 6670.145 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 7220.603 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 6793.785 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 6694.447 us/op
					 ·stack: <delayed till summary>


	# Run progress: 4.80% complete, ETA 03:19:06
	# Fork: 2 of 5
	# Warmup Iteration   1: 7174.620 us/op
	# Warmup Iteration   2: 6893.864 us/op
	# Warmup Iteration   3: 6812.940 us/op
	# Warmup Iteration   4: 7496.472 us/op
	# Warmup Iteration   5: 7253.957 us/op
	Iteration   1: 6828.341 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 7275.240 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 7274.170 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 8448.815 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 8376.560 us/op
					 ·stack: <delayed till summary>


	# Run progress: 5.60% complete, ETA 03:17:25
	# Fork: 3 of 5
	# Warmup Iteration   1: 7549.987 us/op
	# Warmup Iteration   2: 7417.334 us/op
	# Warmup Iteration   3: 7596.396 us/op
	# Warmup Iteration   4: 7375.852 us/op
	# Warmup Iteration   5: 7128.052 us/op
	Iteration   1: 6615.374 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 7749.998 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 7425.442 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 8540.651 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 8600.967 us/op
					 ·stack: <delayed till summary>


	# Run progress: 6.40% complete, ETA 03:15:44
	# Fork: 4 of 5
	# Warmup Iteration   1: 6880.524 us/op
	# Warmup Iteration   2: 7617.537 us/op
	# Warmup Iteration   3: 6761.186 us/op
	# Warmup Iteration   4: 7283.271 us/op
	# Warmup Iteration   5: 8264.095 us/op
	Iteration   1: 7265.777 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 7541.952 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 6927.747 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 8671.849 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 9321.795 us/op
					 ·stack: <delayed till summary>


	# Run progress: 7.20% complete, ETA 03:14:03
	# Fork: 5 of 5
	# Warmup Iteration   1: 7294.888 us/op
	# Warmup Iteration   2: 6940.667 us/op
	# Warmup Iteration   3: 7088.944 us/op
	# Warmup Iteration   4: 7074.929 us/op
	# Warmup Iteration   5: 7198.122 us/op
	Iteration   1: 7078.309 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 6591.648 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 7015.726 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 8533.308 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 8614.487 us/op
					 ·stack: <delayed till summary>



	Result "com.github.maltalex.lockbenchmark.LockBenchmark.readwrite_r100_w0":
	  7561.638 ±(99.9%) 613.479 us/op [Average]
	  (min, avg, max) = (6591.648, 7561.638, 9321.795), stdev = 818.976
	  CI (99.9%): [6948.160, 8175.117] (assumes normal distribution)

	Secondary result "com.github.maltalex.lockbenchmark.LockBenchmark.readwrite_r100_w0:·stack":
	Stack profiler:

	....[Thread state distributions]....................................................................
	 76.1%         RUNNABLE
	 20.8%         WAITING
	  3.1%         TIMED_WAITING

	....[Thread state: RUNNABLE]........................................................................
	 17.2%  22.6% java.lang.Thread.yield
	 17.0%  22.3% java.util.concurrent.locks.ReentrantReadWriteLock$Sync.tryReleaseShared
	 14.6%  19.2% java.lang.ref.Reference.<init>
	 11.0%  14.5% java.util.concurrent.locks.ReentrantReadWriteLock$Sync.fullTryAcquireShared
	  7.1%   9.4% java.util.concurrent.locks.ReentrantReadWriteLock$Sync.tryAcquireShared
	  5.6%   7.3% com.github.maltalex.lockbenchmark.LockBenchmark.lambda$benchmark$0
	  3.5%   4.6% java.util.concurrent.locks.AbstractQueuedSynchronizer.releaseShared
	  0.1%   0.1% jdk.internal.misc.Unsafe.unpark
	  0.0%   0.0% java.lang.ThreadLocal.set
	  0.0%   0.0% java.util.concurrent.CompletableFuture.postComplete

	....[Thread state: WAITING].........................................................................
	 20.8% 100.0% jdk.internal.misc.Unsafe.park

	....[Thread state: TIMED_WAITING]...................................................................
	  3.1% 100.0% java.lang.Object.wait



	# JMH version: 1.21
	# VM version: JDK 11.0.7, OpenJDK 64-Bit Server VM, 11.0.7+10-post-Ubuntu-2ubuntu218.04
	# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
	# VM options: <none>
	# Warmup: 5 iterations, 10 s each
	# Measurement: 5 iterations, 10 s each
	# Timeout: 10 min per iteration
	# Threads: 1 thread, will synchronize iterations
	# Benchmark mode: Average time, time/op
	# Benchmark: com.github.maltalex.lockbenchmark.LockBenchmark.readwrite_r50_w50

	# Run progress: 8.00% complete, ETA 03:12:23
	# Fork: 1 of 5
	# Warmup Iteration   1: 16687.307 us/op
	# Warmup Iteration   2: 16380.473 us/op
	# Warmup Iteration   3: 16434.649 us/op
	# Warmup Iteration   4: 16344.518 us/op
	# Warmup Iteration   5: 16469.903 us/op
	Iteration   1: 16579.314 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 16516.366 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 16511.178 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 16320.625 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 16363.674 us/op
					 ·stack: <delayed till summary>


	# Run progress: 8.80% complete, ETA 03:10:43
	# Fork: 2 of 5
	# Warmup Iteration   1: 16245.355 us/op
	# Warmup Iteration   2: 16028.846 us/op
	# Warmup Iteration   3: 16129.044 us/op
	# Warmup Iteration   4: 15950.484 us/op
	# Warmup Iteration   5: 15795.490 us/op
	Iteration   1: 16056.485 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 16661.771 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 16720.345 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 16798.121 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 16191.055 us/op
					 ·stack: <delayed till summary>


	# Run progress: 9.60% complete, ETA 03:09:03
	# Fork: 3 of 5
	# Warmup Iteration   1: 15367.461 us/op
	# Warmup Iteration   2: 14749.488 us/op
	# Warmup Iteration   3: 15480.079 us/op
	# Warmup Iteration   4: 16315.551 us/op
	# Warmup Iteration   5: 16213.820 us/op
	Iteration   1: 16250.443 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 16378.587 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 16382.509 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 16353.878 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 15869.270 us/op
					 ·stack: <delayed till summary>


	# Run progress: 10.40% complete, ETA 03:07:23
	# Fork: 4 of 5
	# Warmup Iteration   1: 16283.059 us/op
	# Warmup Iteration   2: 16080.527 us/op
	# Warmup Iteration   3: 16318.209 us/op
	# Warmup Iteration   4: 16409.975 us/op
	# Warmup Iteration   5: 16393.370 us/op
	Iteration   1: 16425.551 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 16354.825 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 16304.400 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 16285.812 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 16719.772 us/op
					 ·stack: <delayed till summary>


	# Run progress: 11.20% complete, ETA 03:05:43
	# Fork: 5 of 5
	# Warmup Iteration   1: 16367.051 us/op
	# Warmup Iteration   2: 16372.559 us/op
	# Warmup Iteration   3: 16245.938 us/op
	# Warmup Iteration   4: 15941.197 us/op
	# Warmup Iteration   5: 15574.844 us/op
	Iteration   1: 15570.280 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 15927.081 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 16129.953 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 16138.920 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 16235.052 us/op
					 ·stack: <delayed till summary>



	Result "com.github.maltalex.lockbenchmark.LockBenchmark.readwrite_r50_w50":
	  16321.811 ±(99.9%) 211.794 us/op [Average]
	  (min, avg, max) = (15570.280, 16321.811, 16798.121), stdev = 282.738
	  CI (99.9%): [16110.017, 16533.604] (assumes normal distribution)

	Secondary result "com.github.maltalex.lockbenchmark.LockBenchmark.readwrite_r50_w50:·stack":
	Stack profiler:

	....[Thread state distributions]....................................................................
	 88.3%         WAITING
	  8.6%         RUNNABLE
	  3.1%         TIMED_WAITING

	....[Thread state: WAITING].........................................................................
	 88.3% 100.0% jdk.internal.misc.Unsafe.park

	....[Thread state: RUNNABLE]........................................................................
	  2.4%  28.1% java.lang.Thread.yield
	  1.7%  19.5% java.util.concurrent.locks.ReentrantReadWriteLock$Sync.fullTryAcquireShared
	  1.1%  12.6% jdk.internal.misc.Unsafe.unpark
	  1.0%  12.0% java.util.concurrent.locks.ReentrantReadWriteLock$Sync.tryAcquireShared
	  0.6%   7.0% java.util.concurrent.locks.ReentrantReadWriteLock$Sync.tryReleaseShared
	  0.6%   6.9% java.util.concurrent.locks.AbstractQueuedSynchronizer.releaseShared
	  0.4%   5.0% java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireShared
	  0.2%   1.8% java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireQueued
	  0.2%   1.8% com.github.maltalex.lockbenchmark.LockBenchmark.lambda$benchmark$1
	  0.1%   1.6% java.util.concurrent.locks.AbstractQueuedSynchronizer.doAcquireShared
	  0.3%   3.8% <other>

	....[Thread state: TIMED_WAITING]...................................................................
	  3.1% 100.0% java.lang.Object.wait



	# JMH version: 1.21
	# VM version: JDK 11.0.7, OpenJDK 64-Bit Server VM, 11.0.7+10-post-Ubuntu-2ubuntu218.04
	# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
	# VM options: <none>
	# Warmup: 5 iterations, 10 s each
	# Measurement: 5 iterations, 10 s each
	# Timeout: 10 min per iteration
	# Threads: 1 thread, will synchronize iterations
	# Benchmark mode: Average time, time/op
	# Benchmark: com.github.maltalex.lockbenchmark.LockBenchmark.readwrite_r80_w20

	# Run progress: 12.00% complete, ETA 03:04:03
	# Fork: 1 of 5
	# Warmup Iteration   1: 12719.385 us/op
	# Warmup Iteration   2: 12462.195 us/op
	# Warmup Iteration   3: 12563.808 us/op
	# Warmup Iteration   4: 12727.854 us/op
	# Warmup Iteration   5: 12139.744 us/op
	Iteration   1: 12433.471 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 12214.672 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 12270.577 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 12274.830 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 11732.274 us/op
					 ·stack: <delayed till summary>


	# Run progress: 12.80% complete, ETA 03:02:23
	# Fork: 2 of 5
	# Warmup Iteration   1: 12954.448 us/op
	# Warmup Iteration   2: 12465.969 us/op
	# Warmup Iteration   3: 12396.076 us/op
	# Warmup Iteration   4: 12380.950 us/op
	# Warmup Iteration   5: 12329.776 us/op
	Iteration   1: 12343.029 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 12350.589 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 12330.849 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 12230.085 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 11977.785 us/op
					 ·stack: <delayed till summary>


	# Run progress: 13.60% complete, ETA 03:00:42
	# Fork: 3 of 5
	# Warmup Iteration   1: 12597.405 us/op
	# Warmup Iteration   2: 12001.556 us/op
	# Warmup Iteration   3: 12216.133 us/op
	# Warmup Iteration   4: 12703.631 us/op
	# Warmup Iteration   5: 12913.030 us/op
	Iteration   1: 12538.708 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 12469.745 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 12390.655 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 12477.962 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 12712.559 us/op
					 ·stack: <delayed till summary>


	# Run progress: 14.40% complete, ETA 02:59:02
	# Fork: 4 of 5
	# Warmup Iteration   1: 12563.442 us/op
	# Warmup Iteration   2: 12512.065 us/op
	# Warmup Iteration   3: 12553.435 us/op
	# Warmup Iteration   4: 12742.984 us/op
	# Warmup Iteration   5: 12498.216 us/op
	Iteration   1: 12103.194 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 12402.126 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 12569.190 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 12783.854 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 12865.674 us/op
					 ·stack: <delayed till summary>


	# Run progress: 15.20% complete, ETA 02:57:21
	# Fork: 5 of 5
	# Warmup Iteration   1: 12976.237 us/op
	# Warmup Iteration   2: 12753.854 us/op
	# Warmup Iteration   3: 12516.407 us/op
	# Warmup Iteration   4: 12350.850 us/op
	# Warmup Iteration   5: 12418.928 us/op
	Iteration   1: 12212.106 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 12195.502 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 12607.785 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 12392.243 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 12065.049 us/op
					 ·stack: <delayed till summary>



	Result "com.github.maltalex.lockbenchmark.LockBenchmark.readwrite_r80_w20":
	  12357.781 ±(99.9%) 189.023 us/op [Average]
	  (min, avg, max) = (11732.274, 12357.781, 12865.674), stdev = 252.341
	  CI (99.9%): [12168.757, 12546.804] (assumes normal distribution)

	Secondary result "com.github.maltalex.lockbenchmark.LockBenchmark.readwrite_r80_w20:·stack":
	Stack profiler:

	....[Thread state distributions]....................................................................
	 74.1%         WAITING
	 22.8%         RUNNABLE
	  3.1%         TIMED_WAITING

	....[Thread state: WAITING].........................................................................
	 74.1% 100.0% jdk.internal.misc.Unsafe.park

	....[Thread state: RUNNABLE]........................................................................
	  6.2%  27.1% java.util.concurrent.locks.ReentrantReadWriteLock$Sync.fullTryAcquireShared
	  4.2%  18.5% java.lang.Thread.yield
	  3.3%  14.7% java.util.concurrent.locks.ReentrantReadWriteLock$Sync.tryReleaseShared
	  3.2%  14.2% java.util.concurrent.locks.ReentrantReadWriteLock$Sync.tryAcquireShared
	  2.1%   9.2% java.util.concurrent.locks.AbstractQueuedSynchronizer.releaseShared
	  1.8%   7.8% java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireShared
	  1.1%   4.8% jdk.internal.misc.Unsafe.unpark
	  0.3%   1.2% java.util.concurrent.locks.AbstractQueuedSynchronizer.doAcquireShared
	  0.1%   0.7% java.util.concurrent.locks.AbstractQueuedSynchronizer.addWaiter
	  0.1%   0.5% jdk.internal.misc.Unsafe.park
	  0.3%   1.5% <other>

	....[Thread state: TIMED_WAITING]...................................................................
	  3.1% 100.0% java.lang.Object.wait



	# JMH version: 1.21
	# VM version: JDK 11.0.7, OpenJDK 64-Bit Server VM, 11.0.7+10-post-Ubuntu-2ubuntu218.04
	# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
	# VM options: <none>
	# Warmup: 5 iterations, 10 s each
	# Measurement: 5 iterations, 10 s each
	# Timeout: 10 min per iteration
	# Threads: 1 thread, will synchronize iterations
	# Benchmark mode: Average time, time/op
	# Benchmark: com.github.maltalex.lockbenchmark.LockBenchmark.readwrite_r90_w10

	# Run progress: 16.00% complete, ETA 02:55:41
	# Fork: 1 of 5
	# Warmup Iteration   1: 11784.235 us/op
	# Warmup Iteration   2: 11080.177 us/op
	# Warmup Iteration   3: 11595.318 us/op
	# Warmup Iteration   4: 10830.972 us/op
	# Warmup Iteration   5: 11308.592 us/op
	Iteration   1: 11939.008 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 10672.523 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 11194.260 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 11384.892 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 12812.843 us/op
					 ·stack: <delayed till summary>


	# Run progress: 16.80% complete, ETA 02:54:01
	# Fork: 2 of 5
	# Warmup Iteration   1: 11521.690 us/op
	# Warmup Iteration   2: 11579.512 us/op
	# Warmup Iteration   3: 10636.816 us/op
	# Warmup Iteration   4: 11309.848 us/op
	# Warmup Iteration   5: 11220.850 us/op
	Iteration   1: 11164.445 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 11671.073 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 11234.985 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 11261.640 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 11200.377 us/op
					 ·stack: <delayed till summary>


	# Run progress: 17.60% complete, ETA 02:52:20
	# Fork: 3 of 5
	# Warmup Iteration   1: 11572.333 us/op
	# Warmup Iteration   2: 11755.828 us/op
	# Warmup Iteration   3: 11564.599 us/op
	# Warmup Iteration   4: 11283.287 us/op
	# Warmup Iteration   5: 12597.610 us/op
	Iteration   1: 11546.189 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 11466.184 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 10888.206 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 11638.958 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 10803.410 us/op
					 ·stack: <delayed till summary>


	# Run progress: 18.40% complete, ETA 02:50:40
	# Fork: 4 of 5
	# Warmup Iteration   1: 11576.609 us/op
	# Warmup Iteration   2: 11124.683 us/op
	# Warmup Iteration   3: 11332.802 us/op
	# Warmup Iteration   4: 11540.572 us/op
	# Warmup Iteration   5: 11452.996 us/op
	Iteration   1: 11309.822 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 11113.367 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 11433.267 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 11088.613 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 10926.153 us/op
					 ·stack: <delayed till summary>


	# Run progress: 19.20% complete, ETA 02:48:59
	# Fork: 5 of 5
	# Warmup Iteration   1: 10694.160 us/op
	# Warmup Iteration   2: 10860.708 us/op
	# Warmup Iteration   3: 11450.001 us/op
	# Warmup Iteration   4: 11208.221 us/op
	# Warmup Iteration   5: 11010.080 us/op
	Iteration   1: 11105.163 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 11203.417 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 11266.077 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 11190.814 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 10641.029 us/op
					 ·stack: <delayed till summary>



	Result "com.github.maltalex.lockbenchmark.LockBenchmark.readwrite_r90_w10":
	  11286.269 ±(99.9%) 328.912 us/op [Average]
	  (min, avg, max) = (10641.029, 11286.269, 12812.843), stdev = 439.088
	  CI (99.9%): [10957.357, 11615.180] (assumes normal distribution)

	Secondary result "com.github.maltalex.lockbenchmark.LockBenchmark.readwrite_r90_w10:·stack":
	Stack profiler:

	....[Thread state distributions]....................................................................
	 65.9%         WAITING
	 31.0%         RUNNABLE
	  3.1%         TIMED_WAITING

	....[Thread state: WAITING].........................................................................
	 65.9% 100.0% jdk.internal.misc.Unsafe.park

	....[Thread state: RUNNABLE]........................................................................
	 11.6%  37.5% java.util.concurrent.locks.ReentrantReadWriteLock$Sync.fullTryAcquireShared
	  5.6%  17.9% java.lang.Thread.yield
	  4.8%  15.4% java.util.concurrent.locks.ReentrantReadWriteLock$Sync.tryReleaseShared
	  3.8%  12.2% java.util.concurrent.locks.ReentrantReadWriteLock$Sync.tryAcquireShared
	  2.8%   9.1% java.util.concurrent.locks.AbstractQueuedSynchronizer.releaseShared
	  1.1%   3.5% jdk.internal.misc.Unsafe.unpark
	  0.4%   1.4% java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireShared
	  0.3%   0.9% java.util.concurrent.locks.AbstractQueuedSynchronizer.doAcquireShared
	  0.2%   0.7% java.util.concurrent.locks.AbstractQueuedSynchronizer.addWaiter
	  0.1%   0.4% jdk.internal.misc.Unsafe.park
	  0.3%   0.8% <other>

	....[Thread state: TIMED_WAITING]...................................................................
	  3.1% 100.0% java.lang.Object.wait



	# JMH version: 1.21
	# VM version: JDK 11.0.7, OpenJDK 64-Bit Server VM, 11.0.7+10-post-Ubuntu-2ubuntu218.04
	# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
	# VM options: <none>
	# Warmup: 5 iterations, 10 s each
	# Measurement: 5 iterations, 10 s each
	# Timeout: 10 min per iteration
	# Threads: 1 thread, will synchronize iterations
	# Benchmark mode: Average time, time/op
	# Benchmark: com.github.maltalex.lockbenchmark.LockBenchmark.reentrant_r0_w100

	# Run progress: 20.00% complete, ETA 02:47:19
	# Fork: 1 of 5
	# Warmup Iteration   1: 16474.745 us/op
	# Warmup Iteration   2: 16491.477 us/op
	# Warmup Iteration   3: 16398.275 us/op
	# Warmup Iteration   4: 16652.305 us/op
	# Warmup Iteration   5: 16478.664 us/op
	Iteration   1: 16459.005 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 16547.037 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 16361.447 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 16261.560 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 16505.459 us/op
					 ·stack: <delayed till summary>


	# Run progress: 20.80% complete, ETA 02:45:39
	# Fork: 2 of 5
	# Warmup Iteration   1: 15355.592 us/op
	# Warmup Iteration   2: 14830.491 us/op
	# Warmup Iteration   3: 14638.286 us/op
	# Warmup Iteration   4: 14660.116 us/op
	# Warmup Iteration   5: 14727.921 us/op
	Iteration   1: 14793.183 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 14828.874 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 14878.472 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 14798.149 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 14802.467 us/op
					 ·stack: <delayed till summary>


	# Run progress: 21.60% complete, ETA 02:43:58
	# Fork: 3 of 5
	# Warmup Iteration   1: 15839.783 us/op
	# Warmup Iteration   2: 14633.896 us/op
	# Warmup Iteration   3: 14822.392 us/op
	# Warmup Iteration   4: 15003.649 us/op
	# Warmup Iteration   5: 14853.864 us/op
	Iteration   1: 14893.761 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 14914.099 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 14859.770 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 14873.636 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 14901.444 us/op
					 ·stack: <delayed till summary>


	# Run progress: 22.40% complete, ETA 02:42:18
	# Fork: 4 of 5
	# Warmup Iteration   1: 16373.436 us/op
	# Warmup Iteration   2: 16455.204 us/op
	# Warmup Iteration   3: 16196.583 us/op
	# Warmup Iteration   4: 16489.987 us/op
	# Warmup Iteration   5: 16487.005 us/op
	Iteration   1: 16473.659 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 16119.922 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 16390.839 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 16377.687 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 16319.182 us/op
					 ·stack: <delayed till summary>


	# Run progress: 23.20% complete, ETA 02:40:38
	# Fork: 5 of 5
	# Warmup Iteration   1: 16196.424 us/op
	# Warmup Iteration   2: 16248.481 us/op
	# Warmup Iteration   3: 15880.150 us/op
	# Warmup Iteration   4: 15954.073 us/op
	# Warmup Iteration   5: 15870.001 us/op
	Iteration   1: 16316.973 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 16155.925 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 16166.537 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 16141.077 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 16176.777 us/op
					 ·stack: <delayed till summary>



	Result "com.github.maltalex.lockbenchmark.LockBenchmark.reentrant_r0_w100":
	  15732.678 ±(99.9%) 554.701 us/op [Average]
	  (min, avg, max) = (14793.183, 15732.678, 16547.037), stdev = 740.510
	  CI (99.9%): [15177.976, 16287.379] (assumes normal distribution)

	Secondary result "com.github.maltalex.lockbenchmark.LockBenchmark.reentrant_r0_w100:·stack":
	Stack profiler:

	....[Thread state distributions]....................................................................
	 92.3%         WAITING
	  4.5%         RUNNABLE
	  3.1%         TIMED_WAITING

	....[Thread state: WAITING].........................................................................
	 92.3% 100.0% jdk.internal.misc.Unsafe.park

	....[Thread state: RUNNABLE]........................................................................
	  2.3%  50.7% java.lang.Thread.yield
	  1.2%  26.2% jdk.internal.misc.Unsafe.unpark
	  0.6%  12.6% com.github.maltalex.lockbenchmark.LockBenchmark.lambda$benchmark$1
	  0.3%   6.9% java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireQueued
	  0.1%   2.6% jdk.internal.misc.Unsafe.park
	  0.0%   0.5% java.util.concurrent.locks.AbstractQueuedSynchronizer.addWaiter
	  0.0%   0.1% java.util.concurrent.CompletableFuture.postComplete
	  0.0%   0.1% java.util.concurrent.locks.AbstractQueuedSynchronizer.release
	  0.0%   0.1% java.util.concurrent.ThreadPoolExecutor.runWorker
	  0.0%   0.0% java.util.concurrent.locks.AbstractQueuedSynchronizer.unparkSuccessor
	  0.0%   0.2% <other>

	....[Thread state: TIMED_WAITING]...................................................................
	  3.1% 100.0% java.lang.Object.wait



	# JMH version: 1.21
	# VM version: JDK 11.0.7, OpenJDK 64-Bit Server VM, 11.0.7+10-post-Ubuntu-2ubuntu218.04
	# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
	# VM options: <none>
	# Warmup: 5 iterations, 10 s each
	# Measurement: 5 iterations, 10 s each
	# Timeout: 10 min per iteration
	# Threads: 1 thread, will synchronize iterations
	# Benchmark mode: Average time, time/op
	# Benchmark: com.github.maltalex.lockbenchmark.LockBenchmark.reentrant_r100_w0

	# Run progress: 24.00% complete, ETA 02:38:57
	# Fork: 1 of 5
	# Warmup Iteration   1: 14447.585 us/op
	# Warmup Iteration   2: 14589.714 us/op
	# Warmup Iteration   3: 14594.314 us/op
	# Warmup Iteration   4: 14547.374 us/op
	# Warmup Iteration   5: 14771.947 us/op
	Iteration   1: 14606.746 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 14617.473 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 14887.047 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 14844.279 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 14854.822 us/op
					 ·stack: <delayed till summary>


	# Run progress: 24.80% complete, ETA 02:37:17
	# Fork: 2 of 5
	# Warmup Iteration   1: 14278.992 us/op
	# Warmup Iteration   2: 14346.383 us/op
	# Warmup Iteration   3: 14218.836 us/op
	# Warmup Iteration   4: 14247.093 us/op
	# Warmup Iteration   5: 14088.118 us/op
	Iteration   1: 14378.978 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 14305.812 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 14377.856 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 14272.362 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 14230.521 us/op
					 ·stack: <delayed till summary>


	# Run progress: 25.60% complete, ETA 02:35:36
	# Fork: 3 of 5
	# Warmup Iteration   1: 14197.268 us/op
	# Warmup Iteration   2: 14337.671 us/op
	# Warmup Iteration   3: 14425.630 us/op
	# Warmup Iteration   4: 14336.665 us/op
	# Warmup Iteration   5: 14342.742 us/op
	Iteration   1: 14625.660 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 14624.334 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 14528.998 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 14494.099 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 14586.408 us/op
					 ·stack: <delayed till summary>


	# Run progress: 26.40% complete, ETA 02:33:56
	# Fork: 4 of 5
	# Warmup Iteration   1: 14400.241 us/op
	# Warmup Iteration   2: 14487.784 us/op
	# Warmup Iteration   3: 14605.247 us/op
	# Warmup Iteration   4: 14579.594 us/op
	# Warmup Iteration   5: 14718.731 us/op
	Iteration   1: 14696.098 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 14826.618 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 14746.149 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 14715.009 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 14844.170 us/op
					 ·stack: <delayed till summary>


	# Run progress: 27.20% complete, ETA 02:32:15
	# Fork: 5 of 5
	# Warmup Iteration   1: 14449.826 us/op
	# Warmup Iteration   2: 14356.363 us/op
	# Warmup Iteration   3: 14034.928 us/op
	# Warmup Iteration   4: 14494.988 us/op
	# Warmup Iteration   5: 14062.241 us/op
	Iteration   1: 14309.694 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 14340.820 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 14481.163 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 14752.144 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 14705.686 us/op
					 ·stack: <delayed till summary>



	Result "com.github.maltalex.lockbenchmark.LockBenchmark.reentrant_r100_w0":
	  14586.118 ±(99.9%) 153.174 us/op [Average]
	  (min, avg, max) = (14230.521, 14586.118, 14887.047), stdev = 204.483
	  CI (99.9%): [14432.944, 14739.292] (assumes normal distribution)

	Secondary result "com.github.maltalex.lockbenchmark.LockBenchmark.reentrant_r100_w0:·stack":
	Stack profiler:

	....[Thread state distributions]....................................................................
	 92.1%         WAITING
	  4.8%         RUNNABLE
	  3.1%         TIMED_WAITING

	....[Thread state: WAITING].........................................................................
	 92.1% 100.0% jdk.internal.misc.Unsafe.park

	....[Thread state: RUNNABLE]........................................................................
	  2.5%  51.5% java.lang.Thread.yield
	  1.2%  25.1% jdk.internal.misc.Unsafe.unpark
	  0.6%  13.3% com.github.maltalex.lockbenchmark.LockBenchmark.lambda$benchmark$0
	  0.3%   6.7% java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireQueued
	  0.1%   2.0% jdk.internal.misc.Unsafe.park
	  0.0%   0.9% java.util.concurrent.locks.AbstractQueuedSynchronizer.addWaiter
	  0.0%   0.1% java.util.concurrent.locks.AbstractQueuedSynchronizer.release
	  0.0%   0.1% java.util.concurrent.CompletableFuture.postComplete
	  0.0%   0.1% java.util.concurrent.ThreadPoolExecutor.runWorker
	  0.0%   0.0% java.lang.Thread.isInterrupted
	  0.0%   0.1% <other>

	....[Thread state: TIMED_WAITING]...................................................................
	  3.1% 100.0% java.lang.Object.wait



	# JMH version: 1.21
	# VM version: JDK 11.0.7, OpenJDK 64-Bit Server VM, 11.0.7+10-post-Ubuntu-2ubuntu218.04
	# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
	# VM options: <none>
	# Warmup: 5 iterations, 10 s each
	# Measurement: 5 iterations, 10 s each
	# Timeout: 10 min per iteration
	# Threads: 1 thread, will synchronize iterations
	# Benchmark mode: Average time, time/op
	# Benchmark: com.github.maltalex.lockbenchmark.LockBenchmark.reentrant_r50_w50

	# Run progress: 28.00% complete, ETA 02:30:35
	# Fork: 1 of 5
	# Warmup Iteration   1: 15744.262 us/op
	# Warmup Iteration   2: 15504.847 us/op
	# Warmup Iteration   3: 15666.029 us/op
	# Warmup Iteration   4: 15524.016 us/op
	# Warmup Iteration   5: 15537.121 us/op
	Iteration   1: 15656.889 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 15545.755 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 15460.631 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 15561.726 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 15487.699 us/op
					 ·stack: <delayed till summary>


	# Run progress: 28.80% complete, ETA 02:28:55
	# Fork: 2 of 5
	# Warmup Iteration   1: 15554.151 us/op
	# Warmup Iteration   2: 14865.186 us/op
	# Warmup Iteration   3: 14907.440 us/op
	# Warmup Iteration   4: 14938.541 us/op
	# Warmup Iteration   5: 14962.687 us/op
	Iteration   1: 14978.355 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 14967.046 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 14925.752 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 14947.003 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 14883.124 us/op
					 ·stack: <delayed till summary>


	# Run progress: 29.60% complete, ETA 02:27:14
	# Fork: 3 of 5
	# Warmup Iteration   1: 15469.042 us/op
	# Warmup Iteration   2: 14714.427 us/op
	# Warmup Iteration   3: 14830.791 us/op
	# Warmup Iteration   4: 14767.853 us/op
	# Warmup Iteration   5: 14618.617 us/op
	Iteration   1: 14891.361 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 14789.493 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 14758.798 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 14806.677 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 14745.007 us/op
					 ·stack: <delayed till summary>


	# Run progress: 30.40% complete, ETA 02:25:34
	# Fork: 4 of 5
	# Warmup Iteration   1: 15924.800 us/op
	# Warmup Iteration   2: 15719.376 us/op
	# Warmup Iteration   3: 15707.132 us/op
	# Warmup Iteration   4: 15699.397 us/op
	# Warmup Iteration   5: 15811.261 us/op
	Iteration   1: 15826.033 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 15749.635 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 15672.605 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 15692.175 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 15624.381 us/op
					 ·stack: <delayed till summary>


	# Run progress: 31.20% complete, ETA 02:23:53
	# Fork: 5 of 5
	# Warmup Iteration   1: 15939.980 us/op
	# Warmup Iteration   2: 16253.364 us/op
	# Warmup Iteration   3: 16320.546 us/op
	# Warmup Iteration   4: 16269.374 us/op
	# Warmup Iteration   5: 16185.343 us/op
	Iteration   1: 16068.094 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 16298.352 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 16345.998 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 16128.764 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 16174.311 us/op
					 ·stack: <delayed till summary>



	Result "com.github.maltalex.lockbenchmark.LockBenchmark.reentrant_r50_w50":
	  15439.426 ±(99.9%) 397.694 us/op [Average]
	  (min, avg, max) = (14745.007, 15439.426, 16345.998), stdev = 530.909
	  CI (99.9%): [15041.733, 15837.120] (assumes normal distribution)

	Secondary result "com.github.maltalex.lockbenchmark.LockBenchmark.reentrant_r50_w50:·stack":
	Stack profiler:

	....[Thread state distributions]....................................................................
	 92.2%         WAITING
	  4.7%         RUNNABLE
	  3.1%         TIMED_WAITING

	....[Thread state: WAITING].........................................................................
	 92.2% 100.0% jdk.internal.misc.Unsafe.park

	....[Thread state: RUNNABLE]........................................................................
	  2.3%  50.0% java.lang.Thread.yield
	  1.2%  26.4% jdk.internal.misc.Unsafe.unpark
	  0.3%   7.2% com.github.maltalex.lockbenchmark.LockBenchmark.lambda$benchmark$1
	  0.3%   7.0% com.github.maltalex.lockbenchmark.LockBenchmark.lambda$benchmark$0
	  0.3%   5.9% java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireQueued
	  0.1%   2.5% jdk.internal.misc.Unsafe.park
	  0.0%   0.5% java.util.concurrent.locks.AbstractQueuedSynchronizer.addWaiter
	  0.0%   0.1% java.util.concurrent.CompletableFuture.postComplete
	  0.0%   0.1% java.util.concurrent.locks.AbstractQueuedSynchronizer.release
	  0.0%   0.1% java.util.concurrent.ThreadPoolExecutor.runWorker
	  0.0%   0.2% <other>

	....[Thread state: TIMED_WAITING]...................................................................
	  3.1% 100.0% java.lang.Object.wait



	# JMH version: 1.21
	# VM version: JDK 11.0.7, OpenJDK 64-Bit Server VM, 11.0.7+10-post-Ubuntu-2ubuntu218.04
	# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
	# VM options: <none>
	# Warmup: 5 iterations, 10 s each
	# Measurement: 5 iterations, 10 s each
	# Timeout: 10 min per iteration
	# Threads: 1 thread, will synchronize iterations
	# Benchmark mode: Average time, time/op
	# Benchmark: com.github.maltalex.lockbenchmark.LockBenchmark.reentrant_r80_w20

	# Run progress: 32.00% complete, ETA 02:22:13
	# Fork: 1 of 5
	# Warmup Iteration   1: 14802.550 us/op
	# Warmup Iteration   2: 14470.542 us/op
	# Warmup Iteration   3: 14600.985 us/op
	# Warmup Iteration   4: 14615.368 us/op
	# Warmup Iteration   5: 14482.581 us/op
	Iteration   1: 14605.253 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 14542.359 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 14592.380 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 14559.978 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 14570.739 us/op
					 ·stack: <delayed till summary>


	# Run progress: 32.80% complete, ETA 02:20:33
	# Fork: 2 of 5
	# Warmup Iteration   1: 15259.924 us/op
	# Warmup Iteration   2: 15092.020 us/op
	# Warmup Iteration   3: 15244.188 us/op
	# Warmup Iteration   4: 15219.046 us/op
	# Warmup Iteration   5: 15121.701 us/op
	Iteration   1: 15211.506 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 15237.781 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 15241.507 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 15240.901 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 15057.340 us/op
					 ·stack: <delayed till summary>


	# Run progress: 33.60% complete, ETA 02:18:52
	# Fork: 3 of 5
	# Warmup Iteration   1: 14955.324 us/op
	# Warmup Iteration   2: 14884.807 us/op
	# Warmup Iteration   3: 14766.017 us/op
	# Warmup Iteration   4: 14879.295 us/op
	# Warmup Iteration   5: 15025.406 us/op
	Iteration   1: 14882.332 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 14927.918 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 15013.851 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 15062.540 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 14955.798 us/op
					 ·stack: <delayed till summary>


	# Run progress: 34.40% complete, ETA 02:17:12
	# Fork: 4 of 5
	# Warmup Iteration   1: 14968.692 us/op
	# Warmup Iteration   2: 15118.131 us/op
	# Warmup Iteration   3: 15106.537 us/op
	# Warmup Iteration   4: 15174.793 us/op
	# Warmup Iteration   5: 15145.862 us/op
	Iteration   1: 15187.247 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 15261.324 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 15363.360 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 15447.298 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 15372.886 us/op
					 ·stack: <delayed till summary>


	# Run progress: 35.20% complete, ETA 02:15:31
	# Fork: 5 of 5
	# Warmup Iteration   1: 15231.979 us/op
	# Warmup Iteration   2: 15136.706 us/op
	# Warmup Iteration   3: 15156.285 us/op
	# Warmup Iteration   4: 15132.272 us/op
	# Warmup Iteration   5: 15210.398 us/op
	Iteration   1: 15036.836 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 15287.302 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 15244.238 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 15238.760 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 15158.233 us/op
					 ·stack: <delayed till summary>



	Result "com.github.maltalex.lockbenchmark.LockBenchmark.reentrant_r80_w20":
	  15051.987 ±(99.9%) 210.090 us/op [Average]
	  (min, avg, max) = (14542.359, 15051.987, 15447.298), stdev = 280.465
	  CI (99.9%): [14841.896, 15262.077] (assumes normal distribution)

	Secondary result "com.github.maltalex.lockbenchmark.LockBenchmark.reentrant_r80_w20:·stack":
	Stack profiler:

	....[Thread state distributions]....................................................................
	 92.1%         WAITING
	  4.7%         RUNNABLE
	  3.1%         TIMED_WAITING

	....[Thread state: WAITING].........................................................................
	 92.1% 100.0% jdk.internal.misc.Unsafe.park

	....[Thread state: RUNNABLE]........................................................................
	  2.4%  51.0% java.lang.Thread.yield
	  1.2%  26.0% jdk.internal.misc.Unsafe.unpark
	  0.5%  10.7% com.github.maltalex.lockbenchmark.LockBenchmark.lambda$benchmark$0
	  0.3%   6.1% java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireQueued
	  0.1%   2.8% com.github.maltalex.lockbenchmark.LockBenchmark.lambda$benchmark$1
	  0.1%   2.1% jdk.internal.misc.Unsafe.park
	  0.0%   0.7% java.util.concurrent.locks.AbstractQueuedSynchronizer.addWaiter
	  0.0%   0.1% java.util.concurrent.CompletableFuture.postComplete
	  0.0%   0.1% java.util.concurrent.locks.AbstractQueuedSynchronizer.release
	  0.0%   0.1% java.util.concurrent.ThreadPoolExecutor.runWorker
	  0.0%   0.2% <other>

	....[Thread state: TIMED_WAITING]...................................................................
	  3.1% 100.0% java.lang.Object.wait



	# JMH version: 1.21
	# VM version: JDK 11.0.7, OpenJDK 64-Bit Server VM, 11.0.7+10-post-Ubuntu-2ubuntu218.04
	# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
	# VM options: <none>
	# Warmup: 5 iterations, 10 s each
	# Measurement: 5 iterations, 10 s each
	# Timeout: 10 min per iteration
	# Threads: 1 thread, will synchronize iterations
	# Benchmark mode: Average time, time/op
	# Benchmark: com.github.maltalex.lockbenchmark.LockBenchmark.reentrant_r90_w10

	# Run progress: 36.00% complete, ETA 02:13:51
	# Fork: 1 of 5
	# Warmup Iteration   1: 14930.944 us/op
	# Warmup Iteration   2: 14899.718 us/op
	# Warmup Iteration   3: 14909.517 us/op
	# Warmup Iteration   4: 14942.556 us/op
	# Warmup Iteration   5: 14694.251 us/op
	Iteration   1: 14878.857 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 14928.327 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 14996.814 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 14981.170 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 14960.913 us/op
					 ·stack: <delayed till summary>


	# Run progress: 36.80% complete, ETA 02:12:10
	# Fork: 2 of 5
	# Warmup Iteration   1: 14625.197 us/op
	# Warmup Iteration   2: 14490.407 us/op
	# Warmup Iteration   3: 14717.885 us/op
	# Warmup Iteration   4: 14801.539 us/op
	# Warmup Iteration   5: 14748.802 us/op
	Iteration   1: 14870.465 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 14825.513 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 14725.469 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 15002.083 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 14851.071 us/op
					 ·stack: <delayed till summary>


	# Run progress: 37.60% complete, ETA 02:10:30
	# Fork: 3 of 5
	# Warmup Iteration   1: 14902.552 us/op
	# Warmup Iteration   2: 14649.610 us/op
	# Warmup Iteration   3: 14703.427 us/op
	# Warmup Iteration   4: 14660.319 us/op
	# Warmup Iteration   5: 14727.194 us/op
	Iteration   1: 14619.317 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 14655.640 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 14650.777 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 14778.779 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 14781.445 us/op
					 ·stack: <delayed till summary>


	# Run progress: 38.40% complete, ETA 02:08:50
	# Fork: 4 of 5
	# Warmup Iteration   1: 15079.137 us/op
	# Warmup Iteration   2: 14971.246 us/op
	# Warmup Iteration   3: 14976.884 us/op
	# Warmup Iteration   4: 14924.541 us/op
	# Warmup Iteration   5: 15043.968 us/op
	Iteration   1: 15150.304 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 15089.651 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 15122.543 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 15138.413 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 15124.941 us/op
					 ·stack: <delayed till summary>


	# Run progress: 39.20% complete, ETA 02:07:09
	# Fork: 5 of 5
	# Warmup Iteration   1: 14829.343 us/op
	# Warmup Iteration   2: 14862.921 us/op
	# Warmup Iteration   3: 14720.245 us/op
	# Warmup Iteration   4: 14885.725 us/op
	# Warmup Iteration   5: 14884.008 us/op
	Iteration   1: 14832.812 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 14880.150 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 14977.703 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 14832.005 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 14904.827 us/op
					 ·stack: <delayed till summary>



	Result "com.github.maltalex.lockbenchmark.LockBenchmark.reentrant_r90_w10":
	  14902.399 ±(99.9%) 115.543 us/op [Average]
	  (min, avg, max) = (14619.317, 14902.399, 15150.304), stdev = 154.247
	  CI (99.9%): [14786.857, 15017.942] (assumes normal distribution)

	Secondary result "com.github.maltalex.lockbenchmark.LockBenchmark.reentrant_r90_w10:·stack":
	Stack profiler:

	....[Thread state distributions]....................................................................
	 92.1%         WAITING
	  4.8%         RUNNABLE
	  3.1%         TIMED_WAITING

	....[Thread state: WAITING].........................................................................
	 92.1% 100.0% jdk.internal.misc.Unsafe.park

	....[Thread state: RUNNABLE]........................................................................
	  2.5%  51.6% java.lang.Thread.yield
	  1.2%  25.2% jdk.internal.misc.Unsafe.unpark
	  0.6%  12.0% com.github.maltalex.lockbenchmark.LockBenchmark.lambda$benchmark$0
	  0.3%   6.2% java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireQueued
	  0.1%   2.2% jdk.internal.misc.Unsafe.park
	  0.1%   1.3% com.github.maltalex.lockbenchmark.LockBenchmark.lambda$benchmark$1
	  0.0%   0.8% java.util.concurrent.locks.AbstractQueuedSynchronizer.addWaiter
	  0.0%   0.2% com.github.maltalex.lockbenchmark.LockBenchmark$ReentrantData.write
	  0.0%   0.1% java.util.concurrent.locks.AbstractQueuedSynchronizer.release
	  0.0%   0.1% java.util.concurrent.CompletableFuture.postComplete
	  0.0%   0.3% <other>

	....[Thread state: TIMED_WAITING]...................................................................
	  3.1% 100.0% java.lang.Object.wait



	# JMH version: 1.21
	# VM version: JDK 11.0.7, OpenJDK 64-Bit Server VM, 11.0.7+10-post-Ubuntu-2ubuntu218.04
	# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
	# VM options: <none>
	# Warmup: 5 iterations, 10 s each
	# Measurement: 5 iterations, 10 s each
	# Timeout: 10 min per iteration
	# Threads: 1 thread, will synchronize iterations
	# Benchmark mode: Average time, time/op
	# Benchmark: com.github.maltalex.lockbenchmark.LockBenchmark.spin_r0_w100

	# Run progress: 40.00% complete, ETA 02:05:29
	# Fork: 1 of 5
	# Warmup Iteration   1: 14412.945 us/op
	# Warmup Iteration   2: 16156.362 us/op
	# Warmup Iteration   3: 16248.092 us/op
	# Warmup Iteration   4: 16228.951 us/op
	# Warmup Iteration   5: 16122.583 us/op
	Iteration   1: 16445.057 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 16314.901 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 16626.010 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 16473.310 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 16629.616 us/op
					 ·stack: <delayed till summary>


	# Run progress: 40.80% complete, ETA 02:03:48
	# Fork: 2 of 5
	# Warmup Iteration   1: 14196.406 us/op
	# Warmup Iteration   2: 15716.791 us/op
	# Warmup Iteration   3: 15826.330 us/op
	# Warmup Iteration   4: 15723.881 us/op
	# Warmup Iteration   5: 15940.426 us/op
	Iteration   1: 15659.121 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 15728.152 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 15766.515 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 15855.165 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 15712.807 us/op
					 ·stack: <delayed till summary>


	# Run progress: 41.60% complete, ETA 02:02:08
	# Fork: 3 of 5
	# Warmup Iteration   1: 14399.988 us/op
	# Warmup Iteration   2: 16902.935 us/op
	# Warmup Iteration   3: 17205.338 us/op
	# Warmup Iteration   4: 17118.238 us/op
	# Warmup Iteration   5: 16827.866 us/op
	Iteration   1: 17104.459 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 17201.721 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 16821.983 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 16857.027 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 17022.965 us/op
					 ·stack: <delayed till summary>


	# Run progress: 42.40% complete, ETA 02:00:28
	# Fork: 4 of 5
	# Warmup Iteration   1: 14314.863 us/op
	# Warmup Iteration   2: 15901.942 us/op
	# Warmup Iteration   3: 15840.537 us/op
	# Warmup Iteration   4: 15802.693 us/op
	# Warmup Iteration   5: 15810.438 us/op
	Iteration   1: 15777.594 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 15880.932 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 15894.748 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 16001.011 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 15919.375 us/op
					 ·stack: <delayed till summary>


	# Run progress: 43.20% complete, ETA 01:58:47
	# Fork: 5 of 5
	# Warmup Iteration   1: 14599.783 us/op
	# Warmup Iteration   2: 16448.051 us/op
	# Warmup Iteration   3: 16612.194 us/op
	# Warmup Iteration   4: 16274.886 us/op
	# Warmup Iteration   5: 16181.379 us/op
	Iteration   1: 16221.713 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 16391.332 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 16257.291 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 16377.670 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 16465.095 us/op
					 ·stack: <delayed till summary>



	Result "com.github.maltalex.lockbenchmark.LockBenchmark.spin_r0_w100":
	  16296.223 ±(99.9%) 351.788 us/op [Average]
	  (min, avg, max) = (15659.121, 16296.223, 17201.721), stdev = 469.626
	  CI (99.9%): [15944.435, 16648.010] (assumes normal distribution)

	Secondary result "com.github.maltalex.lockbenchmark.LockBenchmark.spin_r0_w100:·stack":
	Stack profiler:

	....[Thread state distributions]....................................................................
	 74.8%         RUNNABLE
	 22.1%         WAITING
	  3.1%         TIMED_WAITING

	....[Thread state: RUNNABLE]........................................................................
	 74.7%  99.9% java.lang.Thread.yield
	  0.0%   0.0% jdk.internal.misc.Unsafe.unpark
	  0.0%   0.0% java.util.concurrent.CompletableFuture.postComplete
	  0.0%   0.0% jdk.internal.misc.Unsafe.park
	  0.0%   0.0% java.util.concurrent.ThreadPoolExecutor.runWorker
	  0.0%   0.0% java.util.concurrent.locks.AbstractQueuedSynchronizer.release
	  0.0%   0.0% java.util.concurrent.CompletableFuture.runAsync
	  0.0%   0.0% java.util.concurrent.locks.AbstractQueuedSynchronizer.acquire
	  0.0%   0.0% java.lang.Thread.isInterrupted
	  0.0%   0.0% java.util.concurrent.LinkedBlockingQueue.take

	....[Thread state: WAITING].........................................................................
	 22.1% 100.0% jdk.internal.misc.Unsafe.park

	....[Thread state: TIMED_WAITING]...................................................................
	  3.1% 100.0% java.lang.Object.wait



	# JMH version: 1.21
	# VM version: JDK 11.0.7, OpenJDK 64-Bit Server VM, 11.0.7+10-post-Ubuntu-2ubuntu218.04
	# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
	# VM options: <none>
	# Warmup: 5 iterations, 10 s each
	# Measurement: 5 iterations, 10 s each
	# Timeout: 10 min per iteration
	# Threads: 1 thread, will synchronize iterations
	# Benchmark mode: Average time, time/op
	# Benchmark: com.github.maltalex.lockbenchmark.LockBenchmark.spin_r100_w0

	# Run progress: 44.00% complete, ETA 01:57:07
	# Fork: 1 of 5
	# Warmup Iteration   1: 11821.598 us/op
	# Warmup Iteration   2: 8324.732 us/op
	# Warmup Iteration   3: 8153.130 us/op
	# Warmup Iteration   4: 8000.970 us/op
	# Warmup Iteration   5: 7761.219 us/op
	Iteration   1: 7157.356 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 7055.216 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 6750.171 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 6681.442 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 6214.300 us/op
					 ·stack: <delayed till summary>


	# Run progress: 44.80% complete, ETA 01:55:26
	# Fork: 2 of 5
	# Warmup Iteration   1: 11911.019 us/op
	# Warmup Iteration   2: 8814.017 us/op
	# Warmup Iteration   3: 8636.770 us/op
	# Warmup Iteration   4: 8611.424 us/op
	# Warmup Iteration   5: 8495.401 us/op
	Iteration   1: 8132.717 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 7608.310 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 7348.159 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 7218.634 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 7205.876 us/op
					 ·stack: <delayed till summary>


	# Run progress: 45.60% complete, ETA 01:53:46
	# Fork: 3 of 5
	# Warmup Iteration   1: 12022.962 us/op
	# Warmup Iteration   2: 8779.012 us/op
	# Warmup Iteration   3: 8694.332 us/op
	# Warmup Iteration   4: 8446.079 us/op
	# Warmup Iteration   5: 7759.148 us/op
	Iteration   1: 7474.750 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 7253.244 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 6966.464 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 6846.741 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 6321.280 us/op
					 ·stack: <delayed till summary>


	# Run progress: 46.40% complete, ETA 01:52:05
	# Fork: 4 of 5
	# Warmup Iteration   1: 11796.004 us/op
	# Warmup Iteration   2: 8572.100 us/op
	# Warmup Iteration   3: 8542.828 us/op
	# Warmup Iteration   4: 8573.241 us/op
	# Warmup Iteration   5: 7875.660 us/op
	Iteration   1: 7618.867 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 7405.781 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 7268.518 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 7210.705 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 6941.895 us/op
					 ·stack: <delayed till summary>


	# Run progress: 47.20% complete, ETA 01:50:25
	# Fork: 5 of 5
	# Warmup Iteration   1: 12517.320 us/op
	# Warmup Iteration   2: 8403.854 us/op
	# Warmup Iteration   3: 8525.280 us/op
	# Warmup Iteration   4: 8409.183 us/op
	# Warmup Iteration   5: 7687.230 us/op
	Iteration   1: 7588.357 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 7191.834 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 6873.513 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 6784.567 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 6470.255 us/op
					 ·stack: <delayed till summary>



	Result "com.github.maltalex.lockbenchmark.LockBenchmark.spin_r100_w0":
	  7103.558 ±(99.9%) 327.008 us/op [Average]
	  (min, avg, max) = (6214.300, 7103.558, 8132.717), stdev = 436.546
	  CI (99.9%): [6776.550, 7430.566] (assumes normal distribution)

	Secondary result "com.github.maltalex.lockbenchmark.LockBenchmark.spin_r100_w0:·stack":
	Stack profiler:

	....[Thread state distributions]....................................................................
	 72.0%         RUNNABLE
	 24.9%         WAITING
	  3.1%         TIMED_WAITING

	....[Thread state: RUNNABLE]........................................................................
	 64.3%  89.4% java.lang.Thread.yield
	  7.6%  10.5% com.github.maltalex.lockbenchmark.LockBenchmark.lambda$benchmark$0
	  0.0%   0.1% jdk.internal.misc.Unsafe.unpark
	  0.0%   0.0% java.util.concurrent.CompletableFuture.postComplete
	  0.0%   0.0% jdk.internal.misc.Unsafe.park
	  0.0%   0.0% java.util.concurrent.locks.AbstractQueuedSynchronizer.release
	  0.0%   0.0% java.util.concurrent.LinkedBlockingQueue.take
	  0.0%   0.0% java.util.concurrent.ThreadPoolExecutor.runWorker
	  0.0%   0.0% java.util.concurrent.CompletableFuture.asyncRunStage
	  0.0%   0.0% java.util.concurrent.locks.AbstractQueuedSynchronizer.acquire

	....[Thread state: WAITING].........................................................................
	 24.9% 100.0% jdk.internal.misc.Unsafe.park

	....[Thread state: TIMED_WAITING]...................................................................
	  3.1% 100.0% java.lang.Object.wait



	# JMH version: 1.21
	# VM version: JDK 11.0.7, OpenJDK 64-Bit Server VM, 11.0.7+10-post-Ubuntu-2ubuntu218.04
	# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
	# VM options: <none>
	# Warmup: 5 iterations, 10 s each
	# Measurement: 5 iterations, 10 s each
	# Timeout: 10 min per iteration
	# Threads: 1 thread, will synchronize iterations
	# Benchmark mode: Average time, time/op
	# Benchmark: com.github.maltalex.lockbenchmark.LockBenchmark.spin_r50_w50

	# Run progress: 48.00% complete, ETA 01:48:44
	# Fork: 1 of 5
	# Warmup Iteration   1: 13404.568 us/op
	# Warmup Iteration   2: 13112.077 us/op
	# Warmup Iteration   3: 13112.819 us/op
	# Warmup Iteration   4: 13271.371 us/op
	# Warmup Iteration   5: 13138.193 us/op
	Iteration   1: 13190.056 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 13060.191 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 13085.714 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 12826.090 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 12549.902 us/op
					 ·stack: <delayed till summary>


	# Run progress: 48.80% complete, ETA 01:47:04
	# Fork: 2 of 5
	# Warmup Iteration   1: 13439.275 us/op
	# Warmup Iteration   2: 13630.552 us/op
	# Warmup Iteration   3: 13876.958 us/op
	# Warmup Iteration   4: 13500.719 us/op
	# Warmup Iteration   5: 13413.524 us/op
	Iteration   1: 13442.931 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 13104.843 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 13062.120 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 13074.574 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 12973.182 us/op
					 ·stack: <delayed till summary>


	# Run progress: 49.60% complete, ETA 01:45:23
	# Fork: 3 of 5
	# Warmup Iteration   1: 13442.206 us/op
	# Warmup Iteration   2: 13234.881 us/op
	# Warmup Iteration   3: 13223.228 us/op
	# Warmup Iteration   4: 13214.050 us/op
	# Warmup Iteration   5: 13258.497 us/op
	Iteration   1: 13080.879 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 12880.605 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 13141.550 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 12856.200 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 12871.804 us/op
					 ·stack: <delayed till summary>


	# Run progress: 50.40% complete, ETA 01:43:43
	# Fork: 4 of 5
	# Warmup Iteration   1: 13709.943 us/op
	# Warmup Iteration   2: 13466.297 us/op
	# Warmup Iteration   3: 13322.095 us/op
	# Warmup Iteration   4: 13311.835 us/op
	# Warmup Iteration   5: 13289.858 us/op
	Iteration   1: 13239.666 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 13188.581 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 12914.713 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 12897.200 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 12797.526 us/op
					 ·stack: <delayed till summary>


	# Run progress: 51.20% complete, ETA 01:42:03
	# Fork: 5 of 5
	# Warmup Iteration   1: 13580.395 us/op
	# Warmup Iteration   2: 13651.913 us/op
	# Warmup Iteration   3: 13938.670 us/op
	# Warmup Iteration   4: 13606.786 us/op
	# Warmup Iteration   5: 13504.439 us/op
	Iteration   1: 13247.625 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 13171.207 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 13369.437 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 13316.496 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 13304.276 us/op
					 ·stack: <delayed till summary>



	Result "com.github.maltalex.lockbenchmark.LockBenchmark.spin_r50_w50":
	  13065.895 ±(99.9%) 155.809 us/op [Average]
	  (min, avg, max) = (12549.902, 13065.895, 13442.931), stdev = 208.001
	  CI (99.9%): [12910.086, 13221.704] (assumes normal distribution)

	Secondary result "com.github.maltalex.lockbenchmark.LockBenchmark.spin_r50_w50:·stack":
	Stack profiler:

	....[Thread state distributions]....................................................................
	 73.8%         RUNNABLE
	 23.1%         WAITING
	  3.1%         TIMED_WAITING

	....[Thread state: RUNNABLE]........................................................................
	 70.6%  95.7% java.lang.Thread.yield
	  3.1%   4.3% com.github.maltalex.lockbenchmark.LockBenchmark.lambda$benchmark$0
	  0.0%   0.0% jdk.internal.misc.Unsafe.unpark
	  0.0%   0.0% java.util.concurrent.locks.AbstractQueuedSynchronizer.release
	  0.0%   0.0% java.util.concurrent.CompletableFuture.postComplete
	  0.0%   0.0% jdk.internal.misc.Unsafe.park
	  0.0%   0.0% java.util.concurrent.ThreadPoolExecutor.runWorker
	  0.0%   0.0% java.lang.Thread.isInterrupted
	  0.0%   0.0% java.util.concurrent.locks.AbstractQueuedSynchronizer.acquire
	  0.0%   0.0% java.util.concurrent.LinkedBlockingQueue.take

	....[Thread state: WAITING].........................................................................
	 23.1% 100.0% jdk.internal.misc.Unsafe.park

	....[Thread state: TIMED_WAITING]...................................................................
	  3.1% 100.0% java.lang.Object.wait



	# JMH version: 1.21
	# VM version: JDK 11.0.7, OpenJDK 64-Bit Server VM, 11.0.7+10-post-Ubuntu-2ubuntu218.04
	# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
	# VM options: <none>
	# Warmup: 5 iterations, 10 s each
	# Measurement: 5 iterations, 10 s each
	# Timeout: 10 min per iteration
	# Threads: 1 thread, will synchronize iterations
	# Benchmark mode: Average time, time/op
	# Benchmark: com.github.maltalex.lockbenchmark.LockBenchmark.spin_r90_w10

	# Run progress: 52.00% complete, ETA 01:40:22
	# Fork: 1 of 5
	# Warmup Iteration   1: 13116.779 us/op
	# Warmup Iteration   2: 10948.337 us/op
	# Warmup Iteration   3: 11114.281 us/op
	# Warmup Iteration   4: 10941.494 us/op
	# Warmup Iteration   5: 10638.904 us/op
	Iteration   1: 10324.765 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 10529.714 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 10237.550 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 9946.474 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 9914.053 us/op
					 ·stack: <delayed till summary>


	# Run progress: 52.80% complete, ETA 01:38:42
	# Fork: 2 of 5
	# Warmup Iteration   1: 12914.051 us/op
	# Warmup Iteration   2: 9851.030 us/op
	# Warmup Iteration   3: 9729.144 us/op
	# Warmup Iteration   4: 10245.919 us/op
	# Warmup Iteration   5: 9842.300 us/op
	Iteration   1: 9523.487 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 9167.020 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 9147.260 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 9055.721 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 8627.261 us/op
					 ·stack: <delayed till summary>


	# Run progress: 53.60% complete, ETA 01:37:01
	# Fork: 3 of 5
	# Warmup Iteration   1: 12957.758 us/op
	# Warmup Iteration   2: 9775.621 us/op
	# Warmup Iteration   3: 9787.182 us/op
	# Warmup Iteration   4: 10028.929 us/op
	# Warmup Iteration   5: 9206.421 us/op
	Iteration   1: 9423.636 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 9047.644 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 8899.396 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 8454.617 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 8776.208 us/op
					 ·stack: <delayed till summary>


	# Run progress: 54.40% complete, ETA 01:35:21
	# Fork: 4 of 5
	# Warmup Iteration   1: 12454.251 us/op
	# Warmup Iteration   2: 10434.663 us/op
	# Warmup Iteration   3: 10383.490 us/op
	# Warmup Iteration   4: 9986.193 us/op
	# Warmup Iteration   5: 9425.132 us/op
	Iteration   1: 9427.723 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 8759.379 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 8587.017 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 8784.382 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 8781.679 us/op
					 ·stack: <delayed till summary>


	# Run progress: 55.20% complete, ETA 01:33:41
	# Fork: 5 of 5
	# Warmup Iteration   1: 12645.073 us/op
	# Warmup Iteration   2: 10714.438 us/op
	# Warmup Iteration   3: 10763.018 us/op
	# Warmup Iteration   4: 10536.426 us/op
	# Warmup Iteration   5: 10266.762 us/op
	Iteration   1: 9816.418 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 9604.020 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 9537.144 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 10218.507 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 10181.796 us/op
					 ·stack: <delayed till summary>



	Result "com.github.maltalex.lockbenchmark.LockBenchmark.spin_r90_w10":
	  9390.915 ±(99.9%) 465.028 us/op [Average]
	  (min, avg, max) = (8454.617, 9390.915, 10529.714), stdev = 620.799
	  CI (99.9%): [8925.887, 9855.943] (assumes normal distribution)

	Secondary result "com.github.maltalex.lockbenchmark.LockBenchmark.spin_r90_w10:·stack":
	Stack profiler:

	....[Thread state distributions]....................................................................
	 71.6%         RUNNABLE
	 25.3%         WAITING
	  3.1%         TIMED_WAITING

	....[Thread state: RUNNABLE]........................................................................
	 64.7%  90.3% java.lang.Thread.yield
	  6.9%   9.6% com.github.maltalex.lockbenchmark.LockBenchmark.lambda$benchmark$0
	  0.0%   0.1% jdk.internal.misc.Unsafe.unpark
	  0.0%   0.0% java.util.concurrent.CompletableFuture.postComplete
	  0.0%   0.0% java.util.concurrent.locks.AbstractQueuedSynchronizer.release
	  0.0%   0.0% jdk.internal.misc.Unsafe.park
	  0.0%   0.0% java.util.concurrent.ThreadPoolExecutor.runWorker
	  0.0%   0.0% java.lang.Thread.isInterrupted
	  0.0%   0.0% java.util.concurrent.locks.AbstractQueuedSynchronizer.acquire
	  0.0%   0.0% java.util.concurrent.LinkedBlockingQueue.take

	....[Thread state: WAITING].........................................................................
	 25.3% 100.0% jdk.internal.misc.Unsafe.park

	....[Thread state: TIMED_WAITING]...................................................................
	  3.1% 100.0% java.lang.Object.wait



	# JMH version: 1.21
	# VM version: JDK 11.0.7, OpenJDK 64-Bit Server VM, 11.0.7+10-post-Ubuntu-2ubuntu218.04
	# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
	# VM options: <none>
	# Warmup: 5 iterations, 10 s each
	# Measurement: 5 iterations, 10 s each
	# Timeout: 10 min per iteration
	# Threads: 1 thread, will synchronize iterations
	# Benchmark mode: Average time, time/op
	# Benchmark: com.github.maltalex.lockbenchmark.LockBenchmark.spin_r80_w20

	# Run progress: 56.00% complete, ETA 01:32:00
	# Fork: 1 of 5
	# Warmup Iteration   1: 12850.471 us/op
	# Warmup Iteration   2: 10780.551 us/op
	# Warmup Iteration   3: 10977.549 us/op
	# Warmup Iteration   4: 10808.496 us/op
	# Warmup Iteration   5: 10360.349 us/op
	Iteration   1: 10435.385 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 10346.645 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 10429.230 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 9772.452 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 9716.897 us/op
					 ·stack: <delayed till summary>


	# Run progress: 56.80% complete, ETA 01:30:20
	# Fork: 2 of 5
	# Warmup Iteration   1: 12746.544 us/op
	# Warmup Iteration   2: 11462.676 us/op
	# Warmup Iteration   3: 10651.269 us/op
	# Warmup Iteration   4: 11043.940 us/op
	# Warmup Iteration   5: 10747.151 us/op
	Iteration   1: 10496.827 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 10230.211 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 10025.321 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 10227.324 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 10439.223 us/op
					 ·stack: <delayed till summary>


	# Run progress: 57.60% complete, ETA 01:28:39
	# Fork: 3 of 5
	# Warmup Iteration   1: 13033.145 us/op
	# Warmup Iteration   2: 11993.950 us/op
	# Warmup Iteration   3: 12073.883 us/op
	# Warmup Iteration   4: 12176.539 us/op
	# Warmup Iteration   5: 11934.148 us/op
	Iteration   1: 11536.261 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 11502.939 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 11250.714 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 11051.621 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 11070.348 us/op
					 ·stack: <delayed till summary>


	# Run progress: 58.40% complete, ETA 01:26:59
	# Fork: 4 of 5
	# Warmup Iteration   1: 13152.848 us/op
	# Warmup Iteration   2: 11117.371 us/op
	# Warmup Iteration   3: 10933.768 us/op
	# Warmup Iteration   4: 10819.344 us/op
	# Warmup Iteration   5: 10627.281 us/op
	Iteration   1: 10344.936 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 10159.695 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 9976.848 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 10488.097 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 10019.433 us/op
					 ·stack: <delayed till summary>


	# Run progress: 59.20% complete, ETA 01:25:18
	# Fork: 5 of 5
	# Warmup Iteration   1: 12971.756 us/op
	# Warmup Iteration   2: 10979.084 us/op
	# Warmup Iteration   3: 11270.881 us/op
	# Warmup Iteration   4: 10891.607 us/op
	# Warmup Iteration   5: 10761.696 us/op
	Iteration   1: 10398.903 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 10543.445 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 10287.096 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 10116.022 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 9918.364 us/op
					 ·stack: <delayed till summary>



	Result "com.github.maltalex.lockbenchmark.LockBenchmark.spin_r80_w20":
	  10431.370 ±(99.9%) 371.228 us/op [Average]
	  (min, avg, max) = (9716.897, 10431.370, 11536.261), stdev = 495.579
	  CI (99.9%): [10060.141, 10802.598] (assumes normal distribution)

	Secondary result "com.github.maltalex.lockbenchmark.LockBenchmark.spin_r80_w20:·stack":
	Stack profiler:

	....[Thread state distributions]....................................................................
	 71.7%         RUNNABLE
	 25.1%         WAITING
	  3.1%         TIMED_WAITING

	....[Thread state: RUNNABLE]........................................................................
	 65.7%  91.6% java.lang.Thread.yield
	  6.0%   8.4% com.github.maltalex.lockbenchmark.LockBenchmark.lambda$benchmark$0
	  0.0%   0.1% jdk.internal.misc.Unsafe.unpark
	  0.0%   0.0% java.util.concurrent.locks.AbstractQueuedSynchronizer.release
	  0.0%   0.0% jdk.internal.misc.Unsafe.park
	  0.0%   0.0% java.util.concurrent.CompletableFuture.postComplete
	  0.0%   0.0% java.util.concurrent.ThreadPoolExecutor.runWorker
	  0.0%   0.0% java.util.concurrent.CompletableFuture.asyncRunStage
	  0.0%   0.0% java.util.concurrent.LinkedBlockingQueue.take
	  0.0%   0.0% java.lang.Thread.isInterrupted

	....[Thread state: WAITING].........................................................................
	 25.1% 100.0% jdk.internal.misc.Unsafe.park

	....[Thread state: TIMED_WAITING]...................................................................
	  3.1% 100.0% java.lang.Object.wait



	# JMH version: 1.21
	# VM version: JDK 11.0.7, OpenJDK 64-Bit Server VM, 11.0.7+10-post-Ubuntu-2ubuntu218.04
	# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
	# VM options: <none>
	# Warmup: 5 iterations, 10 s each
	# Measurement: 5 iterations, 10 s each
	# Timeout: 10 min per iteration
	# Threads: 1 thread, will synchronize iterations
	# Benchmark mode: Average time, time/op
	# Benchmark: com.github.maltalex.lockbenchmark.LockBenchmark.stamped_r0_w100

	# Run progress: 60.00% complete, ETA 01:23:38
	# Fork: 1 of 5
	# Warmup Iteration   1: 12188.864 us/op
	# Warmup Iteration   2: 12689.631 us/op
	# Warmup Iteration   3: 12715.013 us/op
	# Warmup Iteration   4: 12660.194 us/op
	# Warmup Iteration   5: 12753.274 us/op
	Iteration   1: 12780.848 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 12837.362 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 12805.964 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 11316.260 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 10827.197 us/op
					 ·stack: <delayed till summary>


	# Run progress: 60.80% complete, ETA 01:21:58
	# Fork: 2 of 5
	# Warmup Iteration   1: 11678.917 us/op
	# Warmup Iteration   2: 11714.325 us/op
	# Warmup Iteration   3: 11785.000 us/op
	# Warmup Iteration   4: 11778.731 us/op
	# Warmup Iteration   5: 11776.597 us/op
	Iteration   1: 11703.727 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 11743.848 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 11773.748 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 9898.590 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 9511.458 us/op
					 ·stack: <delayed till summary>


	# Run progress: 61.60% complete, ETA 01:20:17
	# Fork: 3 of 5
	# Warmup Iteration   1: 11678.414 us/op
	# Warmup Iteration   2: 10980.915 us/op
	# Warmup Iteration   3: 10936.518 us/op
	# Warmup Iteration   4: 10787.842 us/op
	# Warmup Iteration   5: 10929.260 us/op
	Iteration   1: 10941.653 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 10924.546 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 10944.777 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 10942.954 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 10750.061 us/op
					 ·stack: <delayed till summary>


	# Run progress: 62.40% complete, ETA 01:18:37
	# Fork: 4 of 5
	# Warmup Iteration   1: 11455.662 us/op
	# Warmup Iteration   2: 11867.125 us/op
	# Warmup Iteration   3: 11875.174 us/op
	# Warmup Iteration   4: 11871.310 us/op
	# Warmup Iteration   5: 11633.837 us/op
	Iteration   1: 11724.547 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 11801.193 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 11818.310 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 11783.126 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 11652.903 us/op
					 ·stack: <delayed till summary>


	# Run progress: 63.20% complete, ETA 01:16:57
	# Fork: 5 of 5
	# Warmup Iteration   1: 12025.658 us/op
	# Warmup Iteration   2: 11860.937 us/op
	# Warmup Iteration   3: 11824.214 us/op
	# Warmup Iteration   4: 11910.577 us/op
	# Warmup Iteration   5: 11853.917 us/op
	Iteration   1: 11795.147 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 11703.881 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 11795.787 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 11608.476 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 12317.268 us/op
					 ·stack: <delayed till summary>



	Result "com.github.maltalex.lockbenchmark.LockBenchmark.stamped_r0_w100":
	  11508.145 ±(99.9%) 599.651 us/op [Average]
	  (min, avg, max) = (9511.458, 11508.145, 12837.362), stdev = 800.517
	  CI (99.9%): [10908.494, 12107.797] (assumes normal distribution)

	Secondary result "com.github.maltalex.lockbenchmark.LockBenchmark.stamped_r0_w100:·stack":
	Stack profiler:

	....[Thread state distributions]....................................................................
	 90.0%         WAITING
	  6.9%         RUNNABLE
	  3.1%         TIMED_WAITING

	....[Thread state: WAITING].........................................................................
	 90.0% 100.0% jdk.internal.misc.Unsafe.park

	....[Thread state: RUNNABLE]........................................................................
	  4.6%  66.7% java.lang.Thread.yield
	  1.1%  16.6% jdk.internal.misc.Unsafe.unpark
	  0.7%  10.9% java.util.concurrent.locks.StampedLock.acquireWrite
	  0.3%   3.9% java.util.concurrent.locks.StampedLock.writeLock
	  0.1%   1.6% jdk.internal.misc.Unsafe.park
	  0.0%   0.1% java.util.concurrent.CompletableFuture.postComplete
	  0.0%   0.1% java.util.concurrent.locks.AbstractQueuedSynchronizer.release
	  0.0%   0.0% java.util.concurrent.ThreadPoolExecutor.runWorker
	  0.0%   0.0% java.lang.Thread.isInterrupted
	  0.0%   0.0% java.util.concurrent.LinkedBlockingQueue.take

	....[Thread state: TIMED_WAITING]...................................................................
	  3.1% 100.0% java.lang.Object.wait



	# JMH version: 1.21
	# VM version: JDK 11.0.7, OpenJDK 64-Bit Server VM, 11.0.7+10-post-Ubuntu-2ubuntu218.04
	# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
	# VM options: <none>
	# Warmup: 5 iterations, 10 s each
	# Measurement: 5 iterations, 10 s each
	# Timeout: 10 min per iteration
	# Threads: 1 thread, will synchronize iterations
	# Benchmark mode: Average time, time/op
	# Benchmark: com.github.maltalex.lockbenchmark.LockBenchmark.stamped_r100_w0

	# Run progress: 64.00% complete, ETA 01:15:16
	# Fork: 1 of 5
	# Warmup Iteration   1: 874.863 us/op
	# Warmup Iteration   2: 891.828 us/op
	# Warmup Iteration   3: 883.255 us/op
	# Warmup Iteration   4: 842.715 us/op
	# Warmup Iteration   5: 871.237 us/op
	Iteration   1: 853.504 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 863.426 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 973.483 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 872.262 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 826.418 us/op
					 ·stack: <delayed till summary>


	# Run progress: 64.80% complete, ETA 01:13:36
	# Fork: 2 of 5
	# Warmup Iteration   1: 907.932 us/op
	# Warmup Iteration   2: 851.199 us/op
	# Warmup Iteration   3: 861.061 us/op
	# Warmup Iteration   4: 891.163 us/op
	# Warmup Iteration   5: 868.828 us/op
	Iteration   1: 789.877 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 888.785 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 861.349 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 831.258 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 878.948 us/op
					 ·stack: <delayed till summary>


	# Run progress: 65.60% complete, ETA 01:11:55
	# Fork: 3 of 5
	# Warmup Iteration   1: 886.606 us/op
	# Warmup Iteration   2: 817.520 us/op
	# Warmup Iteration   3: 896.248 us/op
	# Warmup Iteration   4: 873.728 us/op
	# Warmup Iteration   5: 787.705 us/op
	Iteration   1: 890.048 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 857.526 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 827.993 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 909.117 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 866.229 us/op
					 ·stack: <delayed till summary>


	# Run progress: 66.40% complete, ETA 01:10:15
	# Fork: 4 of 5
	# Warmup Iteration   1: 868.906 us/op
	# Warmup Iteration   2: 914.941 us/op
	# Warmup Iteration   3: 869.771 us/op
	# Warmup Iteration   4: 804.604 us/op
	# Warmup Iteration   5: 857.985 us/op
	Iteration   1: 870.356 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 796.596 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 902.381 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 894.634 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 820.033 us/op
					 ·stack: <delayed till summary>


	# Run progress: 67.20% complete, ETA 01:08:35
	# Fork: 5 of 5
	# Warmup Iteration   1: 917.502 us/op
	# Warmup Iteration   2: 835.594 us/op
	# Warmup Iteration   3: 821.831 us/op
	# Warmup Iteration   4: 903.851 us/op
	# Warmup Iteration   5: 889.051 us/op
	Iteration   1: 824.391 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 894.824 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 881.067 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 833.069 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 870.977 us/op
					 ·stack: <delayed till summary>



	Result "com.github.maltalex.lockbenchmark.LockBenchmark.stamped_r100_w0":
	  863.142 ±(99.9%) 29.717 us/op [Average]
	  (min, avg, max) = (789.877, 863.142, 973.483), stdev = 39.671
	  CI (99.9%): [833.425, 892.859] (assumes normal distribution)

	Secondary result "com.github.maltalex.lockbenchmark.LockBenchmark.stamped_r100_w0:·stack":
	Stack profiler:

	....[Thread state distributions]....................................................................
	 54.9%         WAITING
	 42.0%         RUNNABLE
	  3.1%         TIMED_WAITING

	....[Thread state: WAITING].........................................................................
	 54.9% 100.0% jdk.internal.misc.Unsafe.park

	....[Thread state: RUNNABLE]........................................................................
	 40.1%  95.6% java.lang.Thread.yield
	  1.3%   3.1% com.github.maltalex.lockbenchmark.LockBenchmark.lambda$benchmark$0
	  0.3%   0.8% jdk.internal.misc.Unsafe.unpark
	  0.1%   0.2% java.util.concurrent.CompletableFuture.postComplete
	  0.1%   0.1% java.util.concurrent.locks.AbstractQueuedSynchronizer.release
	  0.0%   0.1% jdk.internal.misc.Unsafe.park
	  0.0%   0.1% java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await
	  0.0%   0.0% java.util.concurrent.ThreadPoolExecutor.runWorker
	  0.0%   0.0% java.util.concurrent.CompletableFuture.andTree
	  0.0%   0.0% java.util.concurrent.CompletableFuture.runAsync

	....[Thread state: TIMED_WAITING]...................................................................
	  3.1% 100.0% java.lang.Object.wait



	# JMH version: 1.21
	# VM version: JDK 11.0.7, OpenJDK 64-Bit Server VM, 11.0.7+10-post-Ubuntu-2ubuntu218.04
	# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
	# VM options: <none>
	# Warmup: 5 iterations, 10 s each
	# Measurement: 5 iterations, 10 s each
	# Timeout: 10 min per iteration
	# Threads: 1 thread, will synchronize iterations
	# Benchmark mode: Average time, time/op
	# Benchmark: com.github.maltalex.lockbenchmark.LockBenchmark.stamped_r50_w50

	# Run progress: 68.00% complete, ETA 01:06:54
	# Fork: 1 of 5
	# Warmup Iteration   1: 9570.650 us/op
	# Warmup Iteration   2: 9512.365 us/op
	# Warmup Iteration   3: 9426.495 us/op
	# Warmup Iteration   4: 9411.448 us/op
	# Warmup Iteration   5: 9421.188 us/op
	Iteration   1: 9396.457 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 9408.565 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 9471.169 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 9402.042 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 9452.037 us/op
					 ·stack: <delayed till summary>


	# Run progress: 68.80% complete, ETA 01:05:14
	# Fork: 2 of 5
	# Warmup Iteration   1: 9092.663 us/op
	# Warmup Iteration   2: 8434.726 us/op
	# Warmup Iteration   3: 8421.533 us/op
	# Warmup Iteration   4: 8364.606 us/op
	# Warmup Iteration   5: 8290.875 us/op
	Iteration   1: 8360.916 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 8396.726 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 8401.030 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 8606.785 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 9173.250 us/op
					 ·stack: <delayed till summary>


	# Run progress: 69.60% complete, ETA 01:03:34
	# Fork: 3 of 5
	# Warmup Iteration   1: 9537.629 us/op
	# Warmup Iteration   2: 9308.356 us/op
	# Warmup Iteration   3: 9360.023 us/op
	# Warmup Iteration   4: 9344.132 us/op
	# Warmup Iteration   5: 9357.843 us/op
	Iteration   1: 9322.326 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 9462.536 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 9338.894 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 9343.374 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 9268.764 us/op
					 ·stack: <delayed till summary>


	# Run progress: 70.40% complete, ETA 01:01:53
	# Fork: 4 of 5
	# Warmup Iteration   1: 8682.041 us/op
	# Warmup Iteration   2: 7888.196 us/op
	# Warmup Iteration   3: 7852.283 us/op
	# Warmup Iteration   4: 7865.191 us/op
	# Warmup Iteration   5: 7860.702 us/op
	Iteration   1: 7923.084 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 7904.873 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 7884.899 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 8564.856 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 9185.946 us/op
					 ·stack: <delayed till summary>


	# Run progress: 71.20% complete, ETA 01:00:13
	# Fork: 5 of 5
	# Warmup Iteration   1: 9333.331 us/op
	# Warmup Iteration   2: 9414.760 us/op
	# Warmup Iteration   3: 9363.283 us/op
	# Warmup Iteration   4: 9343.188 us/op
	# Warmup Iteration   5: 9306.297 us/op
	Iteration   1: 9359.465 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 9301.522 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 9373.754 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 9183.681 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 9276.353 us/op
					 ·stack: <delayed till summary>



	Result "com.github.maltalex.lockbenchmark.LockBenchmark.stamped_r50_w50":
	  8990.532 ±(99.9%) 408.712 us/op [Average]
	  (min, avg, max) = (7884.899, 8990.532, 9471.169), stdev = 545.618
	  CI (99.9%): [8581.820, 9399.244] (assumes normal distribution)

	Secondary result "com.github.maltalex.lockbenchmark.LockBenchmark.stamped_r50_w50:·stack":
	Stack profiler:

	....[Thread state distributions]....................................................................
	 87.7%         WAITING
	  9.2%         RUNNABLE
	  3.1%         TIMED_WAITING

	....[Thread state: WAITING].........................................................................
	 87.7% 100.0% jdk.internal.misc.Unsafe.park

	....[Thread state: RUNNABLE]........................................................................
	  5.2%  56.8% java.lang.Thread.yield
	  1.6%  17.7% jdk.internal.misc.Unsafe.unpark
	  0.7%   7.3% java.util.concurrent.locks.StampedLock.acquireRead
	  0.5%   6.0% java.util.concurrent.locks.StampedLock.acquireWrite
	  0.4%   4.0% com.github.maltalex.lockbenchmark.LockBenchmark.lambda$benchmark$0
	  0.3%   3.7% jdk.internal.misc.Unsafe.park
	  0.1%   1.6% java.util.concurrent.locks.StampedLock.writeLock
	  0.1%   1.3% java.util.concurrent.locks.StampedLock.unlockRead
	  0.1%   1.2% java.util.concurrent.locks.StampedLock.readLock
	  0.0%   0.1% java.util.concurrent.CompletableFuture.postComplete
	  0.0%   0.3% <other>

	....[Thread state: TIMED_WAITING]...................................................................
	  3.1% 100.0% java.lang.Object.wait



	# JMH version: 1.21
	# VM version: JDK 11.0.7, OpenJDK 64-Bit Server VM, 11.0.7+10-post-Ubuntu-2ubuntu218.04
	# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
	# VM options: <none>
	# Warmup: 5 iterations, 10 s each
	# Measurement: 5 iterations, 10 s each
	# Timeout: 10 min per iteration
	# Threads: 1 thread, will synchronize iterations
	# Benchmark mode: Average time, time/op
	# Benchmark: com.github.maltalex.lockbenchmark.LockBenchmark.stamped_r80_w20

	# Run progress: 72.00% complete, ETA 00:58:32
	# Fork: 1 of 5
	# Warmup Iteration   1: 5756.506 us/op
	# Warmup Iteration   2: 5531.372 us/op
	# Warmup Iteration   3: 5510.061 us/op
	# Warmup Iteration   4: 5513.344 us/op
	# Warmup Iteration   5: 5526.556 us/op
	Iteration   1: 5497.245 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 5508.257 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 5841.900 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 5919.289 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 5920.978 us/op
					 ·stack: <delayed till summary>


	# Run progress: 72.80% complete, ETA 00:56:52
	# Fork: 2 of 5
	# Warmup Iteration   1: 5968.724 us/op
	# Warmup Iteration   2: 5898.479 us/op
	# Warmup Iteration   3: 5930.286 us/op
	# Warmup Iteration   4: 5940.767 us/op
	# Warmup Iteration   5: 5893.084 us/op
	Iteration   1: 5859.974 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 5879.651 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 5868.648 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 5912.323 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 5897.462 us/op
					 ·stack: <delayed till summary>


	# Run progress: 73.60% complete, ETA 00:55:12
	# Fork: 3 of 5
	# Warmup Iteration   1: 5912.156 us/op
	# Warmup Iteration   2: 5807.161 us/op
	# Warmup Iteration   3: 5793.122 us/op
	# Warmup Iteration   4: 5807.311 us/op
	# Warmup Iteration   5: 5799.009 us/op
	Iteration   1: 5725.438 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 5779.489 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 6012.232 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 5961.457 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 5988.060 us/op
					 ·stack: <delayed till summary>


	# Run progress: 74.40% complete, ETA 00:53:31
	# Fork: 4 of 5
	# Warmup Iteration   1: 6064.994 us/op
	# Warmup Iteration   2: 5974.651 us/op
	# Warmup Iteration   3: 5948.610 us/op
	# Warmup Iteration   4: 5961.014 us/op
	# Warmup Iteration   5: 6001.743 us/op
	Iteration   1: 5953.780 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 6029.425 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 5965.973 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 5934.242 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 5891.857 us/op
					 ·stack: <delayed till summary>


	# Run progress: 75.20% complete, ETA 00:51:51
	# Fork: 5 of 5
	# Warmup Iteration   1: 5980.191 us/op
	# Warmup Iteration   2: 5893.986 us/op
	# Warmup Iteration   3: 5882.787 us/op
	# Warmup Iteration   4: 5894.170 us/op
	# Warmup Iteration   5: 5859.280 us/op
	Iteration   1: 5857.320 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 5917.556 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 5863.743 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 5909.744 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 5872.494 us/op
					 ·stack: <delayed till summary>



	Result "com.github.maltalex.lockbenchmark.LockBenchmark.stamped_r80_w20":
	  5870.741 ±(99.9%) 96.738 us/op [Average]
	  (min, avg, max) = (5497.245, 5870.741, 6029.425), stdev = 129.143
	  CI (99.9%): [5774.003, 5967.480] (assumes normal distribution)

	Secondary result "com.github.maltalex.lockbenchmark.LockBenchmark.stamped_r80_w20:·stack":
	Stack profiler:

	....[Thread state distributions]....................................................................
	 83.9%         WAITING
	 13.0%         RUNNABLE
	  3.1%         TIMED_WAITING

	....[Thread state: WAITING].........................................................................
	 83.9% 100.0% jdk.internal.misc.Unsafe.park

	....[Thread state: RUNNABLE]........................................................................
	  6.9%  53.5% java.lang.Thread.yield
	  2.1%  16.5% jdk.internal.misc.Unsafe.unpark
	  1.4%  10.9% java.util.concurrent.locks.StampedLock.acquireRead
	  0.9%   6.8% com.github.maltalex.lockbenchmark.LockBenchmark.lambda$benchmark$0
	  0.6%   4.8% jdk.internal.misc.Unsafe.park
	  0.5%   3.5% java.util.concurrent.locks.StampedLock.acquireWrite
	  0.2%   1.4% java.util.concurrent.locks.StampedLock.readLock
	  0.2%   1.4% java.util.concurrent.locks.StampedLock.unlockRead
	  0.1%   0.8% java.util.concurrent.locks.StampedLock.writeLock
	  0.0%   0.1% java.util.concurrent.CompletableFuture.postComplete
	  0.0%   0.2% <other>

	....[Thread state: TIMED_WAITING]...................................................................
	  3.1% 100.0% java.lang.Object.wait



	# JMH version: 1.21
	# VM version: JDK 11.0.7, OpenJDK 64-Bit Server VM, 11.0.7+10-post-Ubuntu-2ubuntu218.04
	# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
	# VM options: <none>
	# Warmup: 5 iterations, 10 s each
	# Measurement: 5 iterations, 10 s each
	# Timeout: 10 min per iteration
	# Threads: 1 thread, will synchronize iterations
	# Benchmark mode: Average time, time/op
	# Benchmark: com.github.maltalex.lockbenchmark.LockBenchmark.stamped_r90_w10

	# Run progress: 76.00% complete, ETA 00:50:11
	# Fork: 1 of 5
	# Warmup Iteration   1: 4434.446 us/op
	# Warmup Iteration   2: 4352.629 us/op
	# Warmup Iteration   3: 4383.271 us/op
	# Warmup Iteration   4: 4382.203 us/op
	# Warmup Iteration   5: 4413.734 us/op
	Iteration   1: 4404.714 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 4420.964 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 4399.999 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 4393.868 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 4400.490 us/op
					 ·stack: <delayed till summary>


	# Run progress: 76.80% complete, ETA 00:48:30
	# Fork: 2 of 5
	# Warmup Iteration   1: 4537.820 us/op
	# Warmup Iteration   2: 4467.339 us/op
	# Warmup Iteration   3: 4419.825 us/op
	# Warmup Iteration   4: 4475.545 us/op
	# Warmup Iteration   5: 4412.006 us/op
	Iteration   1: 4445.304 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 4417.088 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 4356.246 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 4346.537 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 4342.772 us/op
					 ·stack: <delayed till summary>


	# Run progress: 77.60% complete, ETA 00:46:50
	# Fork: 3 of 5
	# Warmup Iteration   1: 4289.749 us/op
	# Warmup Iteration   2: 4119.029 us/op
	# Warmup Iteration   3: 4082.340 us/op
	# Warmup Iteration   4: 4103.728 us/op
	# Warmup Iteration   5: 4073.874 us/op
	Iteration   1: 4075.262 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 4180.416 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 4211.887 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 4188.117 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 4206.983 us/op
					 ·stack: <delayed till summary>


	# Run progress: 78.40% complete, ETA 00:45:10
	# Fork: 4 of 5
	# Warmup Iteration   1: 4492.351 us/op
	# Warmup Iteration   2: 4339.189 us/op
	# Warmup Iteration   3: 4384.781 us/op
	# Warmup Iteration   4: 4380.568 us/op
	# Warmup Iteration   5: 4353.854 us/op
	Iteration   1: 4384.730 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 4373.582 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 4421.745 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 4415.212 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 4425.346 us/op
					 ·stack: <delayed till summary>


	# Run progress: 79.20% complete, ETA 00:43:29
	# Fork: 5 of 5
	# Warmup Iteration   1: 4394.349 us/op
	# Warmup Iteration   2: 4351.397 us/op
	# Warmup Iteration   3: 4340.438 us/op
	# Warmup Iteration   4: 4349.141 us/op
	# Warmup Iteration   5: 4332.149 us/op
	Iteration   1: 4370.764 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 4313.455 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 4315.905 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 4324.593 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 4299.986 us/op
					 ·stack: <delayed till summary>



	Result "com.github.maltalex.lockbenchmark.LockBenchmark.stamped_r90_w10":
	  4337.439 ±(99.9%) 71.332 us/op [Average]
	  (min, avg, max) = (4075.262, 4337.439, 4445.304), stdev = 95.227
	  CI (99.9%): [4266.106, 4408.771] (assumes normal distribution)

	Secondary result "com.github.maltalex.lockbenchmark.LockBenchmark.stamped_r90_w10:·stack":
	Stack profiler:

	....[Thread state distributions]....................................................................
	 80.7%         WAITING
	 16.1%         RUNNABLE
	  3.1%         TIMED_WAITING

	....[Thread state: WAITING].........................................................................
	 80.7% 100.0% jdk.internal.misc.Unsafe.park

	....[Thread state: RUNNABLE]........................................................................
	  8.3%  51.2% java.lang.Thread.yield
	  2.6%  16.2% jdk.internal.misc.Unsafe.unpark
	  2.1%  12.8% java.util.concurrent.locks.StampedLock.acquireRead
	  1.3%   7.8% com.github.maltalex.lockbenchmark.LockBenchmark.lambda$benchmark$0
	  0.9%   5.5% jdk.internal.misc.Unsafe.park
	  0.4%   2.4% java.util.concurrent.locks.StampedLock.acquireWrite
	  0.3%   1.7% java.util.concurrent.locks.StampedLock.readLock
	  0.3%   1.6% java.util.concurrent.locks.StampedLock.unlockRead
	  0.1%   0.5% java.util.concurrent.locks.StampedLock.writeLock
	  0.0%   0.1% java.util.concurrent.CompletableFuture.postComplete
	  0.0%   0.2% <other>

	....[Thread state: TIMED_WAITING]...................................................................
	  3.1% 100.0% java.lang.Object.wait



	# JMH version: 1.21
	# VM version: JDK 11.0.7, OpenJDK 64-Bit Server VM, 11.0.7+10-post-Ubuntu-2ubuntu218.04
	# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
	# VM options: <none>
	# Warmup: 5 iterations, 10 s each
	# Measurement: 5 iterations, 10 s each
	# Timeout: 10 min per iteration
	# Threads: 1 thread, will synchronize iterations
	# Benchmark mode: Average time, time/op
	# Benchmark: com.github.maltalex.lockbenchmark.LockBenchmark.synchronized_r0_w100

	# Run progress: 80.00% complete, ETA 00:41:49
	# Fork: 1 of 5
	# Warmup Iteration   1: 13497.750 us/op
	# Warmup Iteration   2: 15229.500 us/op
	# Warmup Iteration   3: 15204.300 us/op
	# Warmup Iteration   4: 15492.054 us/op
	# Warmup Iteration   5: 15452.022 us/op
	Iteration   1: 15420.583 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 15424.176 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 15421.970 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 15308.292 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 15132.011 us/op
					 ·stack: <delayed till summary>


	# Run progress: 80.80% complete, ETA 00:40:08
	# Fork: 2 of 5
	# Warmup Iteration   1: 13813.503 us/op
	# Warmup Iteration   2: 15564.098 us/op
	# Warmup Iteration   3: 15635.649 us/op
	# Warmup Iteration   4: 15619.761 us/op
	# Warmup Iteration   5: 15740.985 us/op
	Iteration   1: 15579.748 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 15248.106 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 15574.769 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 15628.689 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 15537.712 us/op
					 ·stack: <delayed till summary>


	# Run progress: 81.60% complete, ETA 00:38:28
	# Fork: 3 of 5
	# Warmup Iteration   1: 13728.224 us/op
	# Warmup Iteration   2: 15817.233 us/op
	# Warmup Iteration   3: 15706.782 us/op
	# Warmup Iteration   4: 15709.735 us/op
	# Warmup Iteration   5: 15200.917 us/op
	Iteration   1: 15515.128 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 15448.847 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 15329.953 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 15578.698 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 15584.468 us/op
					 ·stack: <delayed till summary>


	# Run progress: 82.40% complete, ETA 00:36:48
	# Fork: 4 of 5
	# Warmup Iteration   1: 14071.409 us/op
	# Warmup Iteration   2: 15496.607 us/op
	# Warmup Iteration   3: 15457.739 us/op
	# Warmup Iteration   4: 15585.254 us/op
	# Warmup Iteration   5: 15542.630 us/op
	Iteration   1: 15535.629 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 15299.446 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 14993.340 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 15444.650 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 15570.026 us/op
					 ·stack: <delayed till summary>


	# Run progress: 83.20% complete, ETA 00:35:07
	# Fork: 5 of 5
	# Warmup Iteration   1: 13651.014 us/op
	# Warmup Iteration   2: 15829.835 us/op
	# Warmup Iteration   3: 15754.170 us/op
	# Warmup Iteration   4: 15315.571 us/op
	# Warmup Iteration   5: 15403.592 us/op
	Iteration   1: 15627.975 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 15409.007 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 14693.018 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 15443.566 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 15364.921 us/op
					 ·stack: <delayed till summary>



	Result "com.github.maltalex.lockbenchmark.LockBenchmark.synchronized_r0_w100":
	  15404.589 ±(99.9%) 160.709 us/op [Average]
	  (min, avg, max) = (14693.018, 15404.589, 15628.689), stdev = 214.542
	  CI (99.9%): [15243.880, 15565.298] (assumes normal distribution)

	Secondary result "com.github.maltalex.lockbenchmark.LockBenchmark.synchronized_r0_w100:·stack":
	Stack profiler:

	....[Thread state distributions]....................................................................
	 68.8%         BLOCKED
	 19.2%         WAITING
	  8.9%         RUNNABLE
	  3.1%         TIMED_WAITING

	....[Thread state: BLOCKED].........................................................................
	 68.8% 100.0% com.github.maltalex.lockbenchmark.LockBenchmark$SynchronizedData.write

	....[Thread state: WAITING].........................................................................
	 19.2% 100.0% jdk.internal.misc.Unsafe.park

	....[Thread state: RUNNABLE]........................................................................
	  5.7%  64.4% java.lang.Thread.yield
	  3.1%  35.0% com.github.maltalex.lockbenchmark.LockBenchmark$SynchronizedData.write
	  0.0%   0.3% jdk.internal.misc.Unsafe.unpark
	  0.0%   0.1% java.util.concurrent.locks.AbstractQueuedSynchronizer.release
	  0.0%   0.0% java.util.concurrent.CompletableFuture.postComplete
	  0.0%   0.0% java.util.concurrent.ThreadPoolExecutor.runWorker
	  0.0%   0.0% jdk.internal.misc.Unsafe.park
	  0.0%   0.0% java.util.concurrent.CompletableFuture.runAsync
	  0.0%   0.0% java.lang.Thread.isInterrupted
	  0.0%   0.0% java.util.concurrent.LinkedBlockingQueue.take

	....[Thread state: TIMED_WAITING]...................................................................
	  3.1% 100.0% java.lang.Object.wait



	# JMH version: 1.21
	# VM version: JDK 11.0.7, OpenJDK 64-Bit Server VM, 11.0.7+10-post-Ubuntu-2ubuntu218.04
	# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
	# VM options: <none>
	# Warmup: 5 iterations, 10 s each
	# Measurement: 5 iterations, 10 s each
	# Timeout: 10 min per iteration
	# Threads: 1 thread, will synchronize iterations
	# Benchmark mode: Average time, time/op
	# Benchmark: com.github.maltalex.lockbenchmark.LockBenchmark.synchronized_r100_w0

	# Run progress: 84.00% complete, ETA 00:33:27
	# Fork: 1 of 5
	# Warmup Iteration   1: 8415.889 us/op
	# Warmup Iteration   2: 8332.231 us/op
	# Warmup Iteration   3: 8295.235 us/op
	# Warmup Iteration   4: 8379.983 us/op
	# Warmup Iteration   5: 8402.228 us/op
	Iteration   1: 8432.486 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 8470.771 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 8462.523 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 8488.462 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 8494.637 us/op
					 ·stack: <delayed till summary>


	# Run progress: 84.80% complete, ETA 00:31:47
	# Fork: 2 of 5
	# Warmup Iteration   1: 8420.296 us/op
	# Warmup Iteration   2: 8447.380 us/op
	# Warmup Iteration   3: 8399.648 us/op
	# Warmup Iteration   4: 8484.136 us/op
	# Warmup Iteration   5: 8534.160 us/op
	Iteration   1: 8571.867 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 8592.982 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 8629.689 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 8612.760 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 8607.592 us/op
					 ·stack: <delayed till summary>


	# Run progress: 85.60% complete, ETA 00:30:06
	# Fork: 3 of 5
	# Warmup Iteration   1: 8565.071 us/op
	# Warmup Iteration   2: 8488.432 us/op
	# Warmup Iteration   3: 8501.252 us/op
	# Warmup Iteration   4: 8512.966 us/op
	# Warmup Iteration   5: 8553.329 us/op
	Iteration   1: 8588.457 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 8634.832 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 8650.104 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 8663.081 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 8735.710 us/op
					 ·stack: <delayed till summary>


	# Run progress: 86.40% complete, ETA 00:28:26
	# Fork: 4 of 5
	# Warmup Iteration   1: 8497.126 us/op
	# Warmup Iteration   2: 8494.333 us/op
	# Warmup Iteration   3: 8454.375 us/op
	# Warmup Iteration   4: 8528.552 us/op
	# Warmup Iteration   5: 8582.998 us/op
	Iteration   1: 8573.992 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 8557.503 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 8610.583 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 8672.542 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 8705.430 us/op
					 ·stack: <delayed till summary>


	# Run progress: 87.20% complete, ETA 00:26:45
	# Fork: 5 of 5
	# Warmup Iteration   1: 8386.682 us/op
	# Warmup Iteration   2: 8335.877 us/op
	# Warmup Iteration   3: 8382.407 us/op
	# Warmup Iteration   4: 8367.728 us/op
	# Warmup Iteration   5: 8428.240 us/op
	Iteration   1: 8459.211 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 8449.483 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 8488.460 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 8468.806 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 8498.591 us/op
					 ·stack: <delayed till summary>



	Result "com.github.maltalex.lockbenchmark.LockBenchmark.synchronized_r100_w0":
	  8564.822 ±(99.9%) 65.918 us/op [Average]
	  (min, avg, max) = (8432.486, 8564.822, 8735.710), stdev = 87.998
	  CI (99.9%): [8498.905, 8630.740] (assumes normal distribution)

	Secondary result "com.github.maltalex.lockbenchmark.LockBenchmark.synchronized_r100_w0:·stack":
	Stack profiler:

	....[Thread state distributions]....................................................................
	 64.8%         BLOCKED
	 21.5%         WAITING
	 10.6%         RUNNABLE
	  3.1%         TIMED_WAITING

	....[Thread state: BLOCKED].........................................................................
	 64.8% 100.0% com.github.maltalex.lockbenchmark.LockBenchmark$SynchronizedData.read

	....[Thread state: WAITING].........................................................................
	 21.5% 100.0% jdk.internal.misc.Unsafe.park

	....[Thread state: RUNNABLE]........................................................................
	  4.5%  42.2% java.lang.Thread.yield
	  3.1%  29.1% com.github.maltalex.lockbenchmark.LockBenchmark$SynchronizedData.read
	  3.0%  27.9% com.github.maltalex.lockbenchmark.LockBenchmark.lambda$benchmark$0
	  0.0%   0.4% jdk.internal.misc.Unsafe.unpark
	  0.0%   0.1% java.util.concurrent.CompletableFuture.postComplete
	  0.0%   0.1% java.util.concurrent.locks.AbstractQueuedSynchronizer.release
	  0.0%   0.0% jdk.internal.misc.Unsafe.park
	  0.0%   0.0% java.util.concurrent.ThreadPoolExecutor.runWorker
	  0.0%   0.0% java.util.concurrent.CompletableFuture.asyncRunStage
	  0.0%   0.0% java.util.concurrent.LinkedBlockingQueue.take
	  0.0%   0.1% <other>

	....[Thread state: TIMED_WAITING]...................................................................
	  3.1% 100.0% java.lang.Object.wait



	# JMH version: 1.21
	# VM version: JDK 11.0.7, OpenJDK 64-Bit Server VM, 11.0.7+10-post-Ubuntu-2ubuntu218.04
	# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
	# VM options: <none>
	# Warmup: 5 iterations, 10 s each
	# Measurement: 5 iterations, 10 s each
	# Timeout: 10 min per iteration
	# Threads: 1 thread, will synchronize iterations
	# Benchmark mode: Average time, time/op
	# Benchmark: com.github.maltalex.lockbenchmark.LockBenchmark.synchronized_r50_w50

	# Run progress: 88.00% complete, ETA 00:25:05
	# Fork: 1 of 5
	# Warmup Iteration   1: 13926.824 us/op
	# Warmup Iteration   2: 14157.733 us/op
	# Warmup Iteration   3: 14246.562 us/op
	# Warmup Iteration   4: 14082.182 us/op
	# Warmup Iteration   5: 14076.822 us/op
	Iteration   1: 14014.202 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 14197.037 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 14152.348 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 14123.334 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 14041.500 us/op
					 ·stack: <delayed till summary>


	# Run progress: 88.80% complete, ETA 00:23:25
	# Fork: 2 of 5
	# Warmup Iteration   1: 13869.400 us/op
	# Warmup Iteration   2: 13940.874 us/op
	# Warmup Iteration   3: 13793.564 us/op
	# Warmup Iteration   4: 13780.828 us/op
	# Warmup Iteration   5: 13922.231 us/op
	Iteration   1: 13938.399 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 14035.615 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 14079.029 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 13976.992 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 13629.069 us/op
					 ·stack: <delayed till summary>


	# Run progress: 89.60% complete, ETA 00:21:44
	# Fork: 3 of 5
	# Warmup Iteration   1: 14016.302 us/op
	# Warmup Iteration   2: 14231.584 us/op
	# Warmup Iteration   3: 14209.047 us/op
	# Warmup Iteration   4: 14238.484 us/op
	# Warmup Iteration   5: 14314.982 us/op
	Iteration   1: 14293.516 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 14261.802 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 14277.112 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 14252.041 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 13719.379 us/op
					 ·stack: <delayed till summary>


	# Run progress: 90.40% complete, ETA 00:20:04
	# Fork: 4 of 5
	# Warmup Iteration   1: 13135.966 us/op
	# Warmup Iteration   2: 13354.215 us/op
	# Warmup Iteration   3: 13369.416 us/op
	# Warmup Iteration   4: 13318.259 us/op
	# Warmup Iteration   5: 13332.000 us/op
	Iteration   1: 13323.966 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 13305.725 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 13169.585 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 13254.268 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 13363.001 us/op
					 ·stack: <delayed till summary>


	# Run progress: 91.20% complete, ETA 00:18:24
	# Fork: 5 of 5
	# Warmup Iteration   1: 13846.676 us/op
	# Warmup Iteration   2: 13957.584 us/op
	# Warmup Iteration   3: 14011.662 us/op
	# Warmup Iteration   4: 13996.840 us/op
	# Warmup Iteration   5: 14001.924 us/op
	Iteration   1: 13962.657 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 13870.296 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 14017.945 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 14046.055 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 13950.499 us/op
					 ·stack: <delayed till summary>



	Result "com.github.maltalex.lockbenchmark.LockBenchmark.synchronized_r50_w50":
	  13890.215 ±(99.9%) 261.045 us/op [Average]
	  (min, avg, max) = (13169.585, 13890.215, 14293.516), stdev = 348.488
	  CI (99.9%): [13629.169, 14151.260] (assumes normal distribution)

	Secondary result "com.github.maltalex.lockbenchmark.LockBenchmark.synchronized_r50_w50:·stack":
	Stack profiler:

	....[Thread state distributions]....................................................................
	 67.4%         BLOCKED
	 20.4%         WAITING
	  9.1%         RUNNABLE
	  3.1%         TIMED_WAITING

	....[Thread state: BLOCKED].........................................................................
	 36.4%  54.0% com.github.maltalex.lockbenchmark.LockBenchmark$SynchronizedData.write
	 31.0%  46.0% com.github.maltalex.lockbenchmark.LockBenchmark$SynchronizedData.read

	....[Thread state: WAITING].........................................................................
	 20.4% 100.0% jdk.internal.misc.Unsafe.park

	....[Thread state: RUNNABLE]........................................................................
	  4.8%  52.4% java.lang.Thread.yield
	  1.7%  18.3% com.github.maltalex.lockbenchmark.LockBenchmark$SynchronizedData.write
	  1.4%  15.8% com.github.maltalex.lockbenchmark.LockBenchmark$SynchronizedData.read
	  1.2%  12.9% com.github.maltalex.lockbenchmark.LockBenchmark.lambda$benchmark$0
	  0.0%   0.3% jdk.internal.misc.Unsafe.unpark
	  0.0%   0.1% java.util.concurrent.CompletableFuture.postComplete
	  0.0%   0.1% java.util.concurrent.locks.AbstractQueuedSynchronizer.release
	  0.0%   0.0% jdk.internal.misc.Unsafe.park
	  0.0%   0.0% java.util.concurrent.ThreadPoolExecutor.runWorker
	  0.0%   0.0% java.util.concurrent.CompletableFuture.runAsync

	....[Thread state: TIMED_WAITING]...................................................................
	  3.1% 100.0% java.lang.Object.wait



	# JMH version: 1.21
	# VM version: JDK 11.0.7, OpenJDK 64-Bit Server VM, 11.0.7+10-post-Ubuntu-2ubuntu218.04
	# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
	# VM options: <none>
	# Warmup: 5 iterations, 10 s each
	# Measurement: 5 iterations, 10 s each
	# Timeout: 10 min per iteration
	# Threads: 1 thread, will synchronize iterations
	# Benchmark mode: Average time, time/op
	# Benchmark: com.github.maltalex.lockbenchmark.LockBenchmark.synchronized_r80_w20

	# Run progress: 92.00% complete, ETA 00:16:43
	# Fork: 1 of 5
	# Warmup Iteration   1: 11515.028 us/op
	# Warmup Iteration   2: 11408.425 us/op
	# Warmup Iteration   3: 11239.011 us/op
	# Warmup Iteration   4: 11308.502 us/op
	# Warmup Iteration   5: 11407.820 us/op
	Iteration   1: 11491.782 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 11502.648 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 11463.853 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 11518.518 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 11511.868 us/op
					 ·stack: <delayed till summary>


	# Run progress: 92.80% complete, ETA 00:15:03
	# Fork: 2 of 5
	# Warmup Iteration   1: 11601.731 us/op
	# Warmup Iteration   2: 11170.925 us/op
	# Warmup Iteration   3: 11359.965 us/op
	# Warmup Iteration   4: 11323.679 us/op
	# Warmup Iteration   5: 11356.285 us/op
	Iteration   1: 11389.917 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 11299.113 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 11316.324 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 11303.077 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 11285.430 us/op
					 ·stack: <delayed till summary>


	# Run progress: 93.60% complete, ETA 00:13:22
	# Fork: 3 of 5
	# Warmup Iteration   1: 11558.473 us/op
	# Warmup Iteration   2: 11171.875 us/op
	# Warmup Iteration   3: 11262.489 us/op
	# Warmup Iteration   4: 11231.347 us/op
	# Warmup Iteration   5: 11253.047 us/op
	Iteration   1: 11307.965 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 11368.538 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 11316.640 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 11268.544 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 11370.671 us/op
					 ·stack: <delayed till summary>


	# Run progress: 94.40% complete, ETA 00:11:42
	# Fork: 4 of 5
	# Warmup Iteration   1: 11478.707 us/op
	# Warmup Iteration   2: 11346.298 us/op
	# Warmup Iteration   3: 11278.460 us/op
	# Warmup Iteration   4: 11206.654 us/op
	# Warmup Iteration   5: 11238.378 us/op
	Iteration   1: 11320.706 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 11313.041 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 11309.206 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 11330.322 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 11391.116 us/op
					 ·stack: <delayed till summary>


	# Run progress: 95.20% complete, ETA 00:10:02
	# Fork: 5 of 5
	# Warmup Iteration   1: 11736.008 us/op
	# Warmup Iteration   2: 11682.062 us/op
	# Warmup Iteration   3: 11623.342 us/op
	# Warmup Iteration   4: 11748.862 us/op
	# Warmup Iteration   5: 11682.918 us/op
	Iteration   1: 11746.450 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 11705.975 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 11861.441 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 11687.938 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 11887.419 us/op
					 ·stack: <delayed till summary>



	Result "com.github.maltalex.lockbenchmark.LockBenchmark.synchronized_r80_w20":
	  11450.740 ±(99.9%) 139.611 us/op [Average]
	  (min, avg, max) = (11268.544, 11450.740, 11887.419), stdev = 186.377
	  CI (99.9%): [11311.129, 11590.352] (assumes normal distribution)

	Secondary result "com.github.maltalex.lockbenchmark.LockBenchmark.synchronized_r80_w20:·stack":
	Stack profiler:

	....[Thread state distributions]....................................................................
	 65.6%         BLOCKED
	 21.6%         WAITING
	  9.7%         RUNNABLE
	  3.1%         TIMED_WAITING

	....[Thread state: BLOCKED].........................................................................
	 51.5%  78.4% com.github.maltalex.lockbenchmark.LockBenchmark$SynchronizedData.read
	 14.1%  21.6% com.github.maltalex.lockbenchmark.LockBenchmark$SynchronizedData.write

	....[Thread state: WAITING].........................................................................
	 21.6% 100.0% jdk.internal.misc.Unsafe.park

	....[Thread state: RUNNABLE]........................................................................
	  4.5%  46.4% java.lang.Thread.yield
	  2.4%  24.8% com.github.maltalex.lockbenchmark.LockBenchmark$SynchronizedData.read
	  2.0%  20.7% com.github.maltalex.lockbenchmark.LockBenchmark.lambda$benchmark$0
	  0.7%   7.4% com.github.maltalex.lockbenchmark.LockBenchmark$SynchronizedData.write
	  0.0%   0.4% jdk.internal.misc.Unsafe.unpark
	  0.0%   0.1% java.util.concurrent.CompletableFuture.postComplete
	  0.0%   0.1% java.util.concurrent.locks.AbstractQueuedSynchronizer.release
	  0.0%   0.0% jdk.internal.misc.Unsafe.park
	  0.0%   0.0% java.util.concurrent.ThreadPoolExecutor.runWorker
	  0.0%   0.0% java.lang.Thread.isInterrupted

	....[Thread state: TIMED_WAITING]...................................................................
	  3.1% 100.0% java.lang.Object.wait



	# JMH version: 1.21
	# VM version: JDK 11.0.7, OpenJDK 64-Bit Server VM, 11.0.7+10-post-Ubuntu-2ubuntu218.04
	# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
	# VM options: <none>
	# Warmup: 5 iterations, 10 s each
	# Measurement: 5 iterations, 10 s each
	# Timeout: 10 min per iteration
	# Threads: 1 thread, will synchronize iterations
	# Benchmark mode: Average time, time/op
	# Benchmark: com.github.maltalex.lockbenchmark.LockBenchmark.synchronized_r90_w10

	# Run progress: 96.00% complete, ETA 00:08:21
	# Fork: 1 of 5
	# Warmup Iteration   1: 10277.729 us/op
	# Warmup Iteration   2: 10147.204 us/op
	# Warmup Iteration   3: 10093.877 us/op
	# Warmup Iteration   4: 10073.935 us/op
	# Warmup Iteration   5: 10126.687 us/op
	Iteration   1: 10151.893 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 10147.756 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 10121.447 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 10190.242 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 10189.129 us/op
					 ·stack: <delayed till summary>


	# Run progress: 96.80% complete, ETA 00:06:41
	# Fork: 2 of 5
	# Warmup Iteration   1: 10218.841 us/op
	# Warmup Iteration   2: 9975.144 us/op
	# Warmup Iteration   3: 9973.565 us/op
	# Warmup Iteration   4: 9900.399 us/op
	# Warmup Iteration   5: 9993.954 us/op
	Iteration   1: 9987.131 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 10000.515 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 10005.404 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 10049.868 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 10035.207 us/op
					 ·stack: <delayed till summary>


	# Run progress: 97.60% complete, ETA 00:05:01
	# Fork: 3 of 5
	# Warmup Iteration   1: 10314.037 us/op
	# Warmup Iteration   2: 10080.818 us/op
	# Warmup Iteration   3: 10133.052 us/op
	# Warmup Iteration   4: 10084.722 us/op
	# Warmup Iteration   5: 10125.621 us/op
	Iteration   1: 10127.710 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 10125.988 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 10100.027 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 10157.343 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 10195.790 us/op
					 ·stack: <delayed till summary>


	# Run progress: 98.40% complete, ETA 00:03:20
	# Fork: 4 of 5
	# Warmup Iteration   1: 10236.620 us/op
	# Warmup Iteration   2: 10351.096 us/op
	# Warmup Iteration   3: 10318.869 us/op
	# Warmup Iteration   4: 10280.088 us/op
	# Warmup Iteration   5: 10333.457 us/op
	Iteration   1: 10356.669 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 10418.023 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 10347.101 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 10435.715 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 10333.301 us/op
					 ·stack: <delayed till summary>


	# Run progress: 99.20% complete, ETA 00:01:40
	# Fork: 5 of 5
	# Warmup Iteration   1: 10336.477 us/op
	# Warmup Iteration   2: 10161.714 us/op
	# Warmup Iteration   3: 10155.672 us/op
	# Warmup Iteration   4: 10173.219 us/op
	# Warmup Iteration   5: 10229.669 us/op
	Iteration   1: 10111.922 us/op
					 ·stack: <delayed till summary>

	Iteration   2: 9997.315 us/op
					 ·stack: <delayed till summary>

	Iteration   3: 10244.157 us/op
					 ·stack: <delayed till summary>

	Iteration   4: 10233.130 us/op
					 ·stack: <delayed till summary>

	Iteration   5: 10244.099 us/op
					 ·stack: <delayed till summary>



	Result "com.github.maltalex.lockbenchmark.LockBenchmark.synchronized_r90_w10":
	  10172.275 ±(99.9%) 97.704 us/op [Average]
	  (min, avg, max) = (9987.131, 10172.275, 10435.715), stdev = 130.432
	  CI (99.9%): [10074.572, 10269.979] (assumes normal distribution)

	Secondary result "com.github.maltalex.lockbenchmark.LockBenchmark.synchronized_r90_w10:·stack":
	Stack profiler:

	....[Thread state distributions]....................................................................
	 65.8%         BLOCKED
	 21.2%         WAITING
	 10.0%         RUNNABLE
	  3.1%         TIMED_WAITING

	....[Thread state: BLOCKED].........................................................................
	 58.7%  89.3% com.github.maltalex.lockbenchmark.LockBenchmark$SynchronizedData.read
	  7.0%  10.7% com.github.maltalex.lockbenchmark.LockBenchmark$SynchronizedData.write

	....[Thread state: WAITING].........................................................................
	 21.2% 100.0% jdk.internal.misc.Unsafe.park

	....[Thread state: RUNNABLE]........................................................................
	  4.4%  44.3% java.lang.Thread.yield
	  2.7%  27.4% com.github.maltalex.lockbenchmark.LockBenchmark$SynchronizedData.read
	  2.4%  24.0% com.github.maltalex.lockbenchmark.LockBenchmark.lambda$benchmark$0
	  0.4%   3.7% com.github.maltalex.lockbenchmark.LockBenchmark$SynchronizedData.write
	  0.0%   0.4% jdk.internal.misc.Unsafe.unpark
	  0.0%   0.1% java.util.concurrent.locks.AbstractQueuedSynchronizer.release
	  0.0%   0.1% java.util.concurrent.CompletableFuture.postComplete
	  0.0%   0.0% jdk.internal.misc.Unsafe.park
	  0.0%   0.0% java.util.concurrent.ThreadPoolExecutor.runWorker
	  0.0%   0.0% java.util.concurrent.CompletableFuture.asyncRunStage
	  0.0%   0.1% <other>

	....[Thread state: TIMED_WAITING]...................................................................
	  3.1% 100.0% java.lang.Object.wait



	# Run complete. Total time: 03:29:05

	REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
	why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
	experiments, perform baseline and negative tests that provide experimental control, make sure
	the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
	Do not assume the numbers tell you what you want them to tell.

	Benchmark                                  Mode  Cnt      Score     Error  Units
	LockBenchmark.readwrite_r0_w100            avgt   25  16509.112 ± 188.460  us/op
	LockBenchmark.readwrite_r0_w100:·stack     avgt             NaN              ---
	LockBenchmark.readwrite_r100_w0            avgt   25   7561.638 ± 613.479  us/op
	LockBenchmark.readwrite_r100_w0:·stack     avgt             NaN              ---
	LockBenchmark.readwrite_r50_w50            avgt   25  16321.811 ± 211.794  us/op
	LockBenchmark.readwrite_r50_w50:·stack     avgt             NaN              ---
	LockBenchmark.readwrite_r80_w20            avgt   25  12357.781 ± 189.023  us/op
	LockBenchmark.readwrite_r80_w20:·stack     avgt             NaN              ---
	LockBenchmark.readwrite_r90_w10            avgt   25  11286.269 ± 328.912  us/op
	LockBenchmark.readwrite_r90_w10:·stack     avgt             NaN              ---
	LockBenchmark.reentrant_r0_w100            avgt   25  15732.678 ± 554.701  us/op
	LockBenchmark.reentrant_r0_w100:·stack     avgt             NaN              ---
	LockBenchmark.reentrant_r100_w0            avgt   25  14586.118 ± 153.174  us/op
	LockBenchmark.reentrant_r100_w0:·stack     avgt             NaN              ---
	LockBenchmark.reentrant_r50_w50            avgt   25  15439.426 ± 397.694  us/op
	LockBenchmark.reentrant_r50_w50:·stack     avgt             NaN              ---
	LockBenchmark.reentrant_r80_w20            avgt   25  15051.987 ± 210.090  us/op
	LockBenchmark.reentrant_r80_w20:·stack     avgt             NaN              ---
	LockBenchmark.reentrant_r90_w10            avgt   25  14902.399 ± 115.543  us/op
	LockBenchmark.reentrant_r90_w10:·stack     avgt             NaN              ---
	LockBenchmark.spin_r0_w100                 avgt   25  16296.223 ± 351.788  us/op
	LockBenchmark.spin_r0_w100:·stack          avgt             NaN              ---
	LockBenchmark.spin_r100_w0                 avgt   25   7103.558 ± 327.008  us/op
	LockBenchmark.spin_r100_w0:·stack          avgt             NaN              ---
	LockBenchmark.spin_r50_w50                 avgt   25  13065.895 ± 155.809  us/op
	LockBenchmark.spin_r50_w50:·stack          avgt             NaN              ---
	LockBenchmark.spin_r90_w10                 avgt   25   9390.915 ± 465.028  us/op
	LockBenchmark.spin_r90_w10:·stack          avgt             NaN              ---
	LockBenchmark.spin_r80_w20                avgt   25  10431.370 ± 371.228  us/op
	LockBenchmark.spin_r80_w20:·stack         avgt             NaN              ---
	LockBenchmark.stamped_r0_w100              avgt   25  11508.145 ± 599.651  us/op
	LockBenchmark.stamped_r0_w100:·stack       avgt             NaN              ---
	LockBenchmark.stamped_r100_w0              avgt   25    863.142 ±  29.717  us/op
	LockBenchmark.stamped_r100_w0:·stack       avgt             NaN              ---
	LockBenchmark.stamped_r50_w50              avgt   25   8990.532 ± 408.712  us/op
	LockBenchmark.stamped_r50_w50:·stack       avgt             NaN              ---
	LockBenchmark.stamped_r80_w20              avgt   25   5870.741 ±  96.738  us/op
	LockBenchmark.stamped_r80_w20:·stack       avgt             NaN              ---
	LockBenchmark.stamped_r90_w10              avgt   25   4337.439 ±  71.332  us/op
	LockBenchmark.stamped_r90_w10:·stack       avgt             NaN              ---
	LockBenchmark.synchronized_r0_w100         avgt   25  15404.589 ± 160.709  us/op
	LockBenchmark.synchronized_r0_w100:·stack  avgt             NaN              ---
	LockBenchmark.synchronized_r100_w0         avgt   25   8564.822 ±  65.918  us/op
	LockBenchmark.synchronized_r100_w0:·stack  avgt             NaN              ---
	LockBenchmark.synchronized_r50_w50         avgt   25  13890.215 ± 261.045  us/op
	LockBenchmark.synchronized_r50_w50:·stack  avgt             NaN              ---
	LockBenchmark.synchronized_r80_w20         avgt   25  11450.740 ± 139.611  us/op
	LockBenchmark.synchronized_r80_w20:·stack  avgt             NaN              ---
	LockBenchmark.synchronized_r90_w10         avgt   25  10172.275 ±  97.704  us/op
	LockBenchmark.synchronized_r90_w10:·stack  avgt             NaN              ---