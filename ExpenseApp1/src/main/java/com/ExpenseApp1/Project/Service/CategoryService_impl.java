package com.ExpenseApp1.Project.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ExpenseApp1.Project.Dao.ICategoryDao;
import com.ExpenseApp1.Project.pojo.Category;

@Service
public class CategoryService_impl implements ICategoryService
{
	@Autowired
	ICategoryDao categoryDao;
	@Override
	public String addCategory(Category category) {

		return categoryDao.addCategory(category);
	}
	@Override
	public List<Category> getCategoryList() {
		
		return categoryDao.getCategoryList();
	}
	@Override
	public Category getCategoryById(Integer id) {
		
		return categoryDao.getCategoryById(id);
	}
	
	

}
