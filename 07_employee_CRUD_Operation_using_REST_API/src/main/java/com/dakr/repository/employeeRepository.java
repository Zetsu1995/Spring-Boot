package com.dakr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dakr.entity.employee;

public interface employeeRepository extends JpaRepository<employee, Integer>
{
	
}
