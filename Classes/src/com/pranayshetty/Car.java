package com.pranayshetty;

public class Car {
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String colour;
	
	public Car() {
		System.out.println("Empty constructor callled");
	}
	public Car(int doors,int wheels,String model,String engine,String colour) {
		System.out.println("Special constructor called");
		this.doors=doors;
		this.wheels=wheels;
		this.model=model;
		this.engine=engine;
		this.colour=colour;
	}
	
		
		
		
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return this.model;
	}
	public int getDoors() {
		return this.doors;
	}
	public int getWheels() {
		return this.wheels;
	}
	public String getEngine() {
		return this.engine;
	}
	public String getColour() {
		return this.colour;
	}
	
	
	
}
