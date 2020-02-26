package com.hxzyan.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import com.hxzyan.book.domain.User;
import com.hxzyan.dao.UserDao;


public class UserTest {
	private UserDao userdao;
	private User user;

	@Before   //创建对象：在一个类中调用另一个类中的属性和方法，必须创建一个对象
	public void setUp() throws Exception {
		userdao=new UserDao();
		user = new User();
		
	}

	@Test
	public void testInsert() {
		user.setUname("孙壮");
		user.setUaccount("15486435346");
		user.setUpassword("1452");
		user.setUaddress("安徽新华学院");
		userdao.insert(user);
		
	}
	
	@Test
	public void testUpdate() {
		user.setUname("马云");
		user.setUaccount("1312545649");
		user.setUpassword("28963");
		user.setUaddress("安徽新华学院");
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
