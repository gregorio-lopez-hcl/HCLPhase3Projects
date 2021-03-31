package com.example.TaskManager.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.TaskManager.entities.Task;
import com.example.TaskManager.entities.User;
import com.example.TaskManager.services.TaskService;
import com.example.TaskManager.services.UserService;

@RestController
public class UserController {
	
	
	
	@Autowired
	UserService userSer; 
	
	@Autowired
	TaskService taskSer;

//	@GetMapping(value = "/list")
//	public @ResponseBody Iterable<Task> displayTasks(User user) {
//		
//        return taskSer.GetTasksByUser(user);
//    }
	
	@PostMapping
	public String validateLogin(@RequestParam(value ="user") User user, @RequestParam(value="name") String name, @RequestParam(value="password") String password) {
	 	return userSer.authUser(user, name, password); 
	}

	
	@PostMapping(value="/register")
	public String recordRegister(@RequestParam(value="id") Integer id, @RequestParam(value="name") String name, 
			@RequestParam(value="email") String email, @RequestParam(value="password") String password) { 
		
		User u = new User(); 
		u.setId(id);
		u.setName(name); 
		u.setEmail(email);
		u.setPassword(password);
		return userSer.regNewUser(u);

	}
	


}
