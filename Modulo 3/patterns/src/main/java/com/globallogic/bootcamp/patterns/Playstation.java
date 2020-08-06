package com.globallogic.bootcamp.patterns;

public class Playstation {

	private Game videogame;

	public Playstation(Game game) {
		videogame = game;
	}

	public void setVideogame(Game videogame) {
		this.videogame = videogame;
	}

	public String askMyGame() {
		
		if (this.videogame != null) {
			return "El videojuego que estoy corriendo es: " + this.videogame.getTittle();
		}else {
			return "¡Estoy vacio!";
		}
	}
}
