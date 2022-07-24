package com.example.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.basic.BinarySearchImpl;


@Configuration
@ComponentScan
public class DemoBasicApplication {
	//what are the beans
	//what are the dependencies of bean
	//where to search for bean?==no need as it is in same package

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch=new BinarySearchImpl(new QuickSortAlgorithm());
		
		//Application context will maintain all bean 
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(DemoBasicApplication.class)){
			//SpringApplication.run(DemoBasicApplication.class, args);
			BinarySearchImpl binarySearch= applicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearch1= applicationContext.getBean(BinarySearchImpl.class);
			System.out.println(binarySearch);
			System.out.println(binarySearch1);
			
			int result=binarySearch.binarySearch(new int[] {12,4,6}, 3);
			System.out.println(result);
		}
				
	}

}
