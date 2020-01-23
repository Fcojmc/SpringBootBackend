package com.capman.service;

import java.util.List;

import com.capman.entity.Employee;

public interface EmployeeService {
	List<Employee> findAll();
	Employee findById(Integer id);
	Employee add(Employee e);
	Employee edit(Employee e);
	void deleteById(Integer id);
	
}
