package com.hxzy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hxzy.service.CategoryService;
import com.hxzyan.book.domain.Category;

/**
 * Servlet implementation class CategoryAddServlet
 */
public class CategoryAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoryAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.设置解码方式
		request.setCharacterEncoding("utf-8");
		//2.接收表单提交的数据，并用对象封装
		String cname = request.getParameter("cname");
		Category category = new Category();
		category.setName(cname);
		//3.调用业务层service来处理请求的数据
		CategoryService categoryService = new CategoryService();
		categoryService.addCname(category);
		
		response.getWriter().write("add category success!");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
