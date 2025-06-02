package com.jsp.spring.backbencher.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.jsp.spring.backbencher.ems.entity.User;
import com.jsp.spring.backbencher.ems.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user, BindingResult result, Model model) {
        if (userService.emailExists(user.getEmail())) {
            model.addAttribute("emailError", "Email already registered");
            return "register";
        }
        if (userService.usernameExists(user.getUsername())) {
            model.addAttribute("usernameError", "Username already taken");
            return "register";
        }
        userService.registerUser(user);
        return "redirect:/login?registered";
    }
}