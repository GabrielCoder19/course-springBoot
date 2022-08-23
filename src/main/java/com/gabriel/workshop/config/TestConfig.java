package com.gabriel.workshop.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gabriel.workshop.entities.Order;
import com.gabriel.workshop.entities.User;
import com.gabriel.workshop.entities.enums.OrderStatus;
import com.gabriel.workshop.repositories.OrderRepository;
import com.gabriel.workshop.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		// tudo que tiver aqui dentro vai rodar ao iniciar

		User u1 = new User(null, "gabriel", "gabriel@gmail.com", "123456789", "senha123");
		User u2 = new User(null, "jheniffer", "jhenni@gmail.com", "12345678910", "senha12345");

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),u1, OrderStatus.PAID);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2, OrderStatus.SHIPPED);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1,OrderStatus.SHIPPED); 
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
}
