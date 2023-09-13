package com.sanjeeb.controller;

import com.sanjeeb.model.Employee;
import com.sanjeeb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class EmployeeController
{
    @Autowired
    private EmployeeService eservice;

    // For Insert Operation
    @PostMapping("/insert")
    public Employee insertData(@RequestBody Employee emp)
    {
        return eservice.insert(emp);
    }

    // Fetch data from DB

    @GetMapping("/fetch")
    public Optional<Employee> fetchData(@RequestParam Integer id)
    {
        return eservice.fetch(id);
    }

    // For fetch all data from DB

    @GetMapping("/fetchAll")
    public List<Employee> fetchAll()
    {
        return eservice.fetchAll();
    }

    // update data in DB

    @PutMapping("/update")
    public Employee updateData(@RequestBody Employee upd)
    {
        return eservice.updateD(upd);
    }

    // Delete data from DB

    @DeleteMapping("/delete")
    public String deleteData(@RequestParam Integer id)
    {
        return eservice.deleteD(id);
    }
}
