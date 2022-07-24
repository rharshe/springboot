package com.example.demojpa;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demojpa.entity.User;
import com.example.demojpa.service.UserDAOService;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

	private static final Logger log=
			org.slf4j.LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
	@Autowired
	private UserDAOService userDaoService;
	
	@Override
	public void run(String... args) throws Exception {
		User user=new User("Jack", "admin");
		long insert=userDaoService.insert(user);
		log.info("new user inserted: "+user);
	}

}
