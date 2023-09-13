package com.sanjeeb.service;

import com.sanjeeb.model.Employee;
import com.sanjeeb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImp implements EmployeeService
{
    @Autowired
    private EmployeeRepository repo;

    @Override
    public Employee insert(Employee emp) {
        return repo.save(emp);
    }

    @Override
    public Optional<Employee> fetch(Integer id) {
        return repo.findById(id);
    }

    @Override
    public List<Employee> fetchAll() {
        return repo.findAll();
    }

    @Override
    public Employee updateD(Employee upd) {
        return repo.save(upd);
    }

    @Override
    public String deleteD(Integer id) {
        String temp ="";
        if (repo.findById(id).isPresent())
        {
            repo.deleteById(id);
            temp = "deleted successfully...";
        }
        else{
            
            temp = id + " " + "is not available in the database";
        }

        return temp;
    }
}
