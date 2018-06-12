package com.pranayshetty;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre theatre=new Theatre("Olypian",8,12);
		
		
	}
	
	
	
	
	
	
	
	
	public static void printList(List<Theatre.Seat> list) {
		for(Theatre.Seat seat:list ) {
			System.out.print(" "+seat.getSeatNumber());
		}
		System.out.println();
	}

}
