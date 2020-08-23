package com.globallogic.bootcampgl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
	
		CustomerController customerController = new CustomerController();
		customerController.getCustomer();
		SpringApplication.run(App.class, args);
	}
	
}
