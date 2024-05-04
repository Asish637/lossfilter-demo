package com.loss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loss.model.Employee;
import com.loss.service.EmployeeService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;


    @PostMapping("/save")
    public ResponseEntity<Employee> registerEmployee(@RequestBody Employee employee) {
        Employee savedEmployee = employeeService.saveEmployee(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
    
    @GetMapping("/getAll")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeService.getEmployee();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
    // @PutMapping("/update/{id}")
    // public Employee update(@PathVariable Long id, @RequestBody Employee employee) {
    //     Employee updatEmployee =employeeService.update(id, employee);
    //     return updatEmployee;
    // }
    // @GetMapping("/get/{id}")
    // public Employee getById(@PathVariable Long id) {
    //     Employee detaById = employeeService.getEmployeeById(id);
    //     return detaById;
    // }
    // @DeleteMapping("delete/{id}")
    // public String delete(@PathVariable Long id) {
    //     employeeService.deleteEmployee(id);
    //     return "Book is deleted !";

    // }
}
