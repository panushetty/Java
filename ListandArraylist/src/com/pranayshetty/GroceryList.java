 package com.pranayshetty;
 import java.util.ArrayList;


public class GroceryList {
	private ArrayList<String> groceryList=new ArrayList<String>();
	
	public ArrayList<String> getGroceryList() {
		return groceryList;
	}

	public void addGroceryItem(String item) {
		groceryList.add(item);
	}
	
	public void printGroceryList() {
		for (int i = 0; i < groceryList.size(); i++) {
			System.out.println(groceryList.get(i));
		}
	}
	
	public void modifyGroceryList(String newItem) {
		int position=findItem(newItem);
		if(position>=0) {
			modifyGroceryList(position,newItem);
		}
	}
	
	public void modifyGroceryList(int position,String newItem) {
		groceryList.set(position, newItem);
	}
	
	
	public void removeGroceryItem(String newItem) {
		int position=findItem(newItem);
		groceryList.remove(position);
	}
	public int findItem(String searchItem) {
		return groceryList.indexOf(searchItem);
		   
	}

	
	
}
