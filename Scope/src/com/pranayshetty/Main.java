package com.pranayshetty;

public class Main {

	public static void main(String[] args) {
		 String privateVar="this is private to main()";
		 
		 ScopeCheck scopeInstance=new ScopeCheck();
		 System.out.println("Private var in main  "+privateVar+" and Private var in Scopecheck "+scopeInstance.getPrivateVar());
		 scopeInstance.timesTwo();
		 
		 ScopeCheck.InnerClass innerClass=scopeInstance.new InnerClass();
		 innerClass.timesTwo();
	}

}
