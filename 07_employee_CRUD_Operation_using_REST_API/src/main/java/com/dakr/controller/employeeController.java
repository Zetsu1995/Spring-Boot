package com.dakr.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dakr.entity.employee;
import com.dakr.service.employeeService;

@RestController
public class employeeController 
{
	@Autowired
	private employeeService empser; 
	
	//insert data in DB
	@PostMapping("/save")
	public String insertData(@RequestBody employee emp)
	{
		return empser.insertD(emp);
		
	}
	
	//retrieve single row from DB
	@GetMapping("/retrieve_one")
	public Optional<employee> retrieveData(@RequestParam Integer id)
	{
		return empser.retriveD(id);
		
		
	}
}
