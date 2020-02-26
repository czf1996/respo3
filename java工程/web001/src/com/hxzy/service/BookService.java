package com.hxzy.service;

import java.util.List;

import com.hxzyan.book.domain.Book;
import com.hxzyan.dao.BookDao;

public class BookService {
	private BookDao bookDao = new BookDao();

	public void addBook(Book b) {
		// TODO Auto-generated method stub
		bookDao.insert(b);
	}

	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return bookDao.findAll();
	}

	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		bookDao.delete(id);
	}

	public Book findBookById(int id) {
		// TODO Auto-generated method stub
		return bookDao.findById(id);
	}

	public void updateBook(Book b) {
		// TODO Auto-generated method stub
		bookDao.update(b);
	}


	
	

}
