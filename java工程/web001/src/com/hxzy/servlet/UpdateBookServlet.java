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
		 //设置工厂
       DiskFileItemFactory factory=new DiskFileItemFactory();
       //设置缓冲区大小5M
       //factory.setSizeThreshold(1024*1024*5);
       //设置临时文件
       //factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
       //设置解析器
       ServletFileUpload sUpload=new ServletFileUpload(factory);
       Map<String,Object> map=new HashMap<String,Object>();
      
      
       
       try {
           //解析结果放list
           List<FileItem> list=sUpload.parseRequest(request);
           System.out.println("表单数据项数："+list.size());
           for(FileItem item:list){
           	if(item.isFormField()){//普通的表单域
           		 String name=item.getFieldName();
           		 
           		 String value=item.getString("utf-8");
           		 
                    System.out.println("数据项名："+name+":"+value);
                    map.put(name, value);
           		
           		
           	}else{//上传的文件
           		
           		 String name=item.getFieldName();
           		 
           		
           		 System.out.println("数据项名："+name);
           		    //上传的是文件，获得文件上传字段中的文件名
                    //注意IE或FireFox中获取的文件名是不一样的，IE中是绝对路径，FireFox中只是文件名
                    String fileName = item.getName();
                    System.out.println(fileName);
                    //Substring是字符串截取，返回值是一个截取后的字符串
                    //lastIndexOf(".")是从右向左查,获取.之后的字符串
                    String ext = fileName.substring(fileName.lastIndexOf("."));
                    //UUID.randomUUID().toString()是javaJDK提供的一个自动生成主键的方法, UUID的唯一缺陷在于生成的结果串会比较长
                    String uname=UUID.randomUUID()+ext;
                    String newname = "/pic/"+uname;
                    
                    System.out.println("newname:"+newname);
                    
                    map.put(name, newname);
                    
                    //将FileItem对象中保存的主体内容保存到某个指定的文件中
                    File file = new File("D:\\img\\"+uname);
                
                    item.write(file);
           	}
           }
           System.out.println("map:"+map);
           //创建一个Product 对象
           Book b=new Book();
           BeanUtils.populate(b, map);
          
         //1.调用Service层添加商品信息
   		BookService bookService=new BookService();
   		bookService.updateBook(b);
   		
   		/*response.getWriter().write("add Book success!");*/
   		/*response.sendRedirect(request.getContextPath()+"/ProductServlet?admin=true&action=findAll");
           */
           
   		// 5.修改完成后，将当前的页面重定向到查询所用的列表页面中
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
