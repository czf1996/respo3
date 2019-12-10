package com.hxzy.service;

import java.util.List;

import com.hxzyan.book.domain.User;
import com.hxzyan.dao.UserDao;

public class UserService {
	private UserDao userdao =new UserDao();    //对象
	private User user;     //成员对象
	public User findUserByAP(String uaccount, String password) {
		
		 return  userdao.findByuaccountAndPassword(uaccount,password); 
	}
	public void add(User userform) {
		// TODO Auto-generated method stub
		userdao.insert(userform);
	}
	public void adduser(User user2) {
		// TODO Auto-generated method stub
		userdao.insert(user2);
	}
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userdao.findAll();
	}
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userdao.delete(id);
		
	}
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return userdao.findById(id);
	}
	public void updateUser(User user2) {
		userdao.update(user2);
		
	}
	
	
}
