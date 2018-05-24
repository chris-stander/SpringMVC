package com.packt.webstore.domain.repository;

import java.util.List;
import java.util.Map;
import java.math.BigDecimal;

import com.packt.webstore.domain.Product;

public interface ProductRepository {

	List <Product> getAllProducts();
	
	void updateStock(String productId, long noOfUnits);
	
	List<Product> getProductsByCategory(String category);
	
	List<Product> getProductsByFilter(Map<String,List<String>> filterParams);
	
	Product getProductById(String productID);
	
	// hero 3
	List<Product> filterProducts(Map<String,List<String>> filterParams);
		List<Product> getProductsByManufacturer(String manufacturer);
		List<Product> getProductsByPrice(BigDecimal low, BigDecimal high);
	
	void addProduct(Product product);
}
