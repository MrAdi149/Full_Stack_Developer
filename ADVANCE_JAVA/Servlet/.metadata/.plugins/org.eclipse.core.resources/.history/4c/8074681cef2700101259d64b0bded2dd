package com.jsp.servlet.cardb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.jsp.servlet.cardb.dao.CarDao;
import com.jsp.servlet.cardb.dao.carDao;
import com.jsp.servlet.cardb.entity.Car;


@WebServlet("/add-car")
public class AddCarServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String model=req.getParameter("model");
		String brand=req.getParameter("brand");
		String colour=req.getParameter("colour");
		int price=Integer.parseInt(req.getParameter("price"));
		
		Car car=new Car();
		car.setModel(model);
		car.setBrand(brand);
		car.setColour(colour);
		car.setPrice(price);
		
		CarDao.saveCar(car);
		
		PrintWriter pw=res.getWriter();
		pw.print("<h1> Car Object Created sucessfully.</h1>");
		
		
	}

}
