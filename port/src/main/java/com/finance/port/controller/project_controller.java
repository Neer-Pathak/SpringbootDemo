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


import com.finance.port.entity.Projects;

import com.finance.port.service.ProjectServices;


@RestController
@RequestMapping("/project")
public class project_controller {


    @Autowired
    private ProjectServices projectServices;

    @PostMapping("/save")
    public ResponseEntity<Projects> saveProjects(@RequestBody Projects projectObj) {
    	projectServices.saveProject(projectObj);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = {"/getProjects", "/{empId}"})
    public List<Projects> getProjectDetails(@PathVariable(required = false) Long empId) {
        return projectServices.getProjectDetails(empId);
    }
    
    
//    @GetMapping("/speak")
//    public Object speak() {
//    	return projectServices.speak();
//    }

    @DeleteMapping("delete/{empId}")
    public List<Projects> deleteProject(@PathVariable Long empId){
    	projectServices.deleteProject(empId);
        return projectServices.getProjectDetails(null);
    }
    
    
    @DeleteMapping("delete/all")
    public List<Projects> Delete_all_projects(){
    	projectServices.deleteProject_all();
        return projectServices.getProjectDetails(null);
    }

  

	
	
	
	
	
	
	
}
