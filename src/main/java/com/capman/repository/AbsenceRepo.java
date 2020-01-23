package com.capman.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.capman.entity.Absence;

public interface AbsenceRepo extends Repository<Absence, Integer> {
	List<Absence>findAll();
	Absence findById(Integer id);
	Absence save(Absence a);
	void deleteById(Integer id);
}
