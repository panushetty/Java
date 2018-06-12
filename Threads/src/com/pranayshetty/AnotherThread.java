package com.pranayshetty;

public class AnotherThread extends Thread{

	@Override
	public void run() {
		System.out.println("<--There is another thread -->");
		
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			System.out.println("This means that i have been woken up Another Thread");
		}
		
		System.out.println("Now i am awake ");
		
	}
	
}
