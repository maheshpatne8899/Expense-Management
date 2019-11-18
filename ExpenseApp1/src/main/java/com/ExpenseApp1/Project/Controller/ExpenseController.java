package com.ExpenseApp1.Project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ExpenseApp1.Project.Service.IExpenseService;
import com.ExpenseApp1.Project.pojo.Expense;


@RestController
@RequestMapping("/expense")
public class ExpenseController {
	
@Autowired
	IExpenseService expenseService;

@PostMapping("/addexpense")
public ResponseEntity<String>addExpense(@RequestBody Expense expense)
{
	return new ResponseEntity<String>(expenseService.addExpense(expense),HttpStatus.OK);
}
@GetMapping("/expenseList")
public ResponseEntity<List<Expense>> getExpenseList(@RequestBody Expense expense)
{
	return new ResponseEntity<List<Expense>> (expenseService.getExpenseList(expense),HttpStatus.OK);
}
@GetMapping("/expenseList/{id}")
public ResponseEntity<Expense> getExpense(@PathVariable Integer id)
{
	return new ResponseEntity<Expense> (expenseService.getExpense(id),HttpStatus.OK);
}
}
