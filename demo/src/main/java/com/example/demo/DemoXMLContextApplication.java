package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.xml.XmlPersonDAO;



public class DemoXMLContextApplication {
	//what are the beans
	//what are the dependencies of bean
	//where to search for bean?==no need as it is in same package
	private static Logger LOGGER=LoggerFactory.getLogger(DemoXMLContextApplication.class);
	public static void main(String[] args) {
		//BinarySearchImpl binarySearch=new BinarySearchImpl(new QuickSortAlgorithm());
		
		//Application context will maintain all bean 
		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")){
			//SpringApplication.run(DemoBasicApplication.class, args);
			LOGGER.info("Beans Loaded -> {}",(Object)applicationContext.getBeanDefinitionNames());
			XmlPersonDAO personDao= applicationContext.getBean(XmlPersonDAO.class);
			LOGGER.info("{} {}",personDao, personDao.getXmlJdbcConnection());
		}
				
	}

}
