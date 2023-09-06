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

import com.web.entity.OwnerRegistration;
import com.web.service.OwnerRegistrationService;

public class OperationControl 
{
	@Autowired
	private final OwnerRegistrationService reservice;
	
	public OperationControl(OwnerRegistrationService reservice)
	{
		super();
		this.reservice = reservice;
	}
	
	//for insert operation
	@PostMapping("/insert")
	public OwnerRegistration insertData(@RequestBody OwnerRegistration ore)
	{
		return reservice.insert(ore);
	}
	
	// for retrieve one data from DB
	@GetMapping("/retrive_one")
	public Optional<OwnerRegistration> retriveData(@RequestParam Integer id)
	{
		return reservice.retrive(id);
	}
	
	//retrieve all data from DB
	@GetMapping("/retrive_all")
	public List<OwnerRegistration> retriveAll()
	{
		return reservice.retriveAll();
	}
	
	//for update data from database
	@PutMapping("/update")
	public OwnerRegistration updateData(@RequestBody OwnerRegistration org)
	{
		return reservice.updateD(org);
	}
	// for delete data from database
	@DeleteMapping("/delete")
	public String deleteData(@RequestParam Integer id)
	{
		return reservice.deleteD(id);
	}
}
