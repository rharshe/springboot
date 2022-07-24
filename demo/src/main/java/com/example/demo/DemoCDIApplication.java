package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.basics.cdi.SomeCDIBusiness;


@Configuration
@ComponentScan("com.example.basics.cdi")
public class DemoCDIApplication {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(DemoCDIApplication.class);
				//SpringApplication.run(DemoCDIApplication.class, args);
		SomeCDIBusiness someCDIBusiness= applicationContext.getBean(SomeCDIBusiness.class);
		System.out.println(someCDIBusiness);
		System.out.println(someCDIBusiness.getSomeCDIDAO());
		 Logger LOGGER=LoggerFactory.getLogger(DemoCDIApplication.class);
		LOGGER.info("{} dao-{}", someCDIBusiness,someCDIBusiness.getSomeCDIDAO());
		
	}

}
