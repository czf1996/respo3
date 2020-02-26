package com.hxzy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hxzy.service.CategoryService;
import com.hxzyan.book.domain.Category;

/**
 * Servlet implementation class EditUICatoryServlet
 */
public class EditUICatoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditUICatoryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//1.从表单中接收数据cid(从表单接收的数据默认为String)
		String cidstr =request.getParameter("cid");
		int cid= Integer.parseInt(cidstr);
		//2.调用service层根据cid查询分类信息
		CategoryService categoryService = new CategoryService();
		Category category = categoryService.findCategoryById(cid);
		//3.绑定数据
		request.setAttribute("category", category);
		//4.转发给jsp页面，供用户进行修改
		request.getRequestDispatcher("/editUICategory.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
