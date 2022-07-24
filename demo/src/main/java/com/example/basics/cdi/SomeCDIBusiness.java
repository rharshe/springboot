package com.example.basics.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SomeCDIBusiness {
	
	@Inject
	SomeCDIDAO someCDIDAO;

	public SomeCDIDAO getSomeCDIDAO() {
		return someCDIDAO;
	}

	public void setSomeCDIDAO(SomeCDIDAO someCDIDAO) {
		this.someCDIDAO = someCDIDAO;
	}
	

}
