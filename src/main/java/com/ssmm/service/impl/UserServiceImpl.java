package com.ssmm.service.impl;

import org.springframework.stereotype.Service;

import com.ssmm.dao.UserMapper;
import com.ssmm.model.User;
import com.ssmm.service.UserService;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public User getUserById(int id) {
		return userMapper.selectByPrimaryKey(id);
	}

	public void saveUser(User user) {
		userMapper.insert(user);
	}

	public List<User> getAll() {
		return userMapper.getAll();
	}

	//	@Override
//	public void saveUser(User user) {
//		userMapper.insert(user);
////		抛出运行时异常，sql会自动rollback
////		throw new RuntimeException();
//	}

}
