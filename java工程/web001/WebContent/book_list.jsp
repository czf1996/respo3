<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@page import="com.hxzyan.book.domain.* ,java.util.*"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>前端图书列表</title>
<head>
		<meta charset="UTF-8">
		<title></title>
		<style type="text/css">
			#topleft{
				float: left;
				
			}
			
			#topright{
				
				float:right;
				padding-top: 35px;
			}
			
			
			#shuipingtop{
				
				clear:both;
				
			}
			#daohang{
				list-style-type: none;
				
			}
			
			#daohang li{
				
				float:left;
				margin-left: 50px;
			    font-size: 20px;
			    
			}
			
			a{
				
				text-decoration: none;
				display:inline-block;
				margin-right: 83px;
				margin-bottom: 30px;
				color: black;
				
			}
			a:hover{
			color: red;
			}
			
			.productItem{
				display: inline-block;
				
				
			}
			
		</style>
	</head>
	<body>
		
		<div id="top">
			
			<div id="topleft">
				<img src="img/001.png" />
			</div>
			
			<div id="topright" >
				<%
					User user = (User)session.getAttribute("user");
					if(user!=null){
						%>
						<a>亲！<%=user.getUname() %></a>
						<a href="/web001/LoginOutServlet">退出</a>
						<%
					}else{%>
						<a href="/web001/login.html">登陆</a>
				
				       <a href="/web001/register.html">注册</a>
					
					<%}
				%>
				
				<a href="#">购物车</a>
				
			</div>
		</div>
		<div id="shuipingtop">
			<hr />
			
		</div>
		<!--导航条-->
		<div style="background-color: #F2F2F2; width:100%; height: 50px;">
			<ul id="daohang">
				<li><a href="#" style="color:#F47F1F; line-height: 50px;">首页</a></li>
				<%
			       List<Category> clist=(List<Category>)request.getAttribute("clist");
				   for(Category c:clist){
					   
					   %>
					   <li ><a href="#"style="color:black; line-height: 50px; "><%=c.getName() %></a></li>
					   
					   <%
					   
				   }
				
				%>
				</ul>
		</div>
		<!--轮播图-->
		<div>
			<img src="img/1.png" />
			
		</div>
		
		<!--商品列表-->
			
	    <div style="background-color:#EFEFEF;padding: 10px 80px;">
	    
	        <%
			       List<Book> list=(List<Book>)request.getAttribute("list");
				   for(Book b:list){
					   
					   %>
					  <div class="productItem" style="width: 220px;height: 300px; background-color: white; margin: 10px 20px; " >
	    		<div>
	    			<img src="<%=b.getBphoto() %>" width="220px" height="230px"/>
	    			<div style="text-align: center;"><font style="font-size: 12px;"><%=b.getBname() %></font></div>
	    		    <div style="text-align: center;"><font style="font-size: 12px; ">热卖：</font><font style="font-size: 15px; color: #669933; "><b>￥<%=b.getBprivce() %></b></b></font></div>
	    		</div>
	    		
	    		
	    	</div>
					   
					   <%
				   }
				%>
	    </div>
			
		<!--尾部-->	
	    <div>
	    	
	    	<img src="img/footer.png" />
	    </div>		
		
	</body>
</html>