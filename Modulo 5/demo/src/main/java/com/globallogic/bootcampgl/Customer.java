package com.globallogic.bootcampgl;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@EntityScan
@ConfigurationProperties("in")
public class Customer implements CommandLineRunner{
	
	private String name;
	private Integer dni;
	private Integer id;
	
	public Customer() {
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
