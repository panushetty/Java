package com.pranayshetty;

public class Main {
	public static void main(String[] args) {
		Account timAccount =new Account("tim");
		timAccount.deposit(1000);
		timAccount.withdrawal(500);
		timAccount.deposit(-50);
		timAccount.withdrawal(-200);
		
		timAccount.calculateBalance();
		System.out.println("Balance on account is "+timAccount.getBalance());
	}
}
