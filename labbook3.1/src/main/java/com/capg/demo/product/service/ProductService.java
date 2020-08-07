package com.capg.demo.product.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.demo.product.errors.ProductAlreadyExistsException;
import com.capg.demo.product.errors.ProductNotFoundException;
import com.capg.demo.product.model.Product;
import com.capg.demo.product.repo.ProductDataJpaRepo;

public class ProductService {

	
	@Autowired
	ProductDataJpaRepo dataJpaRepo;
	
	
	@Transactional
	public Product addProduct(Product product) throws ProductAlreadyExistsException {
		//return repo.addTrainee(trainee);
		if(dataJpaRepo.existsById(product.getProductId())){
			throw new ProductAlreadyExistsException("product already Exists");
		}
		return dataJpaRepo.save(product);
	}
	
	@Transactional
	public List<Product> getAllProducts(){
		
		
		return dataJpaRepo.findAll();
	
	}
	
	@Transactional
	public Product getProduct(int productId) throws ProductNotFoundException {
		
		if(!dataJpaRepo.existsById(productId)) {
			throw new ProductNotFoundException("Student with id: "+productId+" Not Found");
		}
		return dataJpaRepo.getOne(productId);
	}
		
	
	@Transactional
	public void deleteProduct(int productId) throws ProductNotFoundException {
		
		
		if(!dataJpaRepo.existsById(productId)) {
			throw new ProductNotFoundException("Student with id: "+productId+" Not Found");
		}
		
		dataJpaRepo.deleteById(productId);
	}
	
	
}
