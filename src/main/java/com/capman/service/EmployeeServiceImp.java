package com.capman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capman.entity.Employee;
import com.capman.repository.EmployeeRepo;

@Service
public class EmployeeServiceImp implements EmployeeService{
	@Autowired
	private EmployeeRepo repository;
	
	@Override
	public List<Employee> findAll() { return repository.findAll(); }

	@Override
	public Employee findById(Integer id) { return repository.findById(id); }

	@Override
	public Employee add(Employee e) { return repository.save(e); }

	@Override
	public Employee edit(Employee e) { return repository.save(e); }

	@Override
	public void deleteById(Integer id) {repository.deleteById(id);}
	
	
	
}
