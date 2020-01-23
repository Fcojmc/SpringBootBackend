package com.capman.service;

import java.util.List;

import com.capman.entity.User;

public interface UserService {
	
	List<User> findAll();
	User findById(Integer id);
	User add(User u);
	User edit(User u);
	void deleteById(Integer id);
	
}
