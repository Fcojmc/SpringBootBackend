package com.capman.controller;

import java.time.LocalDate;
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

import com.capman.entity.Project;
import com.capman.service.ProjectService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/projects")
public class ProjectController {
	@Autowired
	ProjectService service;
	
	@GetMapping(value = "/list")
	public List<Project>findAll(){ return service.findAll(); }
	
	@PostMapping
	public Project add(@RequestBody Project p) { 
		if(p.getStartDate() == null) { p.setStartDate(LocalDate.now()); }
		if(p.getEndDate() == null) { p.setEndDate(LocalDate.now()); }
		
		return service.add(p); 
	}
	
	@GetMapping(path = "/{id}")
	public Project findById(@PathVariable("id") int id) { return service.findById(id); }
	
	@PutMapping(path = {"/{id}"})
	public Project edit(@RequestBody Project p, @PathVariable ("id") int id) { 
		p.setId(id);
		return service.edit(p);
	}
	
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable("id") int id) { service.deleteById(id);}
}
