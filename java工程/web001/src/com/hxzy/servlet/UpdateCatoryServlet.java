package com.hxzy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hxzy.service.CategoryService;
import com.hxzyan.book.domain.Category;

/**
 * Servlet implementation class UpdateCatoryServlet
 */
public class UpdateCatoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCatoryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.���ý���ķ�ʽ
		request.setCharacterEncoding("utf-8");
		//2.���ձ��ύ������
		String  cname=request.getParameter("cname");
		String cidstr =request.getParameter("cid");
		int cid =Integer.parseInt(cidstr);
		//3.��װ����
		Category category = new Category();
		category.setCid(cid);
		category.setName(cname);
		//4.����ҵ���service�����ݽ����޸�
		CategoryService categoryService = new CategoryService();
		categoryService.updateCategory(category);
		//5.�޸���ɺ󣬽���ǰ��ҳ���ض��򵽲�ѯ���õ��б�ҳ����
		response.sendRedirect(request.getContextPath()+ "/ListCategoryServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
