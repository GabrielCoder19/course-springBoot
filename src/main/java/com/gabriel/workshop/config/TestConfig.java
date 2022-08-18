package com.gabriel.workshop.config;

import java.util.Arrays;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gabriel.workshop.entities.User;
import com.gabriel.workshop.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// tudo que tiver aqui dentro vai rodar ao iniciar

		User u1 = new User(null, "gabriel", "gabriel@gmail.com", "123456789", "senha123");

		User u2 = new User(null, "jheniffer", "jhenni@gmail.com", "12345678910", "senha12345");

		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
