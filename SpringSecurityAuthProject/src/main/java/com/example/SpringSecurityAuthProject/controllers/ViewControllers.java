package com.example.SpringSecurityAuthProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewControllers {

	@GetMapping("/")
	public String viewHome() { 
		return "index"; 
	}

	@GetMapping("/user")
	public String viewUserLogin () { 
		return ("<h3>Welcome User</h3>"); 
	}
	
}
