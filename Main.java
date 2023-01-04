package com.springframework.dependencychecking.simple.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");

		Employee employee = (Employee) applicationContext.getBean("e");

		employee.getEmployee(); // Call Method By Object

	}

}
