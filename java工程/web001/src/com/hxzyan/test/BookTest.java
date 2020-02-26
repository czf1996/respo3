package com.hxzyan.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.hxzyan.book.domain.Book;
import com.hxzyan.dao.BookDao;



public class BookTest {
	private Book book;
	private BookDao bookdao;

	@Before   //��������
	public void setUp() throws Exception {
		bookdao=new BookDao();
		book = new Book();
		
	}
	/*bname,bprivce,bphoto,flag,bnumber,bauthor,bpress,bdescribe,bdate,cid*/
	@Test
	public void testInsert() {
		book.setBname("�й����ִ�ʷ");
		book.setBprivce(25.2);
		book.setBphoto("d:/");
		book.setFlag(1);
		book.setBnumber(200);
		book.setBauthor("��.���ͻ�");
		book.setBpress("�ӷ������");
		book.setBdescribe("�ţ�����һ�����飬���");
	    book.setBdate("2015-10-16");
	    book.setCid(5);
		bookdao.insert(book);
		
	}
	
	@Test
	public void testUpdate() {
		book.setBname("�й�����");
		book.setBprivce(25.2);
		book.setBphoto("c:/");
		book.setFlag(1);
		book.setBnumber(200);
		book.setBauthor("��ĳ��");
		book.setBpress("˧�������");
		book.setBdescribe("�ţ�����һ�����飬���");
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
