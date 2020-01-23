package com.capman.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capman.entity.User;
import com.capman.service.UserService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping(value  = "/list")
	public List<User>findAll(){ return service.findAll(); }
	
	@PostMapping
	public User add(@RequestBody User u) { return service.add(u); }
	
	@GetMapping(path = {"/{id}"})
	public User findById(@PathVariable("id") int id) { return service.findById(id); }
	
	@PutMapping(path = {"/{id}"})
	public User edit(@RequestBody User u, @PathVariable ("id") int id) { 
		u.setId(id);
		return service.edit(u);
	}
	
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable("id") int id) { service.deleteById(id);}
}
