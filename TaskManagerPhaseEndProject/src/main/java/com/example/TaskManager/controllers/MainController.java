package com.example.TaskManager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping(value ="/error")
	public String error() {
		return "error"; 
	}
	
	@GetMapping(value="/")
    public String showIndexPage() {   
		 return "index";
    }
	
	@GetMapping(value = "/login")
	public String showLogin() {
		return "login"; 
	} 
	
	@GetMapping(value="/register")
    public String showRegisterUser() {   
		 return "register";
    }
	
	@GetMapping(value="/userhome")
	public String showUHome() { 
		return "userhome"; 
	}
	
	@GetMapping(value="/addtask")
    public String showTaskPage() {   

		return "taskform";
	}
	
	@GetMapping(value="/list")
	public String showTaskList() { 
		return "list"; 
	}

}
