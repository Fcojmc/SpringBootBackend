package com.capman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capman.entity.Absence;
import com.capman.repository.AbsenceRepo;

@Service
public class AbsenceServiceImp implements AbsenceService{
	@Autowired
	private AbsenceRepo repository;

	@Override
	public List<Absence> findAll() { return repository.findAll(); }

	@Override
	public Absence findById(Integer id) { return repository.findById(id); }

	@Override
	public Absence add(Absence a) { return repository.save(a); }

	@Override
	public Absence edit(Absence a) { return repository.save(a); }

	@Override
	public void deleteById(Integer id) { repository.deleteById(id); }
	
	
}
