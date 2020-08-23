package com.globallogic.bootcampgl;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderService {
	
	@Autowired
	OrderFactory orderFactory;

	
	public Order getOrder() {
		return orderFactory.getNewOrder();
	}
	
	public Order setOrderData(String product, Integer count, Integer customer) {
		getOrder().setCount(count);
		getOrder().setCustomer(customer);
		getOrder().setProduct(product);
		return getOrder();
	}

}
