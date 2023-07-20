package com.internsathi.assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.internsathi.assignment.dao.UserRepository;
import com.internsathi.assignment.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public User createUser(User u) {
		u.setPassword(bCryptPasswordEncoder.encode(u.getPassword()));
		u.setRole("ROLE_USER");
		return this.userRepository.save(u);

	}

	@Override
	public boolean checkEmail(String email) {
		return this.userRepository.existsByEmail(email);

	}

}
