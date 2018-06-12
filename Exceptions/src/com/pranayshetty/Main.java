package com.pranayshetty;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		int x=99;
//		int y=0;
//		System.out.println(divideLBYL(x,y));
//		System.out.println(divideEAFP(x, y));
//		System.out.println(x/y);
		int x=getInt();
		System.out.println("x is :"+x);

	}
	
	private static int getInt() {
		Scanner in =new Scanner(System.in);
		return in.nextInt();
	}
	
	private static int divideLBYL(int x,int y) {
		if(y!=0) {
			return x/y;
		}
		else {
			return 0;
		}
	}

	private static int divideEAFP(int x,int y) {
		try {
			return x/y;
		}catch(ArithmeticException e){
			return 0;
		}
	}
}
