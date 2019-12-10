package com.hxzy.servlet;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.hxzy.service.BookService;
import com.hxzyan.book.domain.Book;

/**
 * Servlet implementation class UpdateBookServlet
 */
public class UpdateBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("update.............");
		 //���ù���
       DiskFileItemFactory factory=new DiskFileItemFactory();
       //���û�������С5M
       //factory.setSizeThreshold(1024*1024*5);
       //������ʱ�ļ�
       //factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
       //���ý�����
       ServletFileUpload sUpload=new ServletFileUpload(factory);
       Map<String,Object> map=new HashMap<String,Object>();
      
      
       
       try {
           //���������list
           List<FileItem> list=sUpload.parseRequest(request);
           System.out.println("������������"+list.size());
           for(FileItem item:list){
           	if(item.isFormField()){//��ͨ�ı���
           		 String name=item.getFieldName();
           		 
           		 String value=item.getString("utf-8");
           		 
                    System.out.println("����������"+name+":"+value);
                    map.put(name, value);
           		
           		
           	}else{//�ϴ����ļ�
           		
           		 String name=item.getFieldName();
           		 
           		
           		 System.out.println("����������"+name);
           		    //�ϴ������ļ�������ļ��ϴ��ֶ��е��ļ���
                    //ע��IE��FireFox�л�ȡ���ļ����ǲ�һ���ģ�IE���Ǿ���·����FireFox��ֻ���ļ���
                    String fileName = item.getName();
                    System.out.println(fileName);
                    //Substring���ַ�����ȡ������ֵ��һ����ȡ����ַ���
                    //lastIndexOf(".")�Ǵ��������,��ȡ.֮����ַ���
                    String ext = fileName.substring(fileName.lastIndexOf("."));
                    //UUID.randomUUID().toString()��javaJDK�ṩ��һ���Զ����������ķ���, UUID��Ψһȱ���������ɵĽ������Ƚϳ�
                    String uname=UUID.randomUUID()+ext;
                    String newname = "/pic/"+uname;
                    
                    System.out.println("newname:"+newname);
                    
                    map.put(name, newname);
                    
                    //��FileItem�����б�����������ݱ��浽ĳ��ָ�����ļ���
                    File file = new File("D:\\img\\"+uname);
                
                    item.write(file);
           	}
           }
           System.out.println("map:"+map);
           //����һ��Product ����
           Book b=new Book();
           BeanUtils.populate(b, map);
          
         //1.����Service�������Ʒ��Ϣ
   		BookService bookService=new BookService();
   		bookService.updateBook(b);
   		
   		/*response.getWriter().write("add Book success!");*/
   		/*response.sendRedirect(request.getContextPath()+"/ProductServlet?admin=true&action=findAll");
           */
           
   		// 5.�޸���ɺ󣬽���ǰ��ҳ���ض��򵽲�ѯ���õ��б�ҳ����
		response.sendRedirect(request.getContextPath() + "/ListBookServlet");
           
           
       } catch (Exception e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
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
