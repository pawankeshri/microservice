package com.niit.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.niit.helloworld"})
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = 
		          new AnnotationConfigApplicationContext(Application.class);
		MessageService service = context.getBean(MessageService.class);
        System.out.println("Message : " + service.getMessage());
	}

}
