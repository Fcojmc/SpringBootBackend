package com.capman.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.capman.entity.EmployeeProjectPeriod;

public interface EmployeeProjectPeriodRepo extends Repository<EmployeeProjectPeriod, Integer> {
	List<EmployeeProjectPeriod>findAll();
	EmployeeProjectPeriod findById(Integer id);
	EmployeeProjectPeriod save(EmployeeProjectPeriod epp);
	void deleteById(Integer id);
}
