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

import com.capman.entity.Skill;
import com.capman.service.SkillService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/skills")
public class SkillController {
	@Autowired
	SkillService service;
	
	@GetMapping(value  = "/list")
	public List<Skill>findAll(){ return service.findAll(); }
	
	@PostMapping
	public Skill add(@RequestBody Skill s) { return service.add(s); }
	
	@GetMapping(path = "/{id}")
	public Skill findById(@PathVariable("id") int id) { return service.findById(id); }
	
	@PutMapping(path = {"/{id}"})
	public Skill edit(@RequestBody Skill s, @PathVariable ("id") int id) { 
		s.setId(id);
		return service.edit(s);
	}
	
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable("id") int id) { service.deleteById(id);}
}
