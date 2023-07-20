package com.internsathi.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.internsathi.assignment.model.User;
import com.internsathi.assignment.service.UserService;

import jakarta.servlet.http.HttpSession;

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
	public String createUser(@ModelAttribute User u, HttpSession session) {
		if (this.userService.checkEmail(u.getEmail())) {
//			System.out.println("user already exists");

			session.setAttribute("msg", "user of this email already exists");
			
		} else {

			User tempUser = this.userService.createUser(u);
			if (tempUser != null) {
//				System.out.println("registered successfully");
				session.setAttribute("msg", "registered successfully");
			} else {
				//System.out.println("something went wrong");

				session.setAttribute("msg", "something went wrong");
			}

		}
		return "redirect:/register";
	}

}
