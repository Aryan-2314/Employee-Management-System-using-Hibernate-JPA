  package com.springboot.employee.employee_project.service;

import com.springboot.employee.employee_project.entity.Employee_Entity;
import com.springboot.employee.employee_project.repository.Employee_Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Employee_Services
{

    @Autowired
    Employee_Repository employee_repository;

    public List<Employee_Entity> getAllEmployee()
    {
        List<Employee_Entity> list;
        list=(List<Employee_Entity>) employee_repository.findAll();
        return list;
    }

    public Employee_Entity getEmployeeId(int id)
    {
        Employee_Entity employee_entity;
        employee_entity=employee_repository.getEmployeeById(id);
        return employee_entity;
    }

    public Employee_Entity addEmployee(Employee_Entity employee_entity)
    {
        employee_repository.save(employee_entity);
        return employee_entity;
    }

    public void deleteEmployee(int id)
    {
        employee_repository.deleteById(id);
    }

    public Employee_Entity updateEmployee(Employee_Entity employee, int id)
    {
        Employee_Entity employee_entity;
        employee_entity = employee_repository.save(employee);
        return employee_entity;
    }
}
