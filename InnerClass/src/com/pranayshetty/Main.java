package com.pranayshetty;
import java.util.Scanner;


public class Main {
	private static Scanner in=new Scanner(System.in);
	private static Button btnPrint =new Button("Print");


	public static void main(String[] args) {
//		GearBox mcLaren=new GearBox(6);
//		mcLaren.addGear(1, 5.3);
//		mcLaren.addGear(2, 10.6);
//		mcLaren.addGear(3, 15.9);
//		mcLaren.operateClutch(true);
//		mcLaren.changeGear(1);
//		mcLaren.operateClutch(false);
//		System.out.println(mcLaren.wheelSpeed(1000));
//		mcLaren.changeGear(2);

//		class ClickListener implements Button.OnClickListener{
//			public ClickListener() {
//				System.out.println("You are now attached");
//			}
//
//			@Override
//			public void onClick(String title) {
//				System.out.println("You have Pressed this"+title );
//				
//			}
		
		btnPrint.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(String title) {
				// TODO Auto-generated method stub
				
			}
		});	
		
		
	}

}
