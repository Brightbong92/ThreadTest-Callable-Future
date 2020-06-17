package com.example.test.sample;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CallableTest {

	private static int value = 10;
	
	static class CallableTask implements Callable<Integer> {
	    public CallableTask(int num) {
	        value = num;
	    }
	    @Override
	    public Integer call() throws Exception {
	        return value;
	    }
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
	       ExecutorService executor = Executors.newFixedThreadPool(3);
	       Future<Integer> future1 = executor.submit(new CallableTask(13));
	       Future<Integer> future2 = executor.submit(new CallableTask(16));
	       Future<Integer> future3 = executor.submit(new CallableTask(17));

	        log.info("thread1 : "+ future1.get());
	        log.info("thread2 : "+ future2.get());
	        log.info("thread3 : "+ future3.get());
	        executor.shutdown();
	}
}