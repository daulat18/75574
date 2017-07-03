package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.model.Employee;
import com.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

static final Logger logger = LogManager.getLogger(EmployeeController.class.getName());
	@Autowired
	EmployeeRepository employeeRepository;
	
	//Insert 
	
	@RequestMapping("/create")
	public Employee insertEmployee(Employee emp) throws Exception{
		logger.info("create employee");
		
		emp= employeeRepository.save(emp);
		
		logger.info("employee created======>>>>" + emp);
		return emp;
		}
	
	//Get All Employee
	@RequestMapping("/get")
	public List<Employee> getAllEmployee(){
		
		List<Employee> emp=(List<Employee>) employeeRepository.findAll();
		System.out.println("in get " + emp);
		logger.info("all employee ======>>>>" + emp);
		return emp;
		}
	
	//GetEmployee By Mobile
	@RequestMapping("/get/{emp_id}")
	public Employee getEmployeeByMobile(@PathVariable Long emp_id){
		
		Employee emp=employeeRepository.findOne(emp_id);
		System.out.println("" +emp);
		logger.info("employee by id ======>>>>" + emp);
		return emp;
		
	}
	
	//Delete
	@RequestMapping("/delete/{emp_id}")
	public String deleteEmployee(@PathVariable Long emp_id){
		
		employeeRepository.delete(emp_id);
		logger.info("employee deleted id======>>>>" + emp_id);
		return emp_id.toString();
	}
	
	//Update
	@RequestMapping("/update")
	public Employee updateEmployee(@RequestParam Long emp_id,@RequestParam String emp_first_name,@RequestParam String emp_middle_name,@RequestParam String emp_last_name
	,@RequestParam String address, @RequestParam String emp_email, @RequestParam String mobile){
		
		Employee emp=employeeRepository.findOne(emp_id);
		
		emp.setEmp_first_name(emp_first_name);
		emp.setEmp_middle_name(emp_middle_name);
		emp.setEmp_last_name(emp_last_name);
		emp.setAddress(address);
		emp.setEmp_email(emp_email);
		emp.setMobile(mobile);
		
		employeeRepository.save(emp);
		logger.info("employee updated======>>>>" + emp);
		return emp;
		
	
}
	
}
