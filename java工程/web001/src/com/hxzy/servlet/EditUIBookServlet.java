package com.hxzy.servlet;

import java.io.IOException;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hxzy.service.BookService;
import com.hxzy.service.CategoryService;
import com.hxzyan.book.domain.*;

/**
 * Servlet implementation class EditUIBookServlet
 */
public class EditUIBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditUIBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.从表单中接收数据id(从表单接收的数据默认为String)
		String idstr = request.getParameter("id");
		int id = Integer.parseInt(idstr);
		// 2.调用service层根据id查询分类信息
		BookService bookService = new BookService();
		Book book = bookService.findBookById(id);
		CategoryService categoryService = new CategoryService();
		List<Category> list= categoryService.findAll();
		// 3.绑定数据
		request.setAttribute("book", book);
		request.setAttribute("list", list);
		// 4.转发给jsp页面，供用户进行修改
		request.getRequestDispatcher("/editUIBook.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
