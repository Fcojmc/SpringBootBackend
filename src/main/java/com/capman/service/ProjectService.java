package com.capman.service;

import java.util.List;

import com.capman.entity.Project;

public interface ProjectService {
	List<Project>findAll();
	Project findById(Integer id);
	Project add(Project p);
	Project edit(Project p);
	void deleteById(Integer id);
}
