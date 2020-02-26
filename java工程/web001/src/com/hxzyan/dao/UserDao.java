package com.hxzyan.dao;
import java.sql.SQLException;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.hxzyan.book.domain.User;
import com.hxzyan.utils.DataSourceUtils;

public class UserDao {
	//1.����һ��QueryRunner�Ķ���
    private  QueryRunner qr= new QueryRunner(DataSourceUtils.getDataSource());
	private  String sql;
    private User user;
   public  void insert(User user){   //����
	   sql="insert into user(uname,uaccount,upassword,uaddress) values(?,?,?,?)";
	   Object[] params={user.getUname(),user.getUaccount(),user.getUpassword(),user.getUaddress()};
	   try {
		qr.update(sql, params);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
   public void update(User user){   //����
	   sql="update user set uname=?,uaccount=?,upassword=?,uaddress=? where id=?";
	   Object[] params={user.getUname(),user.getUaccount(),user.getUpassword(),user.getUaddress(), user.getId()};
	   try {
		qr.update(sql, params);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
   
   
   public  void delete(int id){   //ɾ��
	   sql="delete from user where id=?";
	   Object[] params={id};
	   try {
		qr.update(sql, params);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
   
   public User findById(int id){   //��ѯ
	   sql="select * from user where id=?";
	   Object[] params={id};
	   try {
		 User user = qr.query(sql, new BeanHandler<User>(User.class), params);
		return user;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	   
   }
   
   public List<User> findAll(){   //��ѯ����
	   sql="select * from user ";
	   Object[] params={};
	   try {
		List<User> list = qr.query(sql, new BeanListHandler<User>(User.class), params);
		return list;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	   
   }
   
   
   //�����˺ź���������ѯ
   public  User findByuaccountAndPassword(User user){   //��ѯ
	   sql="select * from user where uaccount=?and upassword=?";
	   Object[] params={user.getUaccount(),user.getUpassword()};
	   try {
		 User user1 = qr.query(sql, new BeanHandler<User>(User.class), params);
		return user1;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	   
   }
public User findByuaccountAndPassword(String uaccount, String password) {
	  sql="select * from user where uaccount=?and upassword=?";
	   Object[] params={uaccount,password};
	   try {
		 User user1 = qr.query(sql, new BeanHandler<User>(User.class), params);
		return user1;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}
   
   
   
}
