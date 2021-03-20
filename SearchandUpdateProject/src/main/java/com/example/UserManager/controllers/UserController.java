package com.example.UserManager.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.UserManager.entities.User;
import com.example.UserManager.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
    Logger logger = LoggerFactory.getLogger(UserController.class);

	
	@GetMapping("/users")
	public String showUsers(ModelMap model) {
		
		
		logger.info("Getting all Users");
		Iterable<User> users = userService.GetAllUsers();
		
		logger.info("Passing users to view");
	    model.addAttribute("users", users);    
		
        return "users";
    }
	
	@PostMapping ("/find")
	public String findUser(ModelMap model, @RequestParam(value="id") int userID) {
		
		logger.info("Finding user by ID");
		User user = userService.GetUserById(userID);
		
		model.addAttribute("users", user);

        return "edit";
		
	}
	
	@PostMapping ("/edit")
	public String editUser(ModelMap model, @RequestParam(value="id") int userID, @RequestParam(value = "name") String userName, @RequestParam (value
			= "email") String userEmail, @RequestParam(value = "password") String userPass) {
		
		
		logger.info("Editing slected User");
		User newu = new User(); 
		newu = userService.GetUserById(userID); 
		newu.setId(userID);
		newu.setName(userName);
		newu.setEmail(userEmail);
		newu.setPassword(userPass);
		userService.UpdateUser(newu);
	
		
		return "confirm"; 
			
	}

}


