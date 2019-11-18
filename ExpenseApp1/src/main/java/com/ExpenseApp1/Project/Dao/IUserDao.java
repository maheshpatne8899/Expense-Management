package com.ExpenseApp1.Project.Dao;

import com.ExpenseApp1.Project.pojo.User;

public interface IUserDao {
	
	public String registerUser(User user);
	
	
	public User loginUser(String Email,String Password);

}


