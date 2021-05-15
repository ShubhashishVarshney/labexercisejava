package com.cg.dao;

//DAO design pattern is a way to reduce coupling between Business logic and Persistence logic. 
import com.cg.entities.Employee;

public interface EmployeeDao {
	public Employee displayEmployeeDetails();
}
