package com.internsathi.assignment.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.internsathi.assignment.dao.UserRepository;
import com.internsathi.assignment.helper.MyMessage;
import com.internsathi.assignment.model.User;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

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

	@PostMapping("/changePassword")
	public String changePassword(@RequestParam("oldPassword") String oldPassword,
			@RequestParam("newPassword") String newPassword, Principal p, HttpSession session) {
		System.out.println("Old password::" + oldPassword);
		String name = p.getName();

		User tempUser = this.userRepository.getUserByUserName(name);
		String oldPassword1 = tempUser.getPassword();

		if (this.bCryptPasswordEncoder.matches(oldPassword, oldPassword1)) {
			tempUser.setPassword(this.bCryptPasswordEncoder.encode(newPassword));
			this.userRepository.save(tempUser);

			this.userRepository.save(tempUser);
			session.setAttribute("msg", new MyMessage("Successfully Updated!! ", "alert-success"));
			return "user/change_password";
		} else {
			System.out.println("password doesn't matches");
			session.setAttribute("msg", new MyMessage("Password doesn't match. ", "alert-danger"));
			return "user/change_password";

		}

	}
}
