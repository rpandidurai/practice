package ps.iv.java8.streams;

import java.nio.file.StandardCopyOption;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class IntStreamTest {

	public static void main(String[] args) throws InterruptedException {
		
		AtomicInteger atomicInt = new AtomicInteger(0);

		/*ExecutorService executor = Executors.newFixedThreadPool(1);

		IntStream.range(0, 2)
		    .forEach(i -> {
		        Runnable task = () ->
		            atomicInt.accumulateAndGet(i, (n, m) -> n + m);
		        executor.submit(task);
		    });
		
		executor.shutdown();*/
		
//		Thread.currentThread().join();		
		
		/*IntStream.range(0,  100)
		.forEach(i -> System.out.println(i));*/
		
//		System.out.println(atomicInt);
		
		String s = "10+11+(6+7*8/10)+7";
		
	}

}
