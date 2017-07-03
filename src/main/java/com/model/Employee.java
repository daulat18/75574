package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
@Id
	 @GeneratedValue(strategy = GenerationType.AUTO, generator = "auto_gen")
	  @SequenceGenerator(name = "auto_gen", sequenceName = "A")
	private Long id;
	public Long getEmi_id() {
		return id;
	}

	public void setEmi_id(Long emi_id) {
		this.id = emi_id;
	}

	public String getEmp_first_name() {
		return emp_first_name;
	}

	public void setEmp_first_name(String emp_first_name) {
		this.emp_first_name = emp_first_name;
	}

	public String getEmp_middle_name() {
		return emp_middle_name;
	}

	public void setEmp_middle_name(String emp_middle_name) {
		this.emp_middle_name = emp_middle_name;
	}

	public String getEmp_last_name() {
		return emp_last_name;
	}

	public void setEmp_last_name(String emp_last_name) {
		this.emp_last_name = emp_last_name;
	}

	public String getEmp_email() {
		return emp_email;
	}

	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name="emp_first_name" )
	private String emp_first_name;
	
	@Column(name="emp_middle_name")
	private String emp_middle_name;
	
	@Column(name="emp_last_name")
	private String emp_last_name;
	
	@Column(name="emp_email")
	private String emp_email;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="address")
	private String address;
	
	public Employee(String emp_first_name,String emp_middle_name,String emp_last_name,String emp_email,String mobile,String address ){
		this.emp_first_name=emp_first_name;
		this.emp_middle_name=emp_middle_name;
		this.emp_last_name=emp_last_name;
		this.emp_email=emp_email;
		this.address=address;
	}
	
public Employee(){
		
	}
}
