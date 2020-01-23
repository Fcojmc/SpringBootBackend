package com.capman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capman.entity.Skill;
import com.capman.repository.SkillRepo;

@Service
public class SkillServiceImp implements SkillService{
	@Autowired
	private SkillRepo repository;

	@Override
	public List<Skill> findAll() { return repository.findAll(); }

	@Override
	public Skill findById(Integer id) { return repository.findById(id); }

	@Override
	public Skill add(Skill s) { return repository.save(s); }

	@Override
	public Skill edit(Skill s) { return repository.save(s); }

	@Override
	public void deleteById(Integer id) {repository.deleteById(id);}
	
	
}
