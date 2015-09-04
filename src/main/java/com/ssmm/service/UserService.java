package com.ssmm.service;

import com.ssmm.model.User;

import java.util.List;

public interface UserService {
	public User getUserById(int id);
	
	public void saveUser(User user);

	List<User> getAll();
}
