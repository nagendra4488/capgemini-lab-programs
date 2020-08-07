package com.capg.demo.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.demo.product.model.Product;

public interface ProductDataJpaRepo extends JpaRepository<Product , Integer>{

}
