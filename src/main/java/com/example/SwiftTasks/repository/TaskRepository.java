package com.example.SwiftTasks.repository;

import com.example.SwiftTasks.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
