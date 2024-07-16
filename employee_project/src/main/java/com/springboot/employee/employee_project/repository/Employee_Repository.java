package com.springboot.employee.employee_project.repository;

import com.springboot.employee.employee_project.entity.Employee_Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Employee_Repository extends JpaRepository<Employee_Entity, Integer>
{
    Employee_Entity getEmployeeById(int id);
}
// Spring Data JPA will provide methods like findAll, findById, save, delete, etc.
