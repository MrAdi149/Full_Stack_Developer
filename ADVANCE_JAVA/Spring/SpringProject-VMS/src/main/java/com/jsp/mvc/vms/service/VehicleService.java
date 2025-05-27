package com.jsp.mvc.vms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.mvc.vms.entity.Vehicle;
import com.jsp.mvc.vms.repository.VehicleRepository;

@Service
public class VehicleService {
	
	@Autowired
	private VehicleRepository repository;

	public ModelAndView addVehicle(Vehicle vehicle) {
		repository.addVehicle(vehicle);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index.jsp");
		
		return mav;
	}
	
	

}
