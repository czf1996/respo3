package com.hxzyan.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import com.hxzyan.book.domain.User;
import com.hxzyan.dao.UserDao;


public class UserTest {
	private UserDao userdao;
	private User user;

	@Before   //����������һ�����е�����һ�����е����Ժͷ��������봴��һ������
	public void setUp() throws Exception {
		userdao=new UserDao();
		user = new User();
		
	}

	@Test
	public void testInsert() {
		user.setUname("��׳");
		user.setUaccount("15486435346");
		user.setUpassword("1452");
		user.setUaddress("�����»�ѧԺ");
		userdao.insert(user);
		
	}
	
	@Test
	public void testUpdate() {
		user.setUname("����");
		user.setUaccount("1312545649");
		user.setUpassword("28963");
		user.setUaddress("�����»�ѧԺ");
		user.setId(1);
		userdao.update(user);
		
	}

	@Test
	public void testDelete() {
		userdao.delete(1);
		
	}

	
	@Test
	public void testFindById() {
		User user = userdao.findById(2);
		System.out.println(user);
		
	}
	
	@Test
	public void testFindAll() {
		List<User> list=userdao.findAll();
		System.out.println(list);
		
	}
	
	@Test
	public void testFindByAccountAndPassword() {
		user.setUaccount("15486435346");
		user.setUpassword("1452");
		User user2 = userdao.findByuaccountAndPassword(user);
		System.out.println( user2);
		
	}
}
