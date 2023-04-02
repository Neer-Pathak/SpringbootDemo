package com.finance.port.repository;
import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.port.entity.EmployeeTables;


public interface EmployeeRepository extends JpaRepository<EmployeeTables, Long>{

	
	List<EmployeeTables> findAllByEmpId(long empID);
	
	
	
}
