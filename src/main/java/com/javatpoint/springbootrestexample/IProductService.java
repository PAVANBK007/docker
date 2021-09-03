package com.javatpoint.springbootrestexample;

import java.util.List;

public interface IProductService {
	
List<Product> findAll();

public Product getProduct(int id);

public Product addProduct(Product product);

public Product updateProduct(Product product);

//public Product deleteProduct(int parseInt);
}
