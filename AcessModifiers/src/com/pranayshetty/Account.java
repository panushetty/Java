package com.pranayshetty;
import java.util.ArrayList;

public class Account {
	private String accountName;
	private int  balance;
	private ArrayList<Integer> transactions;
	public Account(String accountName) {
		this.transactions=new ArrayList<Integer>();
		this.accountName = accountName;
	}
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		if(amount>0) {
			transactions.add(amount);
			this.balance+=amount;
			System.out.println("Amount deposited : "+amount+"$. Balance is now : "+this.balance+"$.");
			
		}
		else {
			System.out.println("Cannot deposit");
		}
	}
	
	public void withdrawal(int amount) {
		int withdrawal=-amount;
		if(withdrawal<0) {
			transactions.add(withdrawal);
			this.balance+=withdrawal;
			System.out.println("Amount withdrawed : "+amount+"$. Balance is now : "+this.balance+"$.");
			
		}
		else {
			System.out.println("Cannot withdraw from amount");
		}
	}
	
	public void calculateBalance() {
		this.balance=0;
		for(int i:this.transactions) {
			this.balance+=i;
		}
		System.out.println("The balance is "+this.balance);
	}
	
	
	
	
}
