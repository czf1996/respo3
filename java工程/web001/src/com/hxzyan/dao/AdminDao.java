package com.hxzyan.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import com.hxzyan.book.domain.Admin;
import com.hxzyan.utils.DataSourceUtils;

public class AdminDao {
	//1.创建一个QueryRunner的对象
    private  QueryRunner qr= new QueryRunner(DataSourceUtils.getDataSource());
	private  String sql;
    private Admin admin;
   public  void insert(Admin admin){   //增加
	   sql="insert into admin(aname,aaccount,password) values(?,?,?)";
	   Object[] params={admin.getAname(),admin.getAaccount(),admin.getPassword()};
	   try {
		qr.update(sql, params);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
   public void update(Admin admin){   //更新
	   sql="update admin set aname=?,aaccount=?,password=? where id=?";
	   Object[] params={admin.getAname(),admin.getAaccount(),admin.getPassword(),admin.getId()};
	   try {
		qr.update(sql, params);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
   
   
   public  void delete(int id){   //删除
	   sql="delete from admin where id=?";
	   Object[] params={id};
	   try {
		qr.update(sql, params);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
   
   public  Admin findById(int id){   //查询
	   sql="select * from admin where id=?";
	   Object[] params={id};
	   try {
		 Admin admin = qr.query(sql, new BeanHandler<Admin>(Admin.class), params);
		return admin;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	   
   }
   
   public List<Admin> findAll(){   //查询所有
	   sql="select * from admin ";
	   Object[] params={};
	   try {
		List<Admin> list = qr.query(sql, new BeanListHandler<Admin>(Admin.class), params);
		return list;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	   
   }
   
   
   //根据账号和密码来查询
   public  Admin findAdminByAccountAndPassword(String aaccount, String apassword){   //查询
	   sql="select * from admin where aaccount=?and password=?";
	   Object[] params={aaccount,apassword};
	   try {
		 Admin admin1 = qr.query(sql, new BeanHandler<Admin>(Admin.class), params);
		return admin1;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	   
   }
   
   
   
   
   
}
