package com.spring_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring_annotation.vo.Employee;

@Component
public class Organization {
	@Autowired
	Employee emp;

	Organization() {
		System.out.println("Employee Object in constructor"+emp);
	}
	
	public void getEmployee() {
		System.out.println("Employee Object in constructor"+emp);
	}
}
