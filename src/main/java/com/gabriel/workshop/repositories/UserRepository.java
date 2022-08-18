package com.gabriel.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.workshop.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

	
		
	}


