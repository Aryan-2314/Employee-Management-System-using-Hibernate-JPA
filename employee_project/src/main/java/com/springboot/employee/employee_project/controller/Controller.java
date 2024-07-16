package com.springboot.employee.employee_project.controller;

import com.springboot.employee.employee_project.entity.Employee_Entity;
import com.springboot.employee.employee_project.service.Employee_Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller
{

    @Autowired
    Employee_Services employee_services;

    @GetMapping("/employee")
    public ResponseEntity<List<Employee_Entity>> getAllEmployee()
    {
        List<Employee_Entity> list;
        list=employee_services.getAllEmployee();
        if(list.isEmpty())
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee_Entity> getEmployeeId(@PathVariable("id") int id)
    {
        Employee_Entity employee_entity;
        employee_entity=employee_services.getEmployeeId(id);
        if(employee_entity==null)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(employee_entity));
    }

    @PostMapping("/employee")
    public Employee_Entity addEmployee(Employee_Entity employee_entity)
    {
        Employee_Entity employee;
        employee = employee_services.addEmployee(employee_entity);
        return employee;
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable("id") int id)
    {
        employee_services.deleteEmployee(id);
    }

    @PutMapping("/employee/{id}")
    public Employee_Entity updateEmployee(Employee_Entity employee , @PathVariable("id") int id)
    {
        Employee_Entity employee_entity;
        employee_entity = employee_services.updateEmployee(employee,id);
        return employee_entity;
    }
}
