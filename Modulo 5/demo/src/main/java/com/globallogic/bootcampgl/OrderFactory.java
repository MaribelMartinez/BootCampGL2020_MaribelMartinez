package com.globallogic.bootcampgl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("orderFactory")
public class OrderFactory {
	
	@Autowired
	private Order order;

	@Autowired
	public Order getNewOrder() {
		return order;
	}


}
