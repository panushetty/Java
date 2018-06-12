package com.pranayshetty;

public class Main {
	public static void main(String[] args) {
		Car porsche = new Car();
		Car tata=new Car();
	    tata.setModel("Indica");
	    System.out.println(tata.getModel());
	    System.out.println(porsche.getModel());
	    porsche.setModel("quetta");
	    System.out.println(porsche.getModel());
	    Car toyota=new Car(4,4,"corolla","v-tec","red");
	    System.out.println(toyota.getModel());
	}

}
