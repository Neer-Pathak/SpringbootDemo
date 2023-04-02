package com.finance.port.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.port.entity.Projects;
import com.finance.port.repository.ProjectRepository;

@Service
public class ProjectServices {

	

		

		    @Autowired
		    private ProjectRepository projectRepository;

//		    public void saveProject(Projects projectObj) {
//		        projectRepository.save(projectObj);
//		    }

		    public List<Projects> getProjectDetails(Long projectId) {
		        if (null != projectId) {
		            return projectRepository.findAllByprojectId(projectId);
		        } else {
		            return projectRepository.findAll();
		        }
		    }

			public String speak() {
				// TODO Auto-generated method stub
				return "Hello";
			}

		    public void deleteProject(Long projectId) {
		    	projectRepository.deleteById(projectId);
		    }
		    
		    public void deleteProject_all() {
		    	projectRepository.deleteAll();
		    }
		
		
		
		
		    public void saveProject(Projects projectObj) {
		    	projectRepository.save(projectObj);
		    }
		
		
		
		
	
	
	
	
	
	
}
