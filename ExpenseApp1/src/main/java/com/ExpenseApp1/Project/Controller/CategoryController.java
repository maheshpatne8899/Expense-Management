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

import com.ExpenseApp1.Project.Service.ICategoryService;
import com.ExpenseApp1.Project.pojo.Category;

@RestController
@RequestMapping("/category")
public class CategoryController

{	
	@Autowired
	ICategoryService categoryService;
	@PostMapping("/addcategory")
	public ResponseEntity<String> addCategory(@RequestBody Category category)
	{	
		return new ResponseEntity<String>(categoryService.addCategory(category),HttpStatus.OK);
	} 
	
	@GetMapping("/categorylist")
	public ResponseEntity<List<Category>> getCategoryList()
	{
		return new ResponseEntity<List<Category>>(categoryService.getCategoryList(),HttpStatus.OK);
	}
	@GetMapping("/categorylist/{id}")
	public ResponseEntity<Category>getCategoryById(@PathVariable Integer id)
	{
		return new ResponseEntity<Category>(categoryService.getCategoryById(id),HttpStatus.OK);
	}
}