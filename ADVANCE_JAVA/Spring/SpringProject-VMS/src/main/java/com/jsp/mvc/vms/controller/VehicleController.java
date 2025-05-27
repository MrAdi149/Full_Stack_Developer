package com.jsp.mvc.vms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.mvc.vms.entity.Vehicle;
import com.jsp.mvc.vms.service.VehicleService;

@Controller
public class VehicleController {
	
	@Autowired
	private VehicleService service;

	@RequestMapping(value = "/add-vehicle", method = RequestMethod.POST)
	public ModelAndView addVehicle(Vehicle vehicle) {
		
		return service.addVehicle(vehicle);
	}
	

}
