package com.pranayshetty;

public class Main {
	public static void main(String[] args) {
		/*Player player =new Player();
		player.name="Tim";
		player.health=20;
		player.weapon="Sword";
		
		player.loseHealth(10);
		System.out.println(player.healthRemaining());
		player.loseHealth(10);
		System.out.println(player.healthRemaining());*/
		
		EnhancedPlayer player=new EnhancedPlayer("tim",200,"Sword");
		System.out.print("Player's health is "+player.getHealth());
	}

}
