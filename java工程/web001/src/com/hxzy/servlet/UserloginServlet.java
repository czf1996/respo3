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
		//���ý��뷽ʽ
		request.setCharacterEncoding("utf-8");
		//��ȡ������
		String uaccount = request.getParameter("uaccount");
		String password = request.getParameter("password");
		//����Service
		UserService userService = new UserService();
		User user = userService.findUserByAP(uaccount, password);
		if(user !=null ){ 
			//�����¼�ɹ�����ȡsession
			HttpSession session =  request.getSession();
			//����Ϣ�󶨵�session��
			session.setAttribute("user", user);
			//�ض���
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
