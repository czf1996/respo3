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
		// 1.���ý���ķ�ʽ
		request.setCharacterEncoding("utf-8");
		// 2.���ձ��ύ������
		String uname = request.getParameter("uname");
		String idstr = request.getParameter("id");
		String upassword =request.getParameter("upassword");
		String uaccount =request.getParameter("uaccount");
		String uaddress =request.getParameter("uaddress");
		
		int id = Integer.parseInt(idstr);
		// 3.��װ����
		User user = new User();
		user.setId(id);
		user.setUname(uname);
		user.setUpassword(upassword);
		user.setUaccount(uaccount);
		user.setUaddress(uaddress);
		// 4.����ҵ���service�����ݽ����޸�
		UserService userService = new UserService();
		userService.updateUser(user);
		// 5.�޸���ɺ󣬽���ǰ��ҳ���ض��򵽲�ѯ���õ��б�ҳ����
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
