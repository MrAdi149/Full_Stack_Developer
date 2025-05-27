package com.jsp.servlet.cardb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.jsp.servlet.cardb.dao.CarDao;
@WebServlet("/delete-car")
public class DeleteCarServlet extends GenericServlet {
	

		@Override
		public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			int carId=Integer.parseInt(req.getParameter("carId"));
			
			CarDao.Delete(carId);
			
			PrintWriter pw=res.getWriter();
			pw.print("<h1> Car Object Deleted Sucessfully.</h1>");
			
		}

}
