package com.globallogic.bootcampgl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		Customer customer = new Customer("Jose Perez", 234567890, 12342);
				System.out.println(customer);
		SpringApplication.run(App.class, args);
	}
	
}
