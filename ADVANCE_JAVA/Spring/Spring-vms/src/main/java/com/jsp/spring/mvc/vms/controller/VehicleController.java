package com.jsp.spring.mvc.vms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.spring.mvc.vms.entity.Vehicle;
import com.jsp.spring.mvc.vms.service.VehicleService;

@Controller
public class VehicleController {
	
	@Autowired
	private VehicleService service;
	
	@RequestMapping(value = "/add-vehicle" , method = RequestMethod.POST)
	public ModelAndView addVehicle(Vehicle vehicle)
	{
		return service.addVehicle(vehicle);
	}
	
	@RequestMapping(value = "/display-all-vehicle", method = RequestMethod.GET)
	public ModelAndView displayAllVehicle()
	{
		return service.displayAllVehicle();
	}
	
	@RequestMapping(value = "/delete-vehicle",method = RequestMethod.GET)
	public ModelAndView deleteVehicle(int id)
	{
		return service.deleteVehicle(id);
	}
	
	@RequestMapping(value = "/find-by-id" , method = RequestMethod.GET)
	public ModelAndView findVehicleById(int id)
	{
		return service.findVehicleById(id);
	}
	
	@RequestMapping(value = "/update-vehicle",method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView updateVehicle(Vehicle vehicle)
	{
		return service.updateVehicle(vehicle);
	}

}
