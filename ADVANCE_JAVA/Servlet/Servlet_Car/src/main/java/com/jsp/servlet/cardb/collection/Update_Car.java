package com.jsp.servlet.cardb.collection;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.jsp.servlet.cardb.dao.CarDao;
import com.jsp.servlet.cardb.entity.Car;

@WebServlet("/update-car")
public class Update_Car extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int carId=Integer.parseInt(req.getParameter("carId"));
		String model=req.getParameter("model");
		String brand=req.getParameter("brand");
		String colour=req.getParameter("colour");
		int price=Integer.parseInt(req.getParameter("price"));
		
		Car car=new Car();
		
		car.setCarId(carId);
		car.setModel(model);
		car.setBrand(brand);
		car.setColour(colour);
		car.setPrice(price);
		
		CarDao.updateCar(car);
		
		PrintWriter pw=res.getWriter();
		pw.print("<h1> Car Object Upadate Sucessfully.</h1>");
		
		
	}

}
