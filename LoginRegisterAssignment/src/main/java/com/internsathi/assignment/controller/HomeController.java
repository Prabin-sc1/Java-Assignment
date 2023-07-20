package com.internsathi.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.internsathi.assignment.model.User;
import com.internsathi.assignment.service.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping("/register")
	public String register() {
		return "register";
	}

	@PostMapping("/create-user")
	public String createUser(@ModelAttribute User u) {
//		System.out.println("User :: " + u);
		
		User tempUser = this.userService.createUser(u);
		if(tempUser != null) {
			System.out.println("registered successfully");
		} else {
			System.out.println("something went wrong");
		}
		return "redirect:/register";
	}

}
