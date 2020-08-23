package com.globallogic.bootcampgl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Order extends OrderFactory{
	
	
	private String product;
	private Integer customer;
	private Integer count;
	
	public Order(String product, Integer customer, Integer count) {
		this.product = product;
		this.customer = customer;
		this.count = count;
		
	}
	
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Integer getCustomer() {
		return customer;
	}

	public void setCustomer(Integer customer) {
		this.customer = customer;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String toString() {
		return product +" "+ customer +" "+ count;
	}

	public Order() {
		super();
	}

}
