package com.capg.demo.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.capg.demo.product.model.Product;

public class ProductController {

	@Autowired
	RestTemplate rt;

	@PostMapping("/addProduct")
	public String addProduct(@ModelAttribute Product product, Model m) {
		Product tr=rt.postForObject("http://localhost:8888/products", product, Product.class);
		m.addAttribute("product", tr);
		return "success.jsp";
	}
	
	@GetMapping("/getProduct")
	public String getProduct(@RequestParam("productId") int productId, Model m) {
		Product tr=rt.getForObject("http://localhost:8888/products/id/"+productId,Product.class);
		m.addAttribute("product", tr);
		return "show.jsp";
		
	}
	
}
