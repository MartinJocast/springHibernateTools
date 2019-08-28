package fr.formation.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.inti.dao.UserDaoImpl;
import fr.formation.inti.entities.User;

@Service
public class UserService {
	
	@Autowired
	UserDaoImpl dao;
	
//	public UserService() {
//		dao = new UserDaoImpl();
//	}
	public void persist(User e) {
        
        dao.persist(e);
        
    }
	public Integer save(User e) {
		Integer id;
        
        id = dao.save(e);
        
        return id;
    }
    public void update(User e) {
        
        dao.update(e);
        
    }
 
    public User findById(Integer id) {
        
        User emp = dao.findById(id, User.class);
       
        return emp;
    }
 
    public void delete(Integer id) {
        
        User emp = dao.findById(id, User.class);
        dao.delete(emp);
        
    }
    public List<User> findAll() {
        
        List<User> users = dao.getAll();
       
        return users;
    }
 
    
 
    public UserDaoImpl EmployeeDao() {
        return dao;
    }
}
