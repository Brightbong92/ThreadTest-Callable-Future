package com.example.test.sample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import lombok.extern.slf4j.Slf4j;

public class ThreadTest {
	public static int value = 10;
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		executorService.execute(new ThreadSample("thread1", 13));
		executorService.execute(new ThreadSample("thread2", 16));
		executorService.execute(new ThreadSample("thread3", 17));
	}
}

class ThreadSample implements Runnable{
	private String name;
	
	public ThreadSample(String str, int num) {
		synchronized(this){
			this.name = str;
			ThreadTest.value = num;
			new Print().printThread(this.name, ThreadTest.value);
		}
	}
	
	public void run() {
	}
}
@Slf4j
class Print {
	
	public void printThread(String name, int value) {
		log.info(name + " : " + value);
	}
}