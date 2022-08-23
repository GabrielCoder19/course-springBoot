package com.gabriel.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.workshop.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {

	
		
	}


