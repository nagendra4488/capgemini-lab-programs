package com.capg.demo.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.product.errors.ProductAlreadyExistsException;
import com.capg.demo.product.errors.ProductNotFoundException;
import com.capg.demo.product.model.Product;
import com.capg.demo.product.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService service;
	
	@PostMapping("/products")
	public Product addTrainee(@RequestBody Product product) throws ProductAlreadyExistsException {
		return service.addProduct(product);
	}
	
	@GetMapping("/products")
	public List<Product> getAllTrainees(){
		return service.getAllProducts();
	}
	
	@GetMapping("/products/id/{id}")
	public Product getTrainee(@PathVariable int id) throws ProductNotFoundException {
		return service.getProduct(id);
	}

	
	@DeleteMapping("/products/id/{id}")
	public void deleteProduct(@PathVariable int id) throws ProductNotFoundException {
		service.deleteProduct(id);
	}

	
}
