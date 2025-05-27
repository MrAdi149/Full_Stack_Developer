package com.jsp.servlet.lifecycle;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/to-click")
public class Click  extends GenericServlet{

	public Click()
	{
		System.out.println("objest created");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init() method called");
		
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	System.out.println("service method called");
		
	}
	@Override
	public void destroy() {
		System.out.println("destory called");
	}

}
