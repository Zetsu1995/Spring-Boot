package com.dakr.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dakr.entity.employee;
import com.dakr.repository.employeeRepository;

@Service
public class employeeServiceImp implements employeeService 
{
	@Autowired
	private employeeRepository empRepo;

	@Override
	public String insertD(employee emp) {
		String temp="";
		if(emp.getPwd().equals(emp.getConfpwd()))
		{
			 empRepo.save(emp);
			 temp="Data added successfully...";
			
			 
		}
		else
		{
			temp="Not Inserted ......";
		}
		return temp;
	}

	@Override
	public Optional<employee> retriveD(Integer id) {
		
		return empRepo.findById(id);
	}
}
