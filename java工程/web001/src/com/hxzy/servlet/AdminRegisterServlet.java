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
 * Servlet implementation class AdminRegisterServlet
 */
public class AdminRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//���ý��뷽ʽ
		request.setCharacterEncoding("utf-8");
		//���ܱ�����
		String aaccount = request.getParameter("aaccount");
		String apassword = request.getParameter("apassword");
		String adminname = request.getParameter("adminname");
		//��װ����
		Admin adminform =new Admin();
		adminform.setAaccount(aaccount);
		adminform.setAname(adminname);
		adminform.setPassword(apassword);
		//调用Serviceʹ
		AdminService adminService = new AdminService();
		adminService.addadmin(adminform);
		//ת��
		response.sendRedirect(request.getContextPath() +"/login_admin.html");
	}	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
