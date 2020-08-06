package com.globallogic.bootcamp.patterns;

public class Product {
	
	private String name;
	private static final Product instance = new Product();
	
	private Product() {
		name = "Clavos";
	}
	
	public static Product getInstance() {
		return instance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
