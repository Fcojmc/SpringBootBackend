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

import com.capman.entity.EmployeeProjectPeriod;
import com.capman.service.EmployeeProjectPeriodService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/employeeProjectPeriod")
public class EmployeeProjectPeriodController {
	
	@Autowired
	EmployeeProjectPeriodService service;
	
	@GetMapping(value = "/list")
	public List<EmployeeProjectPeriod>findAll(){ return service.findAll(); }
	
	@PostMapping
	public EmployeeProjectPeriod add(@RequestBody EmployeeProjectPeriod epp) { 
		if(epp.getStartDate() == null) { epp.setStartDate(LocalDate.now()); }
		if(epp.getEndDate() == null) { epp.setEndDate(LocalDate.now()); }
		
		return service.add(epp); 
	}
	
	@GetMapping(path = "/{id}")
	public EmployeeProjectPeriod findById(@PathVariable("id") int id) { return service.findById(id); }
	
	@PutMapping(path = {"/{id}"})
	public EmployeeProjectPeriod edit(@RequestBody EmployeeProjectPeriod epp, @PathVariable ("id") int id) { 
		epp.setId(id);
		return service.edit(epp);
	}
	
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable("id") int id) { service.deleteById(id);}
}
