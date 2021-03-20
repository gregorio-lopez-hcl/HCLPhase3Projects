package com.example.UserFeedback.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.UserFeedback.services.FeedbackService;

@Controller
public class TestFormController {
 
	@Autowired 
	private FeedbackService feedbackService; 
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/updatefeedback")
	public String addfeedback() { 
		return "updatefeedback"; 
	}

	
	

}
