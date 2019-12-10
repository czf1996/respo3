package com.hxzy.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hxzy.service.BookService;
import com.hxzyan.book.domain.Book;

/**
 * Servlet implementation class ListBookServlet
 */
public class ListBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 1.调用业务层service来查询所有分类的的数据
		BookService bookService = new BookService();
		List<Book> list = bookService.findAll();
		System.out.println("list:" + list);
		// 2.绑定数据
		request.setAttribute("list", list);

		// 根据接收的参数来决定将数据传递给谁
		String action = request.getParameter("action");
		System.out.println("action:" + action);
		if (action != null) {
			if (action.equals("delete")) {
				request.getRequestDispatcher("/deleteBook.jsp").forward(request, response);
			} else if (action.equals("edit")) {
				request.getRequestDispatcher("/editBook.jsp").forward(request, response);
			}
		} else {
			// 3.转发
			request.getRequestDispatcher("/listBook.jsp").forward(request, response);

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
