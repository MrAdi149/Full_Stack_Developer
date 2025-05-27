package com.jsp.servlet.cardb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.jsp.servlet.cardb.dao.CarDao;
import com.jsp.servlet.cardb.entity.Car;

@WebServlet("/fetch-by-id-car")
public class FetchCarServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int carId=Integer.parseInt(req.getParameter("carId"));
		
		Car car=CarDao.fetchCarbyId(carId);
		
		PrintWriter pw=res.getWriter();
		pw.print("<h1>"+"Car details  [<br>carId=" + car.getCarId() 
		+ "<br> model=" + car.getModel() 
		+ "<br> brand=" + car.getBrand() 
		+ "<br> colour=" + car.getColour() 
		+ "<br> price="+ car.getPrice() + "    ]"+"</h1>");
		
	}

}
