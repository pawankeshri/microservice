package com.example.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value="/hello")
	public String fetchMessage(){
		return "Hello Today3 1 2";
	}
	
	
}
