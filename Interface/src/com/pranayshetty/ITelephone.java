package com.pranayshetty;

public interface ITelephone {
	void powerOn();
	void dial(int phonenumber);
	void answer();
	boolean callPhone(int phonenumber);
	public boolean isRinging();
	

}
