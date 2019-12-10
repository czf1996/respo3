package com.hxzy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hxzy.service.UserService;
import com.hxzyan.book.domain.User;

/**
 * Servlet implementation class EditUIUserServlet
 */
public class EditUIUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditUIUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.从表单中接收数据id(从表单接收的数据默认为String)
		String idstr = request.getParameter("id");
		int id = Integer.parseInt(idstr);
		// 2.调用service层根据id查询分类信息
		UserService userService = new UserService();
		User user = userService.findUserById(id);
		// 3.绑定数据
		request.setAttribute("user", user);
		// 4.转发给jsp页面，供用户进行修改
		request.getRequestDispatcher("/editUIUser.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
