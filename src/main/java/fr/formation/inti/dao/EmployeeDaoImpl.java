package fr.formation.inti.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import fr.formation.inti.entities.Employee;

/**
 * Notre classe EmployeeDaoImpl suit le modèle de conception Singleton qui
 * garantit qu'une seule instance de cette classe sera créée dans l'application.
 * Lors de la première création de classe, la méthode getEntityManager () est
 * chargée de créer une instance de EntityManager.
 * 
 * @author 
 *
 */
@Repository("employeeDao")
public class EmployeeDaoImpl extends GenericDaoImpl<Employee, Integer> implements IEmployeeDao{

	
	public List<Employee> findByFirstName(String firstName){
		Query q = getCurrentSession().createQuery("FROM " + Employee.class.getName() +" WHERE firstName=" + firstName);		
		List<Employee> listFirstName = q.list();
		return listFirstName;
	}
	
	public List<Employee> findByLastName(String lastName){
		Query q = getCurrentSession().createQuery("FROM " + Employee.class.getName() +" WHERE firstName=" + lastName);		
		List<Employee> listLastName = q.list();
		return listLastName;
	}
}
