package com.pranayshetty;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
	private static ReentrantLock lock=new ReentrantLock();
	
	public static void main(String[] args) {
		Thread t1=new Thread(new Worker("* * * * *"),"Priority 10");
		Thread t2=new Thread(new Worker("+ + + + +"),"Priority 8");
		Thread t3=new Thread(new Worker("- - - - -"),"Priority 6");
		Thread t4=new Thread(new Worker("x x x x x"),"Priority 4");
		Thread t5=new Thread(new Worker("/ / / / /"),"Priority 2");
		
		t1.setPriority(10);
		t1.setPriority(8);
		t1.setPriority(6);
		t1.setPriority(4);
		t1.setPriority(2);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}
	
	private static class Worker implements Runnable{
		private int runCount=1;
		private String Threadcolor;
		
		
		public Worker(String threadcolor) {
			super();
			Threadcolor = threadcolor;
		}


		@Override
		public void run() {
			 for (int i = 0; i < 100; i++) {
				 lock.lock();
				 try {
					 System.out.println(Threadcolor+" "+Thread.currentThread().getName()+": Runcount"+runCount++);
				 }finally {
					 lock.unlock();
				 }
			}
			
		}
		
		
		
		
	}

}
