package com.example.prova_pratica.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.prova_pratica.model.entities.Task;
import com.example.prova_pratica.repositories.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepo;
	
	public ResponseEntity<Task> postTask (String task) {
		if (task.chars().count() < 10) {
			//throw new IllegalArgumentException("Erro! Task have less 10 caracters");
			Task t1 = new Task("Erro! Task have less 10 caracters");
			return ResponseEntity.badRequest().body(t1);
		}
		Task t1 = new Task(task);
		taskRepo.save(t1);
		return ResponseEntity.ok().body(t1);
	}
}
