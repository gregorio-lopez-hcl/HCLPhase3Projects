package com.example.TaskManager.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.TaskManager.entities.Task;
import com.example.TaskManager.entities.User;
import com.example.TaskManager.services.TaskService;

@RestController
public class TaskController {
	
	@Autowired
	TaskService taskSer;
	
	@PostMapping(value="/addtask")
	public Task recordNewTask(@RequestParam(value="name") String name, @RequestParam(value ="sdate") Date startDate,
			@RequestParam(value="edate") Date endDate, @RequestParam(value ="sev")String severity,@RequestParam(value="desc") String desc, 
			@RequestParam(value="user") User user) {
		
		Task t  = new Task(); 
		t.setName(name);
		t.setStartDate(startDate);
		t.setEndDate(endDate);
		t.setSeverity(severity);
		t.setDescription(desc);
		t.setUser(user);
		
		return taskSer.addNewTask(t);
		
	}
	
	

}
