package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.model.Employee;
@Component
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	
	

}
