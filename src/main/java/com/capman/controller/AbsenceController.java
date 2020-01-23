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

import com.capman.entity.Absence;
import com.capman.service.AbsenceService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/absences")
public class AbsenceController {
	
	@Autowired
	AbsenceService service;
	
	@GetMapping(value = "/list")
	public List<Absence>findAll(){ return service.findAll(); }

	@PostMapping 
	public Absence add(@RequestBody Absence a) { 
		if(a.getStartDate() == null) { a.setStartDate(LocalDate.now()); }
		if(a.getEndDate() == null) { a.setEndDate(LocalDate.now()); }
		
		return service.add(a); 
		
	}
	
	@GetMapping(path = "/{id}")
	public Absence findById(@PathVariable("id") int id) { return service.findById(id); }
	
	@PutMapping(path = {"/{id}"})
	public Absence edit(@RequestBody Absence a, @PathVariable ("id") int id) { 
		a.setId(id);
		return service.edit(a);
	}
	
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable("id") int id) { service.deleteById(id);} 
}
