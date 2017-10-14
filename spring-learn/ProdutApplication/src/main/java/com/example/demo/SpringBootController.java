package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.jpa.Product;

@RestController
public class SpringBootController {
	@Autowired
	private Product product;
	
	@RequestMapping("/day3")
	public Product getProduct(){
		return product;
		
		
	}
	}


