package com.ProductDataBase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.ProductDataBase.Entity.ProductEntity;
import com.ProductDataBase.Repository.ProductRepository;

@SpringBootApplication
public class TestProjectApplication {

	private static final String List = null;

	public static void main(String[] args) {
	    ApplicationContext context	= SpringApplication.run(TestProjectApplication.class, args);
	    
	   ProductRepository ProductRepository = context.getBean(ProductRepository.class);
	   
//	   ProductEntity product = new ProductEntity();
//	   product.setProductName("Book");
//	   product.setDetail("Chemistry");
//	   product.setPrices(1500);
	   
	   ProductEntity product1 = new ProductEntity();
	   product1.setProductName("Book");
	   product1.setDetail("Islamiyat");
	   product1.setPrices(1000);
	   
	   ProductEntity product2 = new ProductEntity();
	   product2.setProductName("Book");
	   product2.setDetail("Sindhi");
	   product2.setPrices(1000);
//	   Save only one Value--------------
//	   ProductEntity product3 = ProductRepository.save(product2);
//	   System.out.println("Product saved "+product3);
// TODO Auto-generated method stub
//     Use SaveAll Values---------------
	   
//	   java.util.List<ProductEntity> product5 = java.util.List.of(product1, product2);
//	   
//	   Iterable<ProductEntity> product6 = ProductRepository.saveAll(product5);
//	   product6.forEach(users->{ 
//		   System.out.println(users);
//	   });
	   
	}

	
}
