package com.capman.service;

import java.util.List;

import com.capman.entity.Absence;

public interface AbsenceService {
	List<Absence>findAll();
	Absence findById(Integer id);
	Absence add(Absence a);
	Absence edit(Absence a);
	void deleteById(Integer id);
}
