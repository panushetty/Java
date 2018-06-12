package com.pranayshetty;

public class StockItem implements Comparable {
	private final String name;
	private double price;
	private int quantityStock=0;
	
	
	public StockItem(String name, double price) {
		this.name = name;
		this.price = price;
		this.quantityStock=0;
	}


	public String getName() {
		return name;
	}


	public double getPrice() {
		return price;
	}


	public int getQuantityStock() {
		return quantityStock;
	}


	public void setPrice(double price) {
		if (price>0.0) {
			this.price = price;
		}
		
	}
	
	public void adjustStock(int quantity) {
		int newQuantity=this.quantityStock+quantity;
		if(newQuantity>0) {
			this.quantityStock=newQuantity;
		}
	}


	@Override
	public int hashCode() {
		return this.name.hashCode()+31;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		String objName=((StockItem) obj).getName();
		return this.name.equals(objName);
		
	}


	@Override
	public int compareTo(Object arg1) {
		if(arg1==this) {
			return 0;
		}
		if(arg1!=null) {
			return this.name.compareTo(((StockItem)arg1).getName());
		}
		// TODO Auto-generated method stub
		throw new  NullPointerException();
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+": price"+this.price; 
	}
	
	




	
	
	
	
	
	  
	
	
	

}
