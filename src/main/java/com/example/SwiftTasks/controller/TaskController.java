package com.example.SwiftTasks.controller;

import com.example.SwiftTasks.model.Task;
import com.example.SwiftTasks.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public String showTaskForm(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks()); // Display all tasks
        return "taskForm";
    }

    @PostMapping
    public String createTask(Task task) {
        taskService.saveTask(task); // Save the task to the database
        return "redirect:/tasks"; // Redirect back to task form
    }
}
