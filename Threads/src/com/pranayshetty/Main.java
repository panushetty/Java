package com.pranayshetty;

public class Main {

	

	public static void main(String[] args) {
		System.out.println("Hello to the main thread");
		Thread anotherThread=new AnotherThread();
		anotherThread.start();
		
		new Thread() {
			public void run (){
				System.out.println("hello from Anonymous");
			}
		}.start();
		
		Thread myRunnable=new Thread(new MyRunnable() {

			@Override
			public void run() {
				
				System.out.println("Hello my bros");
				try {
					anotherThread.join();
					System.out.println("Was is happening");
				}catch(InterruptedException e){
					System.out.println("I was Interrupted while i was joining");
				}
			}
			
		});
		
		
//		Thread myRunnable=new Thread(new MyRunnable());
		myRunnable.start();
		
		
		

	}

}