package com.pranayshetty;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

import static com.pranayshetty.Main.EOF;  

public class Main {
public static final String EOF="EOF";
	public static void main(String[] args) {
		ArrayBlockingQueue<String> buffer=new ArrayBlockingQueue<String>(6);
		
		ExecutorService executorService=Executors.newFixedThreadPool(3);
		MyProducer producer=new MyProducer(buffer,"******");
		MyConsumer consumer=new MyConsumer(buffer, "++++++");
		MyConsumer consumer1=new MyConsumer(buffer, "------");
		
		
		executorService.execute(producer);
		executorService.execute(consumer);
		executorService.execute(consumer1);
		
		Future<String> future=executorService.submit(new Callable<String>() {

			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				System.out.println("***********"+"GUCCI GANG"+"**********");
				return "This is new type of thread";
			}
			
		});
		
		try {
			System.out.println(future.get());
		}catch (ExecutionException e) {
			System.out.println("Something went wrong");
		}catch (InterruptedException e) {
			System.out.println("Thread running was interupted");
		}
		
		executorService.shutdown();

	}

}

class MyProducer implements Runnable{
	private ArrayBlockingQueue<String> buffer;
	private String color;
	
	public MyProducer(ArrayBlockingQueue<String> buffer, String color) {
		this.buffer = buffer;
		this.color = color;
	}
	
	public void run() {
		Random random=new Random();
		String[] nums= {"1","2","3","4","5"};
		
		for(String num:nums) {
			try {
				System.out.println(color+"Adding ...."+num);
			    buffer.put(num);
			   
				Thread.sleep(random.nextInt(1000));
			}catch (InterruptedException e){
				System.out.println("Producer was interrupted");
		    }
		}
		
		System.out.println("Adding EOF and Exiting");
		try {
			buffer.put("EOF");
		}catch(InterruptedException e) {
			
		}
		
	}
	
	
	
	
}


class MyConsumer implements Runnable{
	private ArrayBlockingQueue<String> buffer;
	private String color;
	
	
	public MyConsumer(ArrayBlockingQueue<String> buffer, String color) {
		this.buffer = buffer;
		this.color = color;
	}
	
	public void run() {
		while(true) {
			synchronized (buffer) {
				try {
					if(buffer.isEmpty()) {
						continue;
					}
					if(buffer.peek().equals("EOF")) {
						System.out.println(color+"Exiting");
						break;
					}else {
						System.out.println(color+"Removed"+buffer.take());
					}
				}catch(InterruptedException e) {
					
				}
			}
			
				
			 
		}
	}
	
	
	
}