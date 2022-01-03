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

	public ResponseEntity<Task> postTask(String task) {
		String newTask = task.trim();
		char[] especialChar = {'@', 'á', 'à', 'é', 'ã', '#'
				, '!', '$', '%', '&', '*', '(', ')', '+', '='
				, '-', '_', '/', '?', '°', 'è', 'ª', '[', ']'
				, '{', '}', 'º', '^', '~', '´', '`', '\\', '|'
				, ';', '.', ',', '>', '<', '¹', '²', '³', '£'
				, '¢', '¬'};

		if (newTask.chars().count() < 10) {
			Task t1 = new Task("Erro! Task have less 10 caracters");
			return ResponseEntity.badRequest().body(t1);
		}

		for (int i = 0; i < newTask.length(); i++) {
			for (int j = 0; j < especialChar.length; j++) {
				
				if (newTask.charAt(i) == especialChar[j]) {
					Task t1 = new Task("Erro! Task have especial caracter '"
							+ especialChar[j] + "' ");
					return ResponseEntity.badRequest().body(t1);
				}
				
			}

		}
		Task t1 = new Task(newTask);
		taskRepo.save(t1);
		return ResponseEntity.ok().body(t1);
	}
}
