package com.pranayshetty;

public class ScopeCheck {
	public int publicVar=0;
	private int privateVar=1;
	
	public ScopeCheck() {
		System.out.println("Public var : "+publicVar+"and "+"Private Var : "+privateVar );
		
	}

	public int getPrivateVar() {
		return privateVar;
	}

	public void timesTwo() {
		int varOne=2;
		
		for(int i=0;i<10;i++) {
			System.out.println(i*varOne);
			
		}
	}
	
	public class InnerClass{
		public int privateVar=3;
		
		public InnerClass() {
			
		}
		
		public void timesTwo() {
			int privateVar=2;
			
			for(int i=0;i<10;i++) {
				System.out.println(i*this.privateVar);
				
			}
		}
		
	}
		
		
}
