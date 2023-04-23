package com.spring_annotation;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/org")
public class OrgController {

	@Autowired
	Organization org;
	@RequestMapping("/emp")
	public void getEmployee() {
		org.getEmployee();
	}
	
	
}
