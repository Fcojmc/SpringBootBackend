package com.capman.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.capman.entity.Project;

public interface ProjectRepo extends Repository<Project, Integer> {
	List<Project>findAll();
	Project findById(Integer id);
	Project save(Project p);
	void deleteById(Integer id);
}
