package com.pranayshetty;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	private static Scanner scanner=new Scanner(System.in);
	private static GroceryList groceryList=new GroceryList();
	public static void main(String[] args) {
		boolean quit=false;
		int choice=0;
		printInstructions();
		while(!quit) {
			System.out.print("Enter your choice: ");
			choice=scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
				case 0:
					printInstructions();
					break;
				case 1:
					groceryList.printGroceryList();
					break;
				case 2:
					addItem();
					break;
				case 3:
					modifyItem();
					break;
				case 4:
					removeItem();
					break;
				case 5:
					searchItem();
					break;
				case 6:
					quit=true;
					break;
				case 7:
					processArrayList();
					break;
					
				
			}
		}
		System.out.println("Exitted the code");

	}
	
	public static void printInstructions() {
		System.out.println("hello");
	}
	
	public static void addItem() {
		System.out.println("Please enter your item");
		groceryList.addGroceryItem(scanner.nextLine());
	}
	public static void modifyItem() {
		
		System.out.println("Enter the new item ");
		String newItem=scanner.nextLine();
		groceryList.modifyGroceryList(newItem); 
	}
	
	public static void removeItem() {
		System.out.println("Enter the item to be removed");
		String item=scanner.nextLine();
		groceryList.removeGroceryItem(item);
	}
	public static void searchItem() {
		System.out.println("Ënter the item to be searched");
		int position=groceryList.findItem(scanner.nextLine());
		if(position>=0) {
			System.out.println("Item found at position "+(position+1));
		}
		else {
			System.out.println("The item is not available in the Grocery List");
		}
	}
	
	public static void processArrayList() {
		ArrayList<String> newArray =new ArrayList<String>(groceryList.getGroceryList());
		
		
	}

}
