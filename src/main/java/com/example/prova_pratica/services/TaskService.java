package com.example.prova_pratica.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.prova_pratica.model.entities.Task;
import com.example.prova_pratica.repositories.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepo;

	public ResponseEntity<Task> postTask(String task) {
		if (task.isEmpty()) {
			Task t1 = new Task("Erro! Task is empty");
			return ResponseEntity.badRequest().body(t1);
		}
		
		String newTask = task.trim();
		
		if (newTask.chars().count() < 10) {
			Task t1 = new Task("Erro! Task have less 10 caracters");
			return ResponseEntity.badRequest().body(t1);
		}
		
		Pattern p = Pattern.compile("[a-zA-Z0-9- ]{10,}");
		Matcher task1 = p.matcher(task);
		
		if (!task1.matches()) {
			Task t1 = new Task("Erro! Task have especial caracter");
			return ResponseEntity.badRequest().body(t1);
		}
		
		Task t1 = new Task(newTask);
		taskRepo.save(t1);
		return ResponseEntity.ok().body(t1);
	}
}
