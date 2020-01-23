package com.capman.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.capman.entity.User;

public interface UserRepo extends Repository<User, Integer>{
	
	List<User>findAll();
	User findById(Integer id);
	User save(User u);
	void deleteById(Integer id);
	
}
