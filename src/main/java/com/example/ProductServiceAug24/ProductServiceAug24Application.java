package com.example.ProductServiceAug24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class ProductServiceAug24Application { //go to dependencies, remove tomcat, add spring web and refresh dependencies

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceAug24Application.class, args);
	}

}
