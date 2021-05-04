package com.example.TaskManager.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.TaskManager.entities.Task;
import com.example.TaskManager.services.TaskService;

@Controller
public class TaskController {
	
	@Autowired
	TaskService taskSer;
	
	
	@GetMapping(value = "/list")
	public String listTasks(ModelMap m) {
		Iterable<Task> t = taskSer.GetAllTasks();
		
		m.addAttribute("task", t);
		
		return "list"; 
	}
	
	
	@PostMapping(value="/addtask")
	public String recordNewTask(ModelMap m, @RequestParam String name, @RequestParam String desc, @RequestParam Date sdate, @RequestParam Date edate, 
			@RequestParam String email, @RequestParam String sev) {
		
		Task t  = new Task(); 
		t.setName(name);
		t.setStartDate(sdate);
		t.setEndDate(edate);
		t.setSeverity(sev);
		t.setDescription(desc);
		t.setEmail(email);
		m.addAttribute("task", t);
		taskSer.addNewTask(t);
		
		return "addtask"; 
		
	}
	
	@PostMapping(value="/delete")
	public String deleteTask(@RequestParam(value="id") Integer id) { 
		
		Task t = new Task(); 
	
		t = taskSer.getTasksByID(id);
		taskSer.deleteTask(t.getId());
		
		return "delete";
		
	}
	
	@PostMapping(value = "/edit")
	public String editTask (ModelMap m, @RequestParam Integer id, @RequestParam String name,@RequestParam String desc, @RequestParam Date sdate, @RequestParam Date edate,
			@RequestParam String email, @RequestParam String sev) {
		
		Task t = taskSer.getTasksByID(id);
		t.setName(name);
		t.setDescription(desc);
		t.setStartDate(sdate);
		t.setEndDate(edate);
		t.setEmail(email);
		t.setSeverity(sev);
		m.addAttribute("task",t);
		taskSer.addNewTask(t);
		
		return "edit";
		
	}

}
