package com.hxzyan.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.hxzyan.book.domain.Book;
import com.hxzyan.dao.BookDao;



public class BookTest {
	private Book book;
	private BookDao bookdao;

	@Before   //创建对象
	public void setUp() throws Exception {
		bookdao=new BookDao();
		book = new Book();
		
	}
	/*bname,bprivce,bphoto,flag,bnumber,bauthor,bpress,bdescribe,bdate,cid*/
	@Test
	public void testInsert() {
		book.setBname("中国近现代史");
		book.setBprivce(25.2);
		book.setBphoto("d:/");
		book.setFlag(1);
		book.setBnumber(200);
		book.setBauthor("程.卡耐基");
		book.setBpress("子丰出版社");
		book.setBdescribe("嗯，这是一本好书，真的");
	    book.setBdate("2015-10-16");
	    book.setCid(5);
		bookdao.insert(book);
		
	}
	
	@Test
	public void testUpdate() {
		book.setBname("中国音乐");
		book.setBprivce(25.2);
		book.setBphoto("c:/");
		book.setFlag(1);
		book.setBnumber(200);
		book.setBauthor("程某人");
		book.setBpress("帅丰出版社");
		book.setBdescribe("嗯，这是一本好书，真的");
	    book.setBdate("2018-10-16");
	    book.setCid(3);
	    book.setId(1);
		bookdao.update(book);
		
	}

	@Test
	public void testDelete() {
		bookdao.delete(1);
		
	}

	
	@Test
	public void testFindById() {
		Book book = bookdao.findById(2);
		System.out.println(book);
		
	}
	
	@Test
	public void testFindAll() {
		List<Book> list=bookdao.findAll();
		System.out.println(list);
		
	}
	
	
}
