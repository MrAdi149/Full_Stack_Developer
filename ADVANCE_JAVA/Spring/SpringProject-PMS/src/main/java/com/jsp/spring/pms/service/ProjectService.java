package com.jsp.spring.pms.service;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jsp.spring.pms.entity.Project;

import com.jsp.spring.pms.repository.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	Scanner scan = new Scanner(System.in);
	public void addProjrct() {
		Project project = new Project();
		System.out.println("eneter title");
		project.setTitle(scan.next());
		System.out.println("eneter Des");
		project.setDes(scan.next());
		System.out.println("eneter techStack");
		project.setTechStack(scan.next());
		System.out.println("eneter Budget");
		project.setBudget(scan.nextDouble());
		System.out.println("eneter teamStrength");
		project.setTeamStrength(scan.nextInt());
		
		
		projectRepository.addProjrct(project); 
		
		System.out.println("project object created succesfully");
		
	}
	public void findProjectByTitle() {
		System.out.println("eneter title");
		String title = scan.next();
		
		List<Project> projects=projectRepository.findProjectByTitle(title);
		
		if(projects != null)
		{
			for (Project project : projects) {
				System.out.println(project);
			}
			
		}else {
			System.out.println("project not found");
		}
		
	}
	public void findAllProjectsByTechStack() {
		System.out.println("eneter techStack");
		String tech = scan.next();
		
		List<Project> projects=projectRepository.findAllProjectsByTechStack(tech);
		
		if(projects != null)
		{
			for (Project project : projects) {
				System.out.println(project);
			}
			
		}else {
			System.out.println("project not found");
		}
	}
	public void findAllProjectsByBudgetLessThan() {
		System.out.println("eneter Budget");
		double budget = scan.nextDouble();
		
		List<Project> projects=projectRepository.findAllProjectsByBudgetLessThan(budget);
		
		if(projects != null)
		{
			for (Project project : projects) {
				System.out.println(project);
			}
			
		}else {
			System.out.println("project not found");
		}
		
	}
	public void findAllProjectsByTeamStrengthLessThan() {
		System.out.println("eneter team");
		int team = scan.nextInt();
		
		List<Project> projects=projectRepository.findAllProjectsByTeamStrengthLessThan(team);
		
		if(projects != null)
		{
			for (Project project : projects) {
				System.out.println(project);
			}
			
		}else {
			System.out.println("project not found");
		}
		
	}
	public void updateProjectDesById() {
		System.out.println("eneter project ID");
		int id = scan.nextInt();
		
		Project project = projectRepository.findProductById(id);
		
		if(project != null)
		{
			System.out.println(project);
			System.out.println("enter the project desc");
			String desc = scan.next();
			projectRepository.updateProjectDesById(id,desc);
			System.out.println("desc updated");
			
		}else {
			System.out.println("project not found");
		}
				
		
	}
	
	public void findProjectById() {
		System.out.println("enter the product id");
		int id = scan.nextInt();

		Project project = projectRepository.findProductById(id);

		if (project != null) {
			System.out.println(project);
		} else {
			System.out.println("product not found");
		}
	}
	public void updateProjectBudgetByTechStack() {
		System.out.println("eneter TechStack");
		String tech = scan.next();
		
List<Project> projects=projectRepository.findAllProjectsByTechStack(tech);
		
		if(projects != null)
		{
			for (Project project : projects) {
				System.out.println(project);
				System.out.println("eneter the the budget");
				double budget = scan.nextDouble();
				projectRepository.updateProjectBudgetByTechStack(tech,budget);
				
				System.out.println("Budget updated");
			}
			
		}else {
			System.out.println("project not found");
		}
		
		
	}
	public void deleteProjectByTitle() {
		System.out.println("enetr the project title");
		String title = scan.next();
		
List<Project> projects=projectRepository.findProjectByTitle(title);
		
		if(projects != null)
		{
			for (Project project : projects) {
				projectRepository.deleteProjectByTitle(title);
				System.out.println("project deleted");
			}
			
		}else {
			System.out.println("project not found");
		}
	}
	public void deleteAllProjects() {
		List<Project> projects= projectRepository.findAllProjects();
		for (Project project : projects) {
			int id = project.getId();
			projectRepository.deleteAllProjects(id);
			
			
		}
		System.out.println("all project deleted");
			
		
		
	}

	

}
