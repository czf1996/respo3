package com.hxzy.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.hxzyan.book.domain.Category;
import com.hxzyan.utils.DataSourceUtils;

public class CategoryDao {

	//1.创建一个QueryRunner的对象
    private  QueryRunner qr= new QueryRunner(DataSourceUtils.getDataSource());
	private  String sql;
    private Category category;
   public  void insert(Category category){   //增加
	   sql="insert into category(name) values(?)";
	   Object[] params={category.getName()};
	   try {
		qr.update(sql, params);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
   public void update(Category category){   //更新
	   sql="update category set name=? where cid=?";
	   Object[] params={category.getName(),category.getCid()};
	   try {
		qr.update(sql, params);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
   
   
   public  void delete(int id){   //删除
	   sql="delete from category where cid=?";
	   Object[] params={id};
	   try {
		qr.update(sql, params);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
   
   public  Category findById(int id){   //查询
	   sql="select * from category where cid=?";
	   Object[] params={id};
	   try {
		 Category category = qr.query(sql, new BeanHandler<Category>(Category.class), params);
		return category;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	   
   }
   
   public List<Category> findAll(){   //查询所有
	   sql="select * from category ";
	   Object[] params={};
	   try {
		List<Category> list = qr.query(sql, new BeanListHandler<Category>(Category.class), params);
		return list;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	   
   }
   
   
   

}
