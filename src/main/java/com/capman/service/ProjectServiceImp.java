package com.capman.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capman.entity.Project;
import com.capman.repository.ProjectRepo;

@Service
public class ProjectServiceImp implements ProjectService {
	@Autowired
	private ProjectRepo repository;

	@Override
	public List<Project> findAll() { return repository.findAll(); }

	@Override
	public Project findById(Integer id) { return repository.findById(id); }

	@Override
	public Project add(Project p) { 
		if(p.getStartDate() == null){ p.setStartDate(LocalDate.now()); }
		if(p.getEndDate() == null){ p.setEndDate(LocalDate.now()); }
		return repository.save(p); 
		
	}

	@Override
	public Project edit(Project p) { return repository.save(p); }

	@Override
	public void deleteById(Integer id) { repository.deleteById(id);}
	
	
}
