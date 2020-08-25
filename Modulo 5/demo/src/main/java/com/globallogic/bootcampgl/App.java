package com.globallogic.bootcampgl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class App implements CommandLineRunner{
	
	@Autowired
	Customer customer;
	
	@Autowired
	OrderFactory orderFactory;
	
	@Autowired
	ProductRepository productRepository;

	public static void main(String[] args) {
	
		SpringApplication app = new SpringApplication(App.class);
		app.run();
	}

	@Override
	public void run(String... args) throws Exception {
	System.out.println(customer);
	System.out.println(orderFactory.getNewOrder());
	System.out.println(productRepository.getById());
		
	}
	
}
