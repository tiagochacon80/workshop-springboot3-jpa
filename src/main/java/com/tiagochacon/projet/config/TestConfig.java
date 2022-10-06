package com.tiagochacon.projet.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.tiagochacon.projet.entities.User;
import com.tiagochacon.projet.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Jon Snow", "jon@gmai.com", "111122222", "987456");
		User u2 = new User(null, "Tywin Lannister", "tywin@gmail.com", "888899999", "235418");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
