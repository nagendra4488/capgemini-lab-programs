package com.capg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	
public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	Employee emp = context.getBean("Employee",Employee.class);
	System.out.println(emp);
}
	
	
}
