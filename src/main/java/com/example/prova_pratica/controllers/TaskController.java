package com.example.prova_pratica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.prova_pratica.model.entities.Task;
import com.example.prova_pratica.services.TaskService;

@RestController
@RequestMapping(path = "/add/task")
public class TaskController {
	
	@Autowired
	private TaskService service;
	
	@PostMapping
	public ResponseEntity<Task> PostTask(
			@RequestParam String task) {
		return service.postTask(task);
	}
}
