<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@page import="com.hxzyan.book.domain.* ,java.util.*"  %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>top</title>
		<style>
			img{
				display: block;
				float: left;
			}
			h2{
				clear: all;
				padding-top: 30px;
				padding-right: 200px;
			}
		</style>
	</head>
	<body bgcolor="FFFFFF">
		<div>
		<img src="img/log.png"/>
		<%
			Admin admin = (Admin)session.getAttribute("admin");
			if(admin!=null){%>
			<center><h2>欢迎<span style="color: blue;"><%=admin.getAname() %></span>来到博库网后台界面</h2></center>
			<% }else{%>
			<center><h2>欢迎来到博库网后台界面</h2></center>
			
			<%}
		%>
		
		
		</div>
	</body>
</html>