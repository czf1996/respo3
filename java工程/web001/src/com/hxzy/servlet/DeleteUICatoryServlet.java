package com.hxzy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hxzy.service.CategoryService;

/**
 * Servlet implementation class DeleteUICatoryServlet
 */
public class DeleteUICatoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteUICatoryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1.接收表单提交的参数cid
		int cid=Integer.parseInt(request.getParameter("cid"));
		//2.调用业务层service 进行删除
		CategoryService categoryService =new CategoryService();
		categoryService.deleteCategory(cid);
		//3.页面重定向到查询所有的分类表页面
		response.sendRedirect(request.getContextPath()+ "/ListCategoryServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
