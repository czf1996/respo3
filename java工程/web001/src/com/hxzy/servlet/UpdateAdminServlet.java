package com.hxzy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hxzy.service.AdminService;
import com.hxzyan.book.domain.Admin;

/**
 * Servlet implementation class UpdateAdminServlet
 */
public class UpdateAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateAdminServlet() {
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
				String aname = request.getParameter("aname");
				String idstr = request.getParameter("id");
				String apassword =request.getParameter("apassword");
				String aaccount =request.getParameter("aaccount");
				
				
				int id = Integer.parseInt(idstr);
				// 3.封装数据
				Admin admin = new Admin();
				admin.setId(id);
				admin.setAname(aname);
				admin.setPassword(apassword);
				admin.setAaccount(aaccount);
				
				// 4.调用业务层service对数据进行修改
				AdminService adminService = new AdminService();
				adminService.updateAdmin(admin);
				// 5.修改完成后，将当前的页面重定向到查询所用的列表页面中
				response.sendRedirect(request.getContextPath() + "/ListAdminServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
