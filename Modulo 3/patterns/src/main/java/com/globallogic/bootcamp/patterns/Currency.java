package com.globallogic.bootcamp.patterns;

public class Currency {

	private String name;
	private static final Currency instance = new Currency();
	
	private Currency() {
		this.name = "ARS";
	}
	
	public static Currency getInstance() {
		return instance;
	}
}
