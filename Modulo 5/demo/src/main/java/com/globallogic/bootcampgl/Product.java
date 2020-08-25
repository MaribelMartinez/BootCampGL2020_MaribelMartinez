package com.globallogic.bootcampgl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Product {
	
	@Value("${in.product.id}")
	private String id;
	
	@Value("${in.product.name}")
	private String name;
	
	public Product(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return id + name;
	}
	
	public Product() {
	}

}
