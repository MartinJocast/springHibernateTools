package fr.formation.inti.dao;

import java.util.List;

import fr.formation.inti.entities.Employee;

public interface IEmployeeDao  extends IGenericDao<Employee, Integer>{

	
	
	public List<Employee> findByFirstName(String firstName);
	
	public List<Employee> findByLastName(String lastName);
	
	
}
