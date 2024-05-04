package com.loss.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loss.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional<Employee> findBycontactNo(String contactNo);

}
