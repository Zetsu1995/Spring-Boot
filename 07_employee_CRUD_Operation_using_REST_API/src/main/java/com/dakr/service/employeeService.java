package com.dakr.service;

import java.util.Optional;

import com.dakr.entity.employee;

public interface employeeService 
{

	public String insertD(employee emp);

	public Optional<employee> retriveD(Integer id);
	
}
