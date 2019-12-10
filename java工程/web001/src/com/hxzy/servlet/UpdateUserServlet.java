package com.hxzy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hxzy.service.UserService;
import com.hxzyan.book.domain.User;

/**
 * Servlet implementation class UpdateUserServlet
 */
public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 1.设置解码的方式
		request.setCharacterEncoding("utf-8");
		// 2.接收表单提交的数据
		String uname = request.getParameter("uname");
		String idstr = request.getParameter("id");
		String upassword =request.getParameter("upassword");
		String uaccount =request.getParameter("uaccount");
		String uaddress =request.getParameter("uaddress");
		
		int id = Integer.parseInt(idstr);
		// 3.封装数据
		User user = new User();
		user.setId(id);
		user.setUname(uname);
		user.setUpassword(upassword);
		user.setUaccount(uaccount);
		user.setUaddress(uaddress);
		// 4.调用业务层service对数据进行修改
		UserService userService = new UserService();
		userService.updateUser(user);
		// 5.修改完成后，将当前的页面重定向到查询所用的列表页面中
		response.sendRedirect(request.getContextPath() + "/ListUserServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
