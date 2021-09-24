package com.javatpoint.springbootrestexample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {

	List<Product> list;
	public ProductService() {
		list=new ArrayList<>();
		list.add(new Product(100,"Mobile","CLK98123",9000.0,6));

		list.add(new Product(101,"Smart ","LGST09167",60000.0,3));
		list.add(new Product(102,"Washing Machine","38753BK9",9000.0,7));
		list.add(new Product(103,"Laptop","LPH29OCP",24000.0,1));
		list.add(new Product(104,"Air Conditioner","ACLG66721",30000.0,5));
		list.add(new Product(105,"Refrigerator","12WP9087",10000.0,4));
		
	}

	@Override
	public List<Product> findAll() {
		
		return list;
	}

	@Override
	public Product getProduct(int id) {
		
		Product p=null;
		for(Product product:list) {
			if(product.getId()==id) {
				p=product;
				break;
			}
			
		}
		return p;
	
	}

	@Override
	public Product addProduct(Product product) {
		list.add(product);
		
		return product;
	}

@Override
public Product updateProduct(Product product) {
		list.forEach(e -> {
			if(e.getId() == product.getId()) {
		e.setPname(product.getPname());
	e.setBatchno(product.getBatchno());
e.setPrice(product.getPrice());
e.setNoofproduct(product.getNoofproduct());
			}
	});
	return product;
}






}
