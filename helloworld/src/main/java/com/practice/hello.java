package com.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
	
	@Autowired
	private MessageSource messageSource;
	
	@GetMapping("/hello/{name}")
	public HelloWorldBean hello(@PathVariable String name) {
		HelloWorldBean hwb= new HelloWorldBean();
		//hwb.setMessage("helloworld "+name);
		return hwb;
	}
	
	@GetMapping("/helloi18n")
	public String helloWorldi18n() {
		return messageSource.getMessage("good.morning.message",null,LocaleContextHolder.getLocale());
	}
	
	

}
