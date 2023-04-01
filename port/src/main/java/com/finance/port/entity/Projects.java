package com.finance.port.entity;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Table(name = "PROJECT")
public class Projects {


	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long projectId;
	    private String projectName;

	    @JsonIgnore
	    @ManyToMany(mappedBy = "assignedProjects")
	    private Set<EmployeeTables> employeeSet = new HashSet<>();
	
	
	
	
	
	
	
	
	
	
	
}
