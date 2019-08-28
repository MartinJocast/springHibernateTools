package fr.formation.inti.hibernateTools;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.formation.inti.service.EmployeeService;

public class App {
	public static void main(String[] args) {
				
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeService es = context.getBean("employeeService", EmployeeService.class);
		System.out.println(es.findById(2));
		System.out.println("======================================");
		context.close();
	}
}
