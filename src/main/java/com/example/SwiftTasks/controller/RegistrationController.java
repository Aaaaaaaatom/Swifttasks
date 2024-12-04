package com.example.SwiftTasks.controller;

import com.example.SwiftTasks.model.User;
import com.example.SwiftTasks.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegistrationController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String showRegistrationForm() {
        return "registration";
    }

    @PostMapping
    public String registerUser(User user) {
        userService.registerUser(user); // Save the user to the database
        return "redirect:/login"; // Redirect to login after registration
    }
}
