package com.example.TaskManager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.TaskManager.entities.User;
import com.example.TaskManager.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userSer; 

	@PostMapping(value="/login")
	public String validateLogin(@RequestParam(value="name") String name, @RequestParam(value="password") String password) {
	 	 boolean check = userSer.authUser(name, password); 
	 	 
	 	 if (check) { 
	 		 return "userhome";
	 	 } else {
	 		 return "error"; 
	 	 }
	}

	
	@PostMapping(value="/register")
	public String recordRegister(@RequestParam(value="name") String name, 
			@RequestParam(value="email") String email, @RequestParam(value="password") String password) { 
		
		User u = new User(); 
		u.setName(name); 
		u.setEmail(email);
		u.setPassword(password);
		userSer.regNewUser(u);
		
		return "register-success"; 
		
	

	}
	


}
