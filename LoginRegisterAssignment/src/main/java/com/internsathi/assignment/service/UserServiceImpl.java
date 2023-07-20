package com.internsathi.assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.internsathi.assignment.dao.UserRepository;
import com.internsathi.assignment.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(User u) {
		return this.userRepository.save(u);

	}

}
