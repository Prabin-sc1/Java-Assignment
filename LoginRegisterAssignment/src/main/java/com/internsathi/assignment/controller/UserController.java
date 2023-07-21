package com.internsathi.assignment.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.internsathi.assignment.dao.UserRepository;
import com.internsathi.assignment.model.User;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/")
	public String home() {
		return "/user/home";
	}

	@RequestMapping("/profile")
	public String profile(Model m, Principal p) {
		String name = p.getName();
		User tempUser = this.userRepository.getUserByUserName(name);
		System.out.println(tempUser.getName());
		m.addAttribute("title", "User profile");
		m.addAttribute("user", tempUser);
		return "user/profile";
	}

	@RequestMapping("/change-password")
	public String changePassword(Model m) {

		m.addAttribute("title", "Change password");

		return "user/change_password";
	}

}
