package com.loss.service;

import java.util.List;
// import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import com.loss.exception.EmployeeNotfoundException;
import com.loss.model.Employee;
import com.loss.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public List<Employee> getEmployee() {
		List<Employee> findAll = employeeRepository.findAll();
		return findAll;

	}

	// public Employee getEmployeeById(Long id) {
	// 	Employee employeeById = employeeRepository.findById(id)
	// 			.orElseThrow(() -> new EmployeeNotfoundException("Not Found"));
	// 	return employeeById;
	// }

	// public void deleteEmployee(long id) {
    //     employeeRepository.deleteById(id);
    //     Optional.ofNullable(employeeRepository.findById(id))
    //             .orElseThrow(() -> new EmployeeNotfoundException("Not found"));
    // }

	// public Employee update(Long id, Employee employee){
    // Employee empId= employeeRepository.findById(id).orElseThrow(() ->new EmployeeNotfoundException("Not Found"));
	//  Employee updateEmployee= employeeRepository.save(empId);
    //     return updateEmployee;
    // }

}
