package fr.formation.inti.dao;

import fr.formation.inti.entities.User;

public interface IUserDao extends IGenericDao<User, Integer>{

	

	public User authenticate(String login, String password);
}
