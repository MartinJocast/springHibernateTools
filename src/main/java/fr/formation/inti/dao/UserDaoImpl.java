package fr.formation.inti.dao;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import fr.formation.inti.entities.User;

/**
 * Notre classe EmployeeDaoImpl suit le modèle de conception Singleton qui
 * garantit qu'une seule instance de cette classe sera créée dans l'application.
 * Lors de la première création de classe, la méthode getEntityManager () est
 * chargée de créer une instance de EntityManager.
 * 
 * @author 
 *
 */
@Repository
public class UserDaoImpl extends GenericDaoImpl<User, Integer> implements IUserDao{

	
	public User authenticate(String login, String password) {
		Query q = getCurrentSession().createQuery("from User where login =:x and password =:y");
		q.setParameter("x", login);
		q.setParameter("y", password);
		
		return (User) q.uniqueResult();
	}

}
