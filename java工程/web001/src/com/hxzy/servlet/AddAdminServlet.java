package com.hxzy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hxzy.service.AdminService;
import com.hxzy.service.UserService;
import com.hxzyan.book.domain.*;

/**
 * Servlet implementation class AddAdminServlet
 */
public class AddAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.设置解码方式
		request.setCharacterEncoding("utf-8");
		// 2.接收表单提交的数据，并用对象封装
		String aname = request.getParameter("aname");
		String aaccount =request.getParameter("aaccount");
		String apassword =request.getParameter("apassword");
		String aaddress =request.getParameter("aaddress");
		//封装数据
		Admin admin = new Admin ();
		admin.setAaccount(aaccount);
		admin.setAname(aname);
		admin.setPassword(apassword);
		// 3.调用业务层service来处理请求的数据
		AdminService adminService = new AdminService();
		adminService.addadmin(admin);

		response.getWriter().write("add Admin success!");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
