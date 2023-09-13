package com.sanjeeb.repository;

import com.sanjeeb.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{

}
