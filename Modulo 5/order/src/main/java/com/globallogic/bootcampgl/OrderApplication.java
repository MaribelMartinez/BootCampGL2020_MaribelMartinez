package com.globallogic.bootcampgl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderApplication {

	public static void main(String[] args) {
		OrderService orderService = new OrderService();
		System.out.println(orderService.getOrder());
		SpringApplication.run(OrderApplication.class, args);
	}

}
