package com.hxzy.servlet;

import java.io.IOException;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hxzy.service.BookService;
import com.hxzy.service.CategoryService;
import com.hxzyan.book.domain.*;

/**
 * Servlet implementation class EditUIBookServlet
 */
public class EditUIBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditUIBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.�ӱ��н�������id(�ӱ����յ�����Ĭ��ΪString)
		String idstr = request.getParameter("id");
		int id = Integer.parseInt(idstr);
		// 2.����service�����id��ѯ������Ϣ
		BookService bookService = new BookService();
		Book book = bookService.findBookById(id);
		CategoryService categoryService = new CategoryService();
		List<Category> list= categoryService.findAll();
		// 3.������
		request.setAttribute("book", book);
		request.setAttribute("list", list);
		// 4.ת����jspҳ�棬���û������޸�
		request.getRequestDispatcher("/editUIBook.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
