package com.hxzy.service;

import java.util.List;

import com.hxzy.dao.CategoryDao;
import com.hxzyan.book.domain.Category;

public class CategoryService {
	CategoryDao categoryDao = new CategoryDao();
	public void addCname(Category category) {
		categoryDao.insert(category);
	}
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return categoryDao.findAll();
	}
	public Category findCategoryById(int cid) {
		// TODO Auto-generated method stub
		return categoryDao.findById(cid);
	}
	public void updateCategory(Category category) {
		// TODO Auto-generated method stub
		 categoryDao.update(category);
	}
	public void deleteCategory(int cid) {
		// TODO Auto-generated method stub
		categoryDao.delete(cid);
	}
	
	

}
