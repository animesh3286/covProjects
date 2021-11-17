package com.cov.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cov.beans.Student;
import com.cov.beans.Triangle;

public class App_02 {
	public static void main(String args[]) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
		Student student1 = (Student)ctxt.getBean("stud");
		System.out.println("Id: "+student1.getId()+"Name :"+student1.getName());
		
		Triangle triangle = (Triangle)ctxt.getBean("tri");
		System.out.println(triangle.getPointA()+" "+triangle.getPointB()+" "+triangle.getPointC());
		System.out.println("Hii");
	}
}
			


