package com.hxzy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hxzy.service.UserService;
import com.hxzyan.book.domain.User;

/**
 * Servlet implementation class AddUserServlet
 */
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUserServlet() {
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
		String uname = request.getParameter("uname");
		String uaccount =request.getParameter("uaccount");
		String upassword =request.getParameter("upassword");
		String uaddress =request.getParameter("uaddress");
		//封装数据
		User user = new User();
		user.setUname(uname);
		user.setUaccount(uaccount);
		user.setUpassword(upassword);
		user.setUaddress(uaddress);
		// 3.调用业务层service来处理请求的数据
		UserService userService = new UserService();
		userService.adduser(user);

		response.getWriter().write("add User success!");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
