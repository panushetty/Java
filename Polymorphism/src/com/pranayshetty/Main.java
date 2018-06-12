package com.pranayshetty;

class Movie{
	private String name;

	public Movie(String name) {
		this.name = name;
	}
	public String plot() {
		return "No plot here";
	}
	public String getName() {
		return this.name;
	}
	
	
	
}

class IndependenceDay extends Movie{
	public IndependenceDay() {
		super("Independence Day");
	}
	
	public String plot() {
		return "Aliens Aliens Aliens";
	}
}

class MazeRunner extends Movie{
	public MazeRunner() {
		super("Maze Runner");
	}
	
	public String plot() {
		return "Kids try and escape a maze";
	}
}

class StarWars extends Movie{
	public StarWars() {
		super("Star Wars");
	}
	
	public String plot() {
		return "Peculiar forces try to take over the universe";
	}
}

class Forgetable extends Movie{
	public Forgetable() {
		super("Forgetable");
	}
	
}

class Jaws extends Movie{
	public Jaws() {
		super("Jaws");
	}
	public String plot() {
		return "A Shark who eats lot of people";
	}
}

public class Main {

	public static void main(String[] args) {
		for(int i=1;i<11;i++) {
			Movie movie=randomMovie();
			System.out.println("Movie no: "+i+movie.getName());
			System.out.println("Plot: "+i+movie.plot());
			System.out.println();
		}

	}
	
	public static Movie randomMovie() {
		int randomNumber=(int)(Math.random()*5)+1;
		System.out.println("Random number generated was "+randomNumber);
		switch(randomNumber) {
		case 1:
			return new Jaws();
		case 2:
			return new IndependenceDay();
		case 3:
			return new MazeRunner();
		case 4:
			return new StarWars();
		case 5:
			return new Forgetable();
		
		}
		return null;
	}

}