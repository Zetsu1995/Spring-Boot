package com.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.entity.Facility;
import com.web.service.FacilityService;

@RestController
public class FacilityController 
{
	@Autowired
	private FacilityService fser;
	
	
	// Add facility in DB
	@PostMapping("/add")
	public Facility insertData(@RequestBody Facility fac)
	{
		return fser.insertD(fac);
	}
	
	// for one data 
	@GetMapping("/retrieve_one")
	public Optional<Facility> retrieveData(@RequestParam Long id)
	{
		return fser.retrievD(id);
	}
	
	//retrieve all data from DB
	@GetMapping("/retriev_All")
	public List<Facility> retrieveAllData()
	{
		return fser.retrieveAll();
	}
	
	//update data from DB
	@PutMapping("/update")
	public Facility updateData(@RequestBody Facility faci)
	{
		return fser.updateD(faci);
	}
	
	//delete data from DB
	@DeleteMapping("/delete")
	public void deleteData(@RequestParam Long id)
	{
		fser.deleteFacility(id);
	}
	
}
