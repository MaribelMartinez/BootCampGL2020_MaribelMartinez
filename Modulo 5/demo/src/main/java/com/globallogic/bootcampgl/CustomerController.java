package com.globallogic.bootcampgl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
@Configurable
@ConfigurationProperties("in")
public class CustomerController {
	
	@Value("${in.nombre}")
	String nombre;
	
	@Value("${in.id}")
	Integer id;
	
	@Value("${in.dni}")
	Integer dni;
	
	
	public Customer getCustomer() {
		Customer customer = new Customer(nombre, dni, id);
		System.out.println("ACA"+customer);
		return  customer;
	}

}
