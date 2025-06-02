package com.jsp.spring.backbencher.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.jsp.spring.backbencher.ems.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/dashboard")
    public String adminDashboard(Model model) {
        model.addAttribute("users", adminService.getAllUsers());
        model.addAttribute("reportedContent", adminService.getReportedContent());
        return "admin/dashboard";
    }

    @PostMapping("/user/{id}/role")
    public String updateUserRole(@PathVariable Long id, @RequestParam String role) { // Added @RequestParam
        adminService.updateUserRole(id, role);
        return "redirect:/admin/dashboard";
    }

    @PostMapping("/content/{id}/approve")
    public String approveContent(@PathVariable Long id) {
        adminService.approveContent(id);
        return "redirect:/admin/dashboard";
    }

    @PostMapping("/content/{id}/reject")
    public String rejectContent(@PathVariable Long id) {
        adminService.rejectContent(id);
        return "redirect:/admin/dashboard";
    }
}