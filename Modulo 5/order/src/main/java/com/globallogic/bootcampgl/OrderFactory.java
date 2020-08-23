package com.globallogic.bootcampgl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("orderFactory")
public class OrderFactory {
	
	private Order order;

	public Order getNewOrder() {
		order = new Order();
		return order;
	}


}
