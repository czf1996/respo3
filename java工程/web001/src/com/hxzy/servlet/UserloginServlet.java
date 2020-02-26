package com.hxzy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hxzy.service.UserService;
import com.hxzyan.book.domain.User;

/**
 * Servlet implementation class UserloginServlet
 */
public class UserloginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserloginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置解码方式
		request.setCharacterEncoding("utf-8");
		//获取表单数据
		String uaccount = request.getParameter("uaccount");
		String password = request.getParameter("password");
		//调用Service
		UserService userService = new UserService();
		User user = userService.findUserByAP(uaccount, password);
		if(user !=null ){ 
			//如果登录成功，获取session
			HttpSession session =  request.getSession();
			//把信息绑定到session中
			session.setAttribute("user", user);
			//重定向
			response.sendRedirect(request.getContextPath() +"/index.jsp");
		}else{
			response.sendRedirect(request.getContextPath() +"/login.html");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
