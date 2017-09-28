package com.cg.hr.tests;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.hr.entities.Employee;
import com.cg.hr.exceptions.EmpException;
import com.cg.hr.services.EmpService;

public class TestLayers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("EmpManagement.xml");
		
		
		try {
			EmpService service=ctx.getBean(EmpService.class);
			
			@SuppressWarnings("unused")
			List<Employee> empList=service.getEmpList();		// add jar com.fasterxml.classmate.TypeResolver to lib folder classmate 0.8
		} catch (EmpException e) {
			e.printStackTrace();
		}
	
	
	}

}
