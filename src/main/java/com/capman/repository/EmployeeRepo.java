package com.capman.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.capman.entity.Employee;

public interface EmployeeRepo  extends Repository<Employee, Integer>{
	List<Employee>findAll();
	Employee findById(Integer id);
	Employee save(Employee e);
	void deleteById(Integer id);
}
