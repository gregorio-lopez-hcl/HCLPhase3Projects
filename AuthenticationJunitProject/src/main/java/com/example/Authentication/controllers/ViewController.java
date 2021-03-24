package com.example.Authentication.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Authentication.entities.UserAuth;
import com.example.Authentication.services.UserService;


@Controller
public class ViewController {

	@Autowired
	UserService userservice;  
	

    @GetMapping("/")
    public String showGreeting(ModelMap map) {
        return "index";
    }


    @GetMapping("/login")
    public String showLogin(ModelMap map) {
    	
        return "login";
    }

    @PostMapping("/login")
    public String userLogin(@RequestParam(value="name") String name, @RequestParam(value="password") String password) {
 
    	Logger logger = LoggerFactory.getLogger(ViewController.class);
    	
    	logger.info("*************Login parameters: Username - " + name);
    	logger.info("*************Login parameters: Pass - " + password);
    	
    	
		UserAuth user = userservice.GetUserByName(name); 
		
		if (user != null) {

		logger.info("*************Actual parameters: Username - " + user.getName());
    	logger.info("*************Actual parameters: Pass - " + user.getPassword());
		
		return userservice.checkPassword(user, password);
		
		} else { 
			return "failure"; 
		}
       
	}
        
 
}
