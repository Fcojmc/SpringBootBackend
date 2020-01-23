package com.capman.repository;

import java.util.List;
import org.springframework.data.repository.Repository;
import com.capman.entity.Skill;

public interface SkillRepo extends Repository<Skill, Integer>{
	List<Skill>findAll();
	Skill findById(Integer id);
	Skill save(Skill s);
	void deleteById(Integer id);
}
