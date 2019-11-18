package com.ExpenseApp1.Project.Dao;

import java.util.List;

import com.ExpenseApp1.Project.pojo.Expense;

public interface IExpenseDao {
	
	
	String addExpense(Expense expense);

	Expense getExpense(Integer id);

	List<Expense> getExpenseList(Expense expense);

}
