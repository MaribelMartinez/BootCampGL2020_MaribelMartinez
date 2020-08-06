package com.globallogic.bootcamp.patterns;

public class Order {

	private String description;
	private double count;
	private Currency currency;
	private Product product;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Order(String description, double count) {
		this.description = description;
		this.count = count;
		currency = Currency.getInstance();
		product = Product.getInstance();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCount() {
		return count;
	}

	public void setCount(double count) {
		this.count = count;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

}
