package com.globallogic.bootcamp.patterns;

public class Currency {

	private String name;
	private static final Currency instance = new Currency();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Currency() {
		this.name = "ARS";
	}
	
	public static Currency getInstance() {
		return instance;
	}
}
