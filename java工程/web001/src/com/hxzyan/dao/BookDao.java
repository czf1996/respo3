package com.hxzyan.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.hxzyan.book.domain.Book;
import com.hxzyan.utils.DataSourceUtils;

public class BookDao {
	//1.创建一个QueryRunner的对象
    private  QueryRunner qr= new QueryRunner(DataSourceUtils.getDataSource());
	private  String sql;
    private Book book;
   public  void insert(Book book){   //增加
	   sql="insert into book(bname,bprivce,bphoto,flag,bnumber,bauthor,bpress,bdescribe,bdate,cid) "
	   		+ "values(?,?,?,?,?,?,?,?,?,?)";
	   Object[] params={book.getBname(),book.getBprivce(),book.getBphoto(),book.getFlag(),book.getBnumber(),book.getBauthor()
			   ,book.getBpress(),book.getBdescribe(),book.getBdate(),book.getCid()};
	   try {
		qr.update(sql, params);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
   public void update(Book book){   //更新
	   sql="update book set bname=?,bprivce=?,bphoto=?,flag=?,bnumber=?,bauthor=?,bpress=?,bdescribe=?,bdate=?,cid=? where id=?";
	   Object[] params={book.getBname(),book.getBprivce(),book.getBphoto(),book.getFlag(),book.getBnumber(),book.getBauthor()
			   ,book.getBpress(),book.getBdescribe(),book.getBdate(),book.getCid(),book.getId()};
	   try {
		qr.update(sql, params);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
   
   
   public  void delete(int id){   //删除
	   sql="delete from book where id=?";
	   Object[] params={id};
	   try {
		qr.update(sql, params);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
   
   public Book findById(int id){   //查询
	   sql="select * from book where id=?";
	   Object[] params={id};
	   try {
		 Book book = qr.query(sql, new BeanHandler<Book>(Book.class), params);
		return book;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	   
   }
   
   public List<Book> findAll(){   //查询所有
	   sql="select * from book ";
	   Object[] params={};
	   try {
		List<Book> list = qr.query(sql, new BeanListHandler<Book>(Book.class), params);
		return list;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	   
   }
   
   
  
}
