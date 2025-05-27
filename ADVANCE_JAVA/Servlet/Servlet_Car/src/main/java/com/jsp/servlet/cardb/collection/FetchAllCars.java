package com.jsp.servlet.cardb.collection;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.jsp.servlet.cardb.dao.CarDao;
import com.jsp.servlet.cardb.entity.Car;

@WebServlet("/fetchAllCars")
public class FetchAllCars extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		List<Car> cars=CarDao.fetchallCar();
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		   out.println("<html><head><title>All Cars</title></head><body>");
	        out.println("<h2>All Cars</h2>");
	        out.println("<table border='1'>");
	        out.println("<tr><th>ID</th><th>Brand</th><th>Model</th><th>Colour</th><th>Price</th></tr>");

	        for (Car car : cars) {
	            out.println("<tr>");
	            out.println("<td>" + car.getCarId() + "</td>");
	            out.println("<td>" + car.getBrand() + "</td>");
	            out.println("<td>" + car.getModel() + "</td>");
	            out.println("<td>" + car.getColour() + "</td>");
	            out.println("<td>" + car.getPrice() + "</td>");
	            out.println("</tr>");
	        }

	        out.println("</table>");
	        out.println("</body></html>");
	        
	        out.println("<a href='index.html'>Back to Home</a>");
	        out.close();
		
	}
	

}
