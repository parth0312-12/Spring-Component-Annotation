package com.spring_annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = ("com.spring_annotation.vo"))
public class ComponentAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComponentAnnotationApplication.class, args);
	}

}
