package com.example.TaskManager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
	public String showLogin(ModelMap map) {
		return "login"; 
	} 
	
	@GetMapping(value="/register")
    public String showRegisterUser(ModelMap map) {   
		 return "register";
    }
	
	@GetMapping(value="/register-success")
    public String showRegistrationSucc() {   
		 return "register-success";
    }
	
	@GetMapping(value="/userhome")
	public String showUHome() { 
		return "userhome"; 
	}
	
	@GetMapping(value="/addtask")
    public String showTaskPage() {   

		return "addtask";
	}
	
	/*
	 * @GetMapping(value="/list") public String showUTasks() { return "list"; }
	 */

	@GetMapping(value="/delete")
	public String showTaskDelete() { 
		return "delete"; 
	}
	
	@GetMapping(value="/edit")
	public String showTaskEdit() { 
		return "edit"; 
	}
	
}
