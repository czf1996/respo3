package com.hxzy.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hxzy.service.AdminService;
import com.hxzyan.book.domain.Admin;

/**
 * Servlet implementation class ListAdminServlet
 */
public class ListAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListAdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 1.����ҵ���service����ѯ���з���ĵ�����
				AdminService adminService = new AdminService();
				List<Admin> list = adminService.findAll();
				System.out.println("list:" + list);
				// 2.������
				request.setAttribute("list", list);

				// ���ݽ��յĲ��������������ݴ��ݸ�˭
				String action = request.getParameter("action");
				System.out.println("action:" + action);
				if (action != null) {
					if (action.equals("delete")) {
						request.getRequestDispatcher("/deleteAdmin.jsp").forward(request, response);
					} else if (action.equals("edit")) {
						request.getRequestDispatcher("/editAdmin.jsp").forward(request, response);
					}
				} else {
					// 3.ת��
					request.getRequestDispatcher("/listAdmin.jsp").forward(request, response);

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
