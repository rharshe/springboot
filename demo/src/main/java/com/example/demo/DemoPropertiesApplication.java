package com.example.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.example.demo.basic.BinarySearchImpl;
import com.example.demo.properties.SomeExternalService;


@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class DemoPropertiesApplication {
	//what are the beans
	//what are the dependencies of bean
	//where to search for bean?==no need as it is in same package

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch=new BinarySearchImpl(new QuickSortAlgorithm());
		
		//Application context will maintain all bean 
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(DemoPropertiesApplication.class)){
			//SpringApplication.run(DemoBasicApplication.class, args);
			SomeExternalService someExternalService= applicationContext.getBean(SomeExternalService.class);
			
			System.out.println(someExternalService);
			System.out.println(someExternalService.returnServiceURL());
		}
				
	}

}
