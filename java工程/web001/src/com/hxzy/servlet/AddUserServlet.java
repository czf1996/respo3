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
		// 1.���ý��뷽ʽ
		request.setCharacterEncoding("utf-8");
		// 2.���ձ��ύ�����ݣ����ö����װ
		String uname = request.getParameter("uname");
		String uaccount =request.getParameter("uaccount");
		String upassword =request.getParameter("upassword");
		String uaddress =request.getParameter("uaddress");
		//��װ����
		User user = new User();
		user.setUname(uname);
		user.setUaccount(uaccount);
		user.setUpassword(upassword);
		user.setUaddress(uaddress);
		// 3.����ҵ���service���������������
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
