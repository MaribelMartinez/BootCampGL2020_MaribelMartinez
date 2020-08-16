package com.globallogic.bootcampgl;

import org.springframework.stereotype.Component;

@Component("order")
public class Order extends OrderFactory{
	
	private String product;
	private Integer customer;
	private Integer count;
	
	public Order(String product, Integer customer, Integer count) {
		this.product = product;
		this.customer = customer;
		this.count = count;
		
	}
	
	public String toString() {
		return product +" "+ customer +" "+ count;
	}

	public Order() {
		super();
	}

}
