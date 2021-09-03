package com.javatpoint.springbootrestexample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
@Autowired

private IProductService productService;

@GetMapping("/product")
public List<Product>getProducts()
{
	return this.productService.findAll();
}
@GetMapping("/product/{id}")
public Product getProduct(@PathVariable String id) {
	return this.productService.getProduct(Integer.parseInt(id));
}
@PostMapping("/product")
public Product addProduct(@RequestBody Product product) {
return this.productService.addProduct(product);	
}
@PutMapping("/updateproduct")
public Product updateProduct(@RequestBody Product product) {
	return this.productService.updateProduct(product);
}
}
