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
		// 1.从表单中接收数据id(从表单接收的数据默认为String)
		String idstr = request.getParameter("id");
		int id = Integer.parseInt(idstr);
		// 2.调用service层根据id查询分类信息
		AdminService adminService = new AdminService();
		Admin admin = adminService.findAdminById(id);
		// 3.绑定数据
		request.setAttribute("admin", admin);
		// 4.转发给jsp页面，供用户进行修改
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
