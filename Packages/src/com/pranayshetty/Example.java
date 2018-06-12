package com.pranayshetty;

import java.awt.*;

import java.awt.event.*;


public class Example extends Frame{

	public Example(String title) {
		super(title);
		setSize(500,140);
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		// TODO Auto-generated constructor stub
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Font sanSerifLarge=new Font("SanSerif",Font.BOLD,18);
	}

}
