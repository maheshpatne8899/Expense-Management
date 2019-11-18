package com.ExpenseApp1.Project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ExpenseApp1.Project.Dao.IExpenseDao;
import com.ExpenseApp1.Project.pojo.Expense;

@Service
public class ExpenseService_impl implements IExpenseService
{
	@Autowired
	IExpenseDao expenseDao;

	@Override
	public String addExpense(Expense expense) {
		
		return expenseDao.addExpense(expense);
	}

	@Override
	public Expense getExpense(Integer id) {
	
		return expenseDao.getExpense(id);
	}

	@Override
	public List<Expense> getExpenseList(Expense expense) {
		
		return expenseDao.getExpenseList(expense);
	}

}
