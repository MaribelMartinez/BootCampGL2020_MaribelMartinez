package com.globallogic.bootcampgl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("productRepository")
public class ProductRepository {
	
	@Autowired
	Product product;

	public static List<Product> products = new ArrayList<>();

	public Product getById() {
				return product;
	}
	
	public void addProduct() {
		System.out.print(product);
		products.add(product);
	}

}
