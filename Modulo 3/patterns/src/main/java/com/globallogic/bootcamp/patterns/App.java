package com.globallogic.bootcamp.patterns;

public class App {
	public static void main(String[] args) {
		
		Game game = new Game();
		game.setTittle("Resident Evil");
		Playstation playstation = new Playstation(game);
		System.out.println(playstation.askMyGame());

		game.setTittle("Bawlhalla");
		playstation.setVideogame(game);
		System.out.println(playstation.askMyGame());

		playstation.setVideogame(null);
		System.out.println(playstation.askMyGame());
	}
}
