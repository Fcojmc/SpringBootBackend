package com.capman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capman.entity.EmployeeProjectPeriod;
import com.capman.repository.EmployeeProjectPeriodRepo;



@Service
public class EmployeeProjectPeriodServiceImpl implements EmployeeProjectPeriodService {
	@Autowired
	private EmployeeProjectPeriodRepo repository;
	
	@Override
	public List<EmployeeProjectPeriod> findAll() { return repository.findAll(); }

	@Override
	public EmployeeProjectPeriod findById(Integer id) { return repository.findById(id); }

	@Override
	public EmployeeProjectPeriod add(EmployeeProjectPeriod epp) { return repository.save(epp); }

	@Override
	public EmployeeProjectPeriod edit(EmployeeProjectPeriod epp) { return repository.save(epp); }

	@Override
	public void deleteById(Integer id) { repository.deleteById(id); }
	
	
}
