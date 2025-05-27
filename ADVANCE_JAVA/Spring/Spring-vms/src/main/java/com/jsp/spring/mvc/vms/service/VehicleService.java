package com.jsp.spring.mvc.vms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.spring.mvc.vms.entity.Vehicle;
import com.jsp.spring.mvc.vms.epository.VehicleRepository;

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

	public ModelAndView displayAllVehicle() {
		List<Vehicle> vehicles=repository.displayAllVehicle();
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("displayAllVehicle.jsp");
		mav.addObject("all-Vehicle", vehicles);
		return mav;
	}

	public ModelAndView deleteVehicle(int id) {
		repository.deleteVehicle(id);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display-all-vehicle");
		
		return mav;
	}

	public ModelAndView findVehicleById(int id) {
		Vehicle vehicle=repository.findVehicleById(id);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("updateVehicle.jsp");
		mav.addObject("find-vehicle", vehicle);
		return mav;
		
	}

	public ModelAndView updateVehicle(Vehicle vehicle) {
		repository.updateVehicle(vehicle);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display-all-vehicle");
		
		return mav;
		
		
	}
	

}
