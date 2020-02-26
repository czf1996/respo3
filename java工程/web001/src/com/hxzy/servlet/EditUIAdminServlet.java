package com.hxzy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hxzy.service.AdminService;
import com.hxzyan.book.domain.Admin;

/**
 * Servlet implementation class EditUIAdminServlet
 */
public class EditUIAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditUIAdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 1.�ӱ��н�������id(�ӱ����յ�����Ĭ��ΪString)
		String idstr = request.getParameter("id");
		int id = Integer.parseInt(idstr);
		// 2.����service�����id��ѯ������Ϣ
		AdminService adminService = new AdminService();
		Admin admin = adminService.findAdminById(id);
		// 3.������
		request.setAttribute("admin", admin);
		// 4.ת����jspҳ�棬���û������޸�
		request.getRequestDispatcher("/editUIAdmin.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
