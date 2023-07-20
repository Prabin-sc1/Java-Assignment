package com.internsathi.assignment.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.internsathi.assignment.dao.UserRepository;
import com.internsathi.assignment.model.User;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User tempUser = this.userRepository.findByEmail(email);
		if (tempUser != null) {
			return new CustomUserDetails(tempUser);
		}
		throw new UsernameNotFoundException("user not available");
	}

}
