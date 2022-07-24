package com.example.demojpa;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demojpa.entity.User;
import com.example.demojpa.service.UserDAOService;
import com.example.demojpa.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

	private static final Logger log=
			org.slf4j.LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User user=new User("Jill", "admin");
		userRepository.save(user);
		log.info("new user inserted: "+user);
		
		Optional<User> userWithIdOne=userRepository.findById(1L);
		log.info("User is retrieved: "+userWithIdOne);
		
		List<User> users=userRepository.findAll();
		log.info("All users: "+users);
	}

}
