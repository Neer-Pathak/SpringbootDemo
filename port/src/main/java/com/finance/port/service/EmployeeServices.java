package com.finance.port.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.port.entity.EmployeeTables;
import com.finance.port.entity.Projects;
import com.finance.port.repository.EmployeeRepository;

@Service
public class EmployeeServices {

	

	    @Autowired
	    private EmployeeRepository employeeRepository;

//	    public void saveProject(Projects projectObj) {
//	        projectRepository.save(projectObj);
//	    }

	    public List<EmployeeTables> getEmployeeDetails(Long empId) {
	        if (null != empId) {
	            return employeeRepository.findAllByEmpId(empId);
	        } else {
	            return employeeRepository.findAll();
	        }
	    }

		public String speak() {
			// TODO Auto-generated method stub
			return "Hello";
		}

	    public void deleteEmployee(Long empID) {
	    	employeeRepository.deleteById(empID);
	    }
	    
	    public void deleteEmployee_all() {
	    	employeeRepository.deleteAll();
	    }
	
	
	
	
	    public void saveEmployee(EmployeeTables empObj) {
	        employeeRepository.save(empObj);
	    }
	
	
	
	
	
	
	
}
