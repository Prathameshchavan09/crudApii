package com.springcrud.crudApii.crudApii;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springcrud.crudApii.crudApii.controller", "com.springcrud.crudApii.crudApii.service" , "com.springcrud.crudApii.crudApii.dao"})
public class CrudApiiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApiiApplication.class, args);
		System.out.println("running");
	}

}
