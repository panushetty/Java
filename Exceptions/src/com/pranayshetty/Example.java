package com.pranayshetty;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		try {
			int result =divide();
			System.out.println(result);
		}catch(ArithmeticException | NoSuchElementException e){
			System.out.println(e.toString());
			System.out.println("Enable to perform division autopilot shutting down");
		}
	}
	
	private static int divide() {
		int x,y;
//		try {
		   x=getInt();
		   y=getInt();
		   System.out.println("x is "+x+",y is "+y);
		   return x/y;
//		}catch(NoSuchElementException e) {
//		   throw new ArithmeticException("no suitable input");	
//		} catch(ArithmeticException e) {
//			throw new ArithmeticException("attempt to divide by zero");
//		}
		
			
		
	}
	
	private static int getInt() {
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter an Integer");
		while (true) {
			try {
				return in.nextInt();
			}
			catch(InputMismatchException e) {
				in.nextLine();
				System.out.println("Please Enter a number with digits 0-9");
			}
		}
	}

}
