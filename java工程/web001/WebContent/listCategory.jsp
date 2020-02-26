<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@page import="com.hxzyan.book.domain.Category ,java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>种类列表</title>
</head>
<body>
		<center>
			<h3>分类列表</h3>
			<form action="" method="get">
				<table border="1px" width="80%">
					<tr>
						<th>分类编号</th>
						<th>分类名称</th>
						<th colspan="2">操作</th>
					</tr>
					<%
					//获取绑定的数据
					List<Category> list =(List<Category>) request.getAttribute("list");
					for(Category c:list){%>
					<tr>
						<td align="center"><%=c.getCid() %></td>
						<td align="center"><%=c.getName() %></td>
						<td><a href="/web001/DeleteUICatoryServlet?cid=<%=c.getCid()%>">删除</a></td>
						<td><a href="/web001/EditUICatoryServlet?cid=<%=c.getCid()%>">修改</a></td>
					</tr>
					<%}
					%>
					
					
				</table>
			</form>
		</center>
	</body>
</html>