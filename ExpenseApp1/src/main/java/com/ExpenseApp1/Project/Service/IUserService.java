package com.ExpenseApp1.Project.Service;

import com.ExpenseApp1.Project.pojo.User;

public interface IUserService {
	
	public String registerUser(User  user);
	
	public User loginUser(String email,String Password);

}
