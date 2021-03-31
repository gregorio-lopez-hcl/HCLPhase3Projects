package com.example.TaskManager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TaskManager.entities.Task;
import com.example.TaskManager.entities.User;
import com.example.TaskManager.repositories.TaskRepository;

@Service
public class TaskService {
	
	
	@Autowired
	private TaskRepository taskRepo;
	
	public Iterable<Task> GetAllTasks() {
	
		return taskRepo.findAll();
	}

	public Iterable<Task> GetTasksByUser(User user) {

		return(taskRepo.findAllByUser(user));
	}
	
	public Task addNewTask (Task task) {
		
		return taskRepo.save(task);
	}
	
	public void deleteTask (Integer id) {
		
		taskRepo.deleteById(id);
	}

	
}
