package com.globallogic.bootcampgl;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderFactory {
	private Order order;
	
	@Autowired 
	public void getNewOrder(Order order) {
		this.order = order;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
