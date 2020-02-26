package com.hxzy.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hxzy.service.BookService;
import com.hxzy.service.CategoryService;
import com.hxzyan.book.domain.Book;
import com.hxzyan.book.domain.Category;

/**
 * Servlet implementation class IndexServlet
 */
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 1.调用业务层service来查询所有分类的的数据
		BookService bookService = new BookService();
		List<Book> list = bookService.findAll();
		System.out.println("list:" + list);
		// 2.绑定数据
		request.setAttribute("list", list);

		
		 CategoryService categoryService = new CategoryService();
		 List<Category> clist = categoryService.findAll();
		 System.out.println("clist:"+clist);
		 //2.绑定数据
		 request.setAttribute("clist", clist);
		
		
			// 3.转发
			request.getRequestDispatcher("/book_list.jsp").forward(request, response);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
