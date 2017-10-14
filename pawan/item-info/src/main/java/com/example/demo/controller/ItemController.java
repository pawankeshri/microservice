package com.example.demo.controller;

import java.util.Date;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Item;

@RestController
public class ItemController {

	@RequestMapping(value= "/iteminfo", produces=MediaType.APPLICATION_JSON_VALUE)
		public Item getItem(){
		System.out.println("Hi I am getting a call "+new Date());
			Item it = new Item();
			it.setItemCode("1");
			it.setItemInfo("Apple");
			return it;
		}
}
