package com.felipevieira.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipevieira.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	
	@GetMapping
	public ResponseEntity<User> findAll() {
		
		User u = new User(1L, "Felipe", "felipe@gmail.com", "000000", "12344");
		return ResponseEntity.ok().body(u);
	}
	
}
