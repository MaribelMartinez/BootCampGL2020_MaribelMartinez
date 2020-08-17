package com.globallogic.bootcampgl.service;

import java.util.Collection;

import com.globallogic.bootcampgl.dto.ProductDTO;

/**
 * Product Service
 */
public interface ProductService {

	public abstract Collection<ProductDTO> getProducts();
	
	public void createProduct(ProductDTO product);
	
	public void updateProduct(String id, ProductDTO productDto);
	
	public void deleteProduct(String id);
}
