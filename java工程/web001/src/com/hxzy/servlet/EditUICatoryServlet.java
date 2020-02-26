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

		//1.�ӱ��н�������cid(�ӱ����յ�����Ĭ��ΪString)
		String cidstr =request.getParameter("cid");
		int cid= Integer.parseInt(cidstr);
		//2.����service�����cid��ѯ������Ϣ
		CategoryService categoryService = new CategoryService();
		Category category = categoryService.findCategoryById(cid);
		//3.������
		request.setAttribute("category", category);
		//4.ת����jspҳ�棬���û������޸�
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
