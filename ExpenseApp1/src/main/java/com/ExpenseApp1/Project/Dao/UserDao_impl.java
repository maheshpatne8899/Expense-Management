package com.ExpenseApp1.Project.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ExpenseApp1.Project.pojo.User;


@Repository
@Transactional
public class UserDao_impl implements IUserDao
{

	
	@PersistenceContext
	private EntityManager entityManger;
	
	@Override
	public String registerUser(User user) {
	entityManger.persist(user);
		return "Successfully Registered";
	}

	@Override
	public User loginUser(String Email, String Password) {
	String jpql="Select u from User u where u.email=:em and u.password=:pwd";
	User user=entityManger.createQuery(jpql,User.class).setParameter("em",Email).setParameter("pwd", Password).getSingleResult();
		return user;
	}
	
	

}
