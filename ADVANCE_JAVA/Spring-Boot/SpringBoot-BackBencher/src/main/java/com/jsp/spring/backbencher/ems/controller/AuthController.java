package com.jsp.spring.backbencher.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String loginPage(@RequestParam(value = "error", required = false) String error,
                            @RequestParam(value = "logout", required = false) String logout,
                            @RequestParam(value = "registered", required = false) String registered,
                            Model model) {
        if (error != null) {
            model.addAttribute("error", "Invalid username or password.");
        }
        if (logout != null) {
            model.addAttribute("message", "You have been logged out successfully.");
        }
        if (registered != null) {
            model.addAttribute("message", "Registration successful. Please log in.");
        }
        return "login"; // Create login.html in your templates directory
    }

    // Optionally, you can add a logout endpoint if you want a custom logout page
    @GetMapping("/logout-success")
    public String logoutSuccess(Model model) {
        model.addAttribute("message", "You have been logged out successfully.");
        return "login";
    }
}