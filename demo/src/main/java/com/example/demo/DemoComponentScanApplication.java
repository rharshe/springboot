package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.basics.componentscan.ComponentDAO;


@Configuration
@ComponentScan("com.example.basics.componentscan")
public class DemoComponentScanApplication {
	
	
	public static void main(String[] args) {
		
	//	ApplicationContext applicationContext = 
				AnnotationConfigApplicationContext applicationContext=
						new AnnotationConfigApplicationContext(DemoComponentScanApplication.class);
				//SpringApplication.run(DemoComponentScanApplication.class, args);
		ComponentDAO componentDAO= applicationContext.getBean(ComponentDAO.class);
		System.out.println(componentDAO);
		System.out.println(componentDAO.getComponentJdbcConnection());
		Logger LOGGER=LoggerFactory.getLogger(DemoComponentScanApplication.class);
		LOGGER.info("{}", componentDAO);
		
	
	}

}
