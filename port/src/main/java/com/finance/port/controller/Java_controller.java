package com.finance.port.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finance.port.entity.EmployeeTables;
import com.finance.port.service.EmployeeServices;

@RestController
@RequestMapping("/employee")
public class Java_controller {

    @Autowired
    private EmployeeServices employeeService;

    @PostMapping("/save")
    public ResponseEntity<EmployeeTables> saveEmployee(@RequestBody EmployeeTables empObj) {
        employeeService.saveEmployee(empObj);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = {"/getEmployees", "/{empId}"})
    public List<EmployeeTables> getEmployee(@PathVariable(required = false) Long empId) {
        return employeeService.getEmployeeDetails(empId);
    }
    
    
    @GetMapping("/speak")
    public Object speak() {
    	return employeeService.speak();
    }

    @DeleteMapping("delete/{empId}")
    public List<EmployeeTables> removeEmployee(@PathVariable Long empId){
        employeeService.deleteEmployee(empId);
        return employeeService.getEmployeeDetails(null);
    }
    
    
    @DeleteMapping("delete/all")
    public List<EmployeeTables> remove_all_Employee(){
        employeeService.deleteEmployee_all();
        return employeeService.getEmployeeDetails(null);
    }

  
}
