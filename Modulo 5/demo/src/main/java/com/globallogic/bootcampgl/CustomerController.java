package com.globallogic.bootcampgl;

import org.springframework.stereotype.Controller;

@Controller
public class CustomerController {
	
	
	public Customer getCustomer() {
		Customer customer = new Customer();
		System.out.println("ACA"+customer);
		return  customer;
	}

}
