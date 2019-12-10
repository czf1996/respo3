package com.hxzy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hxzy.service.CategoryService;

/**
 * Servlet implementation class DeleteUICatoryServlet
 */
public class DeleteUICatoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteUICatoryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1.���ձ��ύ�Ĳ���cid
		int cid=Integer.parseInt(request.getParameter("cid"));
		//2.����ҵ���service ����ɾ��
		CategoryService categoryService =new CategoryService();
		categoryService.deleteCategory(cid);
		//3.ҳ���ض��򵽲�ѯ���еķ����ҳ��
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
