package com.hxzy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hxzy.service.UserService;
import com.hxzyan.book.domain.User;

/**
 * Servlet implementation class UserRegisterServlet
 */
public class UserRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置解码方式
		request.setCharacterEncoding("utf-8");
		//获取表单数据
		String uaccount = request.getParameter("uaccount");
		String password = request.getParameter("password");
		String username = request.getParameter("username");
		String address = request.getParameter("address");
		//封装数据
		User userform =new User();
		userform.setUaccount(uaccount);
		userform.setUpassword(password);
		userform.setUname(username);
		userform.setUaddress(address);
		//调用Serviceʹ
		UserService userService = new UserService();
		userService.add(userform);
		//转发
		response.sendRedirect(request.getContextPath() +"/login.html");
	}	
}


