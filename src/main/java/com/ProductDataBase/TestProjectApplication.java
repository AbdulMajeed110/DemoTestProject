package com.ProductDataBase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.ProductDataBase.Entity.ProductEntity;
import com.ProductDataBase.Repository.ProductRepository;

@SpringBootApplication
public class TestProjectApplication {

	public static void main(String[] args) {
	    ApplicationContext context	= SpringApplication.run(TestProjectApplication.class, args);
	    
	   ProductRepository ProductRepository = context.getBean(ProductRepository.class);
	   
	   ProductEntity product = new ProductEntity();
	   product.setProductName("Book");
	   product.setDetail("Chemistry");
	   product.setPrices(1500);
	   
	   ProductEntity product1 = ProductRepository.save(product);
	   System.out.println(product1);
	   
	}

}
