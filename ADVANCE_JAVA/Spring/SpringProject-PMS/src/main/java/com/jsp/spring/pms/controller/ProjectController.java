package com.jsp.spring.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;


import com.jsp.spring.pms.service.ProjectService;

@Controller
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	public void addProjrct() {
		projectService.addProjrct();
	}

	public void findProjectByTitle() {
		projectService.findProjectByTitle();
	}

	public void findAllProjectsByTechStack() {
		projectService.findAllProjectsByTechStack();
	}

	public void findAllProjectsByBudgetLessThan() {
		projectService.findAllProjectsByBudgetLessThan();
	}

	public void findAllProjectsByTeamStrengthLessThan() {
		projectService.findAllProjectsByTeamStrengthLessThan();
	}

	public void updateProjectDesById() {
		projectService.updateProjectDesById();
	}

	public void updateProjectBudgetByTechStack() {
		projectService.updateProjectBudgetByTechStack();
		
	}

	public void deleteProjectByTitle() {
		projectService.deleteProjectByTitle();
	}

	public void deleteAllProjects() {
		projectService.deleteAllProjects();
	}
	
	
	
	

}
