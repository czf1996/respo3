<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@page import="com.hxzyan.book.domain.* ,java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户列表</title>
</head>
<body>
		<center>
			<h3>用户列表</h3>
			<form action="" method="get">
				<table border="1px" width="80%">
					<tr>
						<th>用户编号</th>
						<th>用户名</th>
						<th>用户账号</th>
						<th>用户地址</th>
						<th colspan="2">操作</th>
					</tr>
					<%
					//获取绑定的数据
					List<User> list =(List<User>) request.getAttribute("list");
					for(User u:list){%>
					<tr>
						<td align="center"><%=u.getId() %></td>
						<td align="center"><%=u.getUname() %></td>
						<td align="center"><%=u.getUaccount() %></td>
						<td align="center"><%=u.getUaddress()%></td>
						<td><a href="/web001/DeleteUIUserServlet?id=<%=u.getId()%>">删除</a></td>
						<td><a href="/web001/EditUIUserServlet?id=<%=u.getId()%>">修改</a></td>
					</tr>
					<%}
					%>
					
					
				</table>
			</form>
		</center>
	</body>
</html>