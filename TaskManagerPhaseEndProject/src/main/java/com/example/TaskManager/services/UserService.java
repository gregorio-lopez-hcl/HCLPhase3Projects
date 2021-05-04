package com.example.TaskManager.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TaskManager.entities.User;
import com.example.TaskManager.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;
	
	
	public User getUserByName (String name) { 
		User u = userRepo.findByName(name); 
		return u; 
	}
	
	public User getUserById (Integer id)  {
		Optional<User> u = userRepo.findById(id);
		
		if(!u.isPresent()) {
				throw new UserNotFoundException();
				
		}
		
		return (u.get());
	}
	
	public void regNewUser(User user) {
	    	userRepo.save(user);
	}
	
	public boolean authUser(String name, String password) { 

		User u = new  User(); 
		u = userRepo.findByName(name); 
		
		
		if(u.getName().equals(name) && u.getPassword().equals(password)) { 
			
			return true; 
		}
		else {
			return false; 
		}
	}
	
	public class UserNotFoundException extends RuntimeException { 
		private static final long serialVersionUID = 1L; 
	}
	
	
}
