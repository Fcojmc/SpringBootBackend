package com.capman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capman.entity.User;
import com.capman.repository.UserRepo;

@Service
public class UserServiceImp  implements UserService{
	@Autowired
	private UserRepo repository;
	
	@Override
	public List<User> findAll() { return repository.findAll(); }

	@Override
	public User findById(Integer id) { return repository.findById(id); }
 
	@Override
	public User add(User u) { return repository.save(u); }

	@Override
	public User edit(User u) { return repository.save(u); }

	@Override
	public void deleteById(Integer id) { repository.deleteById(id); }

}
