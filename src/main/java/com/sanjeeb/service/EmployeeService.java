package com.sanjeeb.service;

import com.sanjeeb.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Employee insert(Employee emp);

    Optional<Employee> fetch(Integer id);

    List<Employee> fetchAll();

    Employee updateD(Employee upd);

    String deleteD(Integer id);
}

