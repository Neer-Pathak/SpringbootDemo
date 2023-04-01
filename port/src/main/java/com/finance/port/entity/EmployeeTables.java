package com.finance.port.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;
@Entity
@Data
public class EmployeeTables {

	

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long empId;
	    private String empName;

	 
	    @ManyToMany(cascade = { CascadeType.ALL })
	    @JoinTable(name = "employee_project",
        joinColumns = @JoinColumn(name = "employeeTables_id"),
        inverseJoinColumns = @JoinColumn(name = "project_id"))
	    private Set<Projects> assignedProjects = new HashSet<>();
	
	
	
	
}
