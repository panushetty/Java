package com.pranayshetty;



public class Main {

	public static void main(String[] args) {
		
		FootballPlayer joe =new FootballPlayer("Joe");
		BaseballPlayer pat =new BaseballPlayer("Pat");
		SoccerPlayer beckham=new SoccerPlayer("Beckham");
		
		Team<FootballPlayer> adelaideCrows=new Team<>("Adelaide Crows");
//		adelaideCrows.addPlayer(pat);
		adelaideCrows.addPlayer(joe);
//		adelaideCrows.addPlayer(beckham);
		
		System.out.println(adelaideCrows.numPlayers());
		
		Team<BaseballPlayer> newYorkMets =new Team<>("New York Mets"); 
		newYorkMets.addPlayer(pat);
	}
	
	
}
