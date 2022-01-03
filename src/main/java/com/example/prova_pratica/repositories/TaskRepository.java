package com.example.prova_pratica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.prova_pratica.model.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
