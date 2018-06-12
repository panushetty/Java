package com.pranayshetty;

public class Main {
	public static void main(String[] args) {
		
		//calculateScore(gameOver,score,levelCompleted,bonus);
		calculateScore(true,800,5,100);
		calculateScore(true,900,5,100);
	}
	public static void calculateScore(boolean gameOver,int score,int levelCompleted,int bonus) {
		
		
		if(gameOver) {
			int finalscore=score+(levelCompleted*bonus);
			finalscore+=1000;
			System.out.println("The finalscore is "+finalscore);
			
		}
		
		
	}

}
