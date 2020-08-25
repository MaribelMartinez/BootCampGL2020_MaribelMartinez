package com.globallogic.bootcampgl;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Customer{
	
	@Value("${in.name}")
	private String name;
	
	@Value("${in.dni}")
	private Integer dni;
	
	@Value("${in.id}")
	private Integer id;
	
	public Customer() {
		System.out.println(this.name);
	}

	public String toString() {
		return "name "+name + 
				"\n id: "+id + 
				"\n dni:" +dni;
	}

	
	 public Customer(String name, Integer dni, Integer id) { super(); this.name =
	 name; this.dni = dni; this.id = id; }
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}




}
