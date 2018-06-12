package com.pranayshetty;

public class PC {
	private Case theCase;
	private Moniter moniter;
	private Motherboard motherboard;
	public PC(Case theCase, Moniter moniter, Motherboard motherboard) {
		
		this.theCase = theCase;
		this.moniter = moniter;
		this.motherboard = motherboard;
	}
	public Case getTheCase() {
		return theCase;
	}
	public Moniter getMoniter() {
		return moniter;
	}
	public Motherboard getMotherboard() {
		return motherboard;
	}
	
	
}
