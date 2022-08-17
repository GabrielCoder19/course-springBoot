package com.gabriel.workshop.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.workshop.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
	 User u = new User( 1L,"gabriel", "gabriel@gmail.com","123456789","senha123");
//	 retornar o usuario
	 return ResponseEntity.ok().body(u);
	}

}
