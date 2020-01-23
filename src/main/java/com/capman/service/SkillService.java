package com.capman.service;

import java.util.List;

import com.capman.entity.Skill;

public interface SkillService {
	List<Skill>findAll();
	Skill findById(Integer id);
	Skill add(Skill s);
	Skill edit(Skill s);
	void deleteById(Integer id);
}
