package com.example.TaskManager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TaskManager.entities.User;
import com.example.TaskManager.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;
	
	public String regNewUser(User user) {
	    	
		if (userRepo.save(user) != null){
			return user.toString() + "/";
		} else {
			return "/error"; 
		}
	}
	
	public String authUser(User user, String name, String password) { 

		if(user.getName().equals(name) && user.getPassword().equals(password)) { 
			
			return "/userhome"; 
		}
		else {
			return "/error"; 
		}
	}
	
	
}
