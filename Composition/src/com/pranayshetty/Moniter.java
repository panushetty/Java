package com.pranayshetty;

public class Moniter {
	private String model;
	private String manufacturer;
	private int size;
	private Resolution nativeResolution ;
	
	public Moniter(String model, String manufacturer, int size, Resolution nativeResolution) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}
	
	public void drawPixelAt(int x,int y,String colour) {
		System.out.println("Drawing pixel at "+x+"and "+y+"positions of colour "+colour);
	}

	public String getModel() {
		return this.model;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}

	public int getSize() {
		return this.size;
	}

	public Resolution getNativeResolution() {
		return this.nativeResolution;
	}
	
	
	
	

}
