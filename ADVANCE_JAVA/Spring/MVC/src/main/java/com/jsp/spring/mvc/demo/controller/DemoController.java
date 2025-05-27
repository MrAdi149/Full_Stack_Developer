package com.jsp.spring.mvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	
	@RequestMapping("/on-click")
	public void print()
	{
		System.out.println("learning spring mvc");
	}
	
	@RequestMapping("/user-Details")
	public ModelAndView UsreDetails(int userId,String username)
	{
		System.out.println("user id :"+userId);
		System.out.println("user name :"+username);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("output.jsp");
		mav.addObject("key1", userId);
		mav.addObject("key2", username);
		
		return mav;
	}

}
