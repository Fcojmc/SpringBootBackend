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

import com.capman.entity.Employee;
import com.capman.service.EmployeeService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping(value = "/list")
	public List<Employee>findAll(){ return service.findAll(); }
	
	@PostMapping
	public Employee add(@RequestBody Employee e) { return service.add(e); }
	 
	@GetMapping(path = "/{id}")
	public Employee findById(@PathVariable("id") Integer id) { return service.findById(id); }
	
	@PutMapping(path = {"/{id}"})
	public Employee edit(@RequestBody Employee e, @PathVariable ("id") int id) { 
		e.setId(id);
		return service.edit(e);
	}
	
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable("id") int id) { service.deleteById(id);}
}
