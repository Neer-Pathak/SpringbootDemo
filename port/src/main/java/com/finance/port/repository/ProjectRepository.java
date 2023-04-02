package com.finance.port.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.port.entity.Projects;

public interface ProjectRepository  extends JpaRepository<Projects, Long>{

	
	List<Projects> findAllByprojectId(long projectId);
	
	 

	 }
