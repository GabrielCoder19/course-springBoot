package com.gabriel.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.workshop.entities.User;
import com.gabriel.workshop.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

//buscando todos usuarios
	public List<User> findAll() {

		return repository.findAll();
	}

//	Realiza a busca por Id
	public User findById(Long id) {
      
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
