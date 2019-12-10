package com.hxzyan.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.hxzyan.book.domain.Admin;
import com.hxzyan.dao.AdminDao;

public class AdminTest {
	private AdminDao admindao;
	private Admin admin;

	@Before   //创建对象
	public void setUp() throws Exception {
		admindao=new AdminDao();
		admin=new Admin();
		
	}

	@Test
	public void testInsert() {
		admin.setAname("张林虎");
		admin.setAaccount("13305662219");
		admin.setPassword("111");
		admindao.insert(admin);
		
	}
	
	@Test
	public void testUpdate() {
		admin.setAname("马云");
		admin.setAaccount("1312545649");
		admin.setPassword("28963");
		admin.setId(3);
		admindao.update(admin);
		
	}

	@Test
	public void testDelete() {
		admindao.delete(2);
		
	}

	
	@Test
	public void testFindById() {
		Admin admin = admindao.findById(1);
		System.out.println(admin);
		
	}
	
	@Test
	public void testFindAll() {
		List<Admin> list=admindao.findAll();
		System.out.println(list);
		
	}
	
	/*
	 * @Test public void testFindByAccountAndPassword() {
	 * admin.setAaccount("18856633800"); admin.setPassword("123456"); Admin admin2 =
	 * admindao. System.out.println(admin2);
	 * 
	 * }
	 */
	
	
	
	
	
	
	
	
	
}
