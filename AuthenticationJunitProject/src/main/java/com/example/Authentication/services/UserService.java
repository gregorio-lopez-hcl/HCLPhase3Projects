package com.example.Authentication.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Authentication.entities.UserAuth;
import com.example.Authentication.exceptions.UserNotFoundException;
import com.example.Authentication.repositories.UserRepository;



@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public UserAuth GetUserByName(String name) {
		UserAuth foundUser = userRepository.findByName(name);
		return foundUser;
	}


	public String checkPassword(UserAuth un, String pass) { 
		
		if (un.getPassword().equals(pass)) {
			return "success";
		} else { 
			return "failure";  
		}
		
	}
	
	
}
