package com.internsathi.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.internsathi.assignment.model.User;
import com.internsathi.assignment.service.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("/signin")
	public String login() {
		return "login";
	}

	@RequestMapping("/register")
	public String register(Model m) {
		m.addAttribute("user", new User());
		return "register";
	}

	@PostMapping("/create-user")
	public String createUser(@Valid @ModelAttribute User user, BindingResult result, HttpSession session, Model m) {

		try {
			if (result.hasErrors()) {
				System.out.println("Error :: " + result.toString());
				m.addAttribute("user", user);

				session.setAttribute("msg", "Something went wrong!! ");

				return "register";
			}

			if (this.userService.checkEmail(user.getEmail())) {
				session.setAttribute("msg", "user of this email already exists");

			} else {

				User tempUser = this.userService.createUser(user);
				if (tempUser != null) {
					session.setAttribute("msg", "registered successfully");
				} else {

					session.setAttribute("msg", "something went wrong");
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:/register";
	}

}
