package com.example.UserFeedback.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserFeedback.entities.Feedback;
import com.example.UserFeedback.services.FeedbackService;

@RestController
public class FeedbackController {
	
	@Autowired
	FeedbackService feedbackService;
	
	 Logger logger = LoggerFactory.getLogger(FeedbackController.class); 
	
	@GetMapping(value = "/feedback", produces = "application/json")
	public @ResponseBody Iterable<Feedback> displayFeedback() {
		
        return feedbackService.GetAllFeedback();
    }
	
	@PostMapping(value="/updatefeedback", consumes = {"application/x-www-form-urlencoded"})
    public Feedback addNewFeedback(@RequestParam(value="user", required=false) String user, @RequestParam(value="rating", required=false) int rating, @RequestParam(value="comments", required=false) String comments) {
 
        Feedback f = new Feedback();

      
            f.setComments(comments);
            f.setRating(rating);
            f.setUser(user);
            return feedbackService.updateFeedback(f);
        

       
	}

	  @PostMapping(value="/updatefeedback", consumes= {"application/json"} ) public
	  Feedback addNewFeedback(@RequestBody Feedback newFeedback) {
	  
	  return (Feedback) feedbackService.updateFeedback(newFeedback); }
	 
	
}
