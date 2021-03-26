package com.example.SpringSecurityAuthProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewControllers {

	@GetMapping("/")
	public String viewHome() { 
		return "index"; 
	}

	@GetMapping("/user")
	public String viewUserLogin () { 
		return ("userlogin"); 
	}

	@GetMapping("/admin")
	public String viewAdminLogin () { 
		return "adminlogin" ; 
	}
}
