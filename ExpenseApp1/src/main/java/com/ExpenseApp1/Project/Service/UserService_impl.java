package com.ExpenseApp1.Project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ExpenseApp1.Project.Dao.IUserDao;
import com.ExpenseApp1.Project.pojo.User;

@Service
public class UserService_impl implements IUserService{
	@Autowired
	private IUserDao userDao;

	@Override
	public String registerUser(User user) {
		
		return userDao.registerUser(user);
	}

	@Override
	public User loginUser(String Email, String Password) {
		
		return userDao.loginUser(Email,Password);
	}
	
	
	

}
