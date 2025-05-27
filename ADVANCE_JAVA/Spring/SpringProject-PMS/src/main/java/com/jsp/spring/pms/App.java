package com.jsp.spring.pms;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.spring.pms.controller.ProjectController;



public class App {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		ProjectController pc = ac.getBean(ProjectController.class);
		 Scanner scanner = new Scanner(System.in);
//		 pc.addProjrct();
//		 pc.findProjectByTitle();
//		 pc.findAllProjectsByTechStack();
//		 pc.findAllProjectsByBudgetLessThan();
//		 pc.findAllProjectsByTeamStrengthLessThan();
//		 pc.updateProjectDesById();
//		 pc.updateProjectBudgetByTechStack();
//		 pc.deleteProjectByTitle();
		 pc.deleteAllProjects();
		 
        
      
	}

}
