package com.springboot.employee.employee_project.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "employees")
public class Employee_Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private int id;

    @Column(name = "emp_name")
    private String name;

    @Column(name = "salary")
    private int salary;

    @Column(name = "department")
    private String department;

    @Column(name = "joining_date")
    private Date joining_date;

    @Column(name = "departure_date")
    private Date departure_date;

    @Column(name = "active")
    private boolean active;

    public Employee_Entity(int id, String name, int salary, String department, Date joining_date, Date departure_date, boolean active) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.joining_date = joining_date;
        this.departure_date = departure_date;
        this.active = active;
    }

    public Employee_Entity()
    {
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", joining_date=" + joining_date +
                ", departure_date=" + departure_date +
                ", active=" + active +
                '}';
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getJoining_date() {
        return joining_date;
    }

    public void setJoining_date(Date joining_date) {
        this.joining_date = joining_date;
    }

    public Date getDeparture_date() {
        return departure_date;
    }

    public void setDeparture_date(Date departure_date) {
        this.departure_date = departure_date;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}
