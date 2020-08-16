package com.globallogic.bootcampgl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderApplication {

	public static void main(String[] args) {
		Order order = new Order("C-00221", 12342, 1000);
		order.getNewOrder(order);
		System.out.println(order.getOrder());
		SpringApplication.run(OrderApplication.class, args);
	}

}
