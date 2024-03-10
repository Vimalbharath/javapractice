package com.htc.springdatajpaER.main;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.htc.springdatajpaER.config.JPAConfig;
import com.htc.springdatajpaER.model.Department;
import com.htc.springdatajpaER.model.Employee;
import com.htc.springdatajpaER.model.Skill;
import com.htc.springdatajpaER.model.TestJob;
import com.htc.springdatajpaER.service.ERService;

public class EmployeeMain {
	public static void main(String[] args) {
	
	ApplicationContext context=new AnnotationConfigApplicationContext(JPAConfig.class);
	
	ERService erService=(ERService) context.getBean("erservice");
	
	boolean result = false;
//	result=erService.addDepartment(new Department(104,"Board","Decision Making"));
//	System.out.println(result);
	
//	result=erService.addEmployee(104, new Employee(8,"Stark",50,"America",new Date()));
//	System.out.println(result);
	
//	List<Employee> jobs1=erService.getAllEmployees();
//	System.out.println(jobs1);
	
	erService.addSkill(new Skill(202,"AWS"));
	erService.addSkill(new Skill(203,"SpringBoot"));
	
	erService.emphasthisskill(7, 202);
	
	
	}
}
