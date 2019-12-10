package com.hxzy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hxzy.service.AdminService;
import com.hxzyan.book.domain.Admin;

/**
 * Servlet implementation class AdminloginServlet
 */
public class AdminloginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminloginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// ���ý��뷽ʽ
		request.setCharacterEncoding("utf-8");
		//��ȡ������
		String aaccount = request.getParameter("aaccount");
		String apassword = request.getParameter("apassword");
		// ����Service
		AdminService adminService = new AdminService();
		Admin admin = adminService.findAdminByAP(aaccount, apassword);
		if (admin != null) {//��¼�ɹ�
			//�����¼�ɹ�����ô������Ա��Ϣ���浽session��
			HttpSession sesion = request.getSession();
			//sesion������
			sesion.setAttribute("admin", admin);
			
			// �ض���
			response.sendRedirect(request.getContextPath() + "/Admin.html");
		} else {
			response.sendRedirect(request.getContextPath() + "/login_admin.html");
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
