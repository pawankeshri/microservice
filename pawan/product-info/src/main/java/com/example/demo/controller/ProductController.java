package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Item;
import com.example.demo.model.Product;
import com.example.demo.service.PrdoductInfoService;



@RestController
public class ProductController {

	@Autowired
	public  PrdoductInfoService prdService;
	
	@RequestMapping(value="/productinfo",produces=MediaType.APPLICATION_JSON_VALUE)
	public Product getProductInfo(){
		Product it = new Product();
		it.setProductId("1");
		it.setProductName("fruit");
		List<Item> itemList = new ArrayList<Item>();
		Item item = prdService.getItemDetail();
		itemList.add(item);
		it.setItems(itemList);
		return it;
	}
}
