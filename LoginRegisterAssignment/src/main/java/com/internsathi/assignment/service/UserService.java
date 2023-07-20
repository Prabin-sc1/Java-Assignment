package com.internsathi.assignment.service;

import com.internsathi.assignment.model.User;

public interface UserService {

	User createUser(User u);

	boolean checkEmail(String email);

}
