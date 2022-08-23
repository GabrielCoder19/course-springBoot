package com.gabriel.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.workshop.entities.Order;
import com.gabriel.workshop.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

//buscando todos usuarios
	public List<Order> findAll() {

		return repository.findAll();
	}

//	Realiza a busca por Id
	public Order findById(Long id) {
      
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
