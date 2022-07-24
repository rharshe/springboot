package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.scope.PersonDAO;


@Configuration
@ComponentScan("com.example.demo.scope")
public class DemoScopeApplication {
	
	private static Logger LOGGER=LoggerFactory.getLogger(DemoScopeApplication.class);
	public static void main(String[] args) {
		
//		ApplicationContext applicationContext = 
//				SpringApplication.run(DemoScopeApplication.class, args);
		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(DemoScopeApplication.class);
		PersonDAO personDAO= applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2= applicationContext.getBean(PersonDAO.class);
		System.out.println(personDAO);
		System.out.println(personDAO.getJdbcConnection());
		System.out.println(personDAO2);
		System.out.println(personDAO2.getJdbcConnection());
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());
		LOGGER.info("{}", personDAO.getJdbcConnection());
		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO.getJdbcConnection());
	
	}

}
