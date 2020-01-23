package com.capman.service;

import java.util.List;

import com.capman.entity.EmployeeProjectPeriod;

public interface EmployeeProjectPeriodService {
	List<EmployeeProjectPeriod>findAll();
	EmployeeProjectPeriod findById(Integer id);
	EmployeeProjectPeriod add(EmployeeProjectPeriod epp);
	EmployeeProjectPeriod edit(EmployeeProjectPeriod epp);
	void deleteById(Integer id); 
}
