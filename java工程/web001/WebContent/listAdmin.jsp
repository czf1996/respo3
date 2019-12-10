<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@page import="com.hxzyan.book.domain.* ,java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>管理员列表</title>
</head>
<body>
		<center>
			<h3>管理员列表</h3>
			<form action="" method="get">
				<table border="1px" width="80%">
					<tr>
						<th>管理员编号</th>
						<th>管理员名</th>
						<th>管理员账号</th>
						<th colspan="2">操作</th>
					</tr>
					<%
					//获取绑定的数据
					List<Admin> list =(List<Admin>) request.getAttribute("list");
					for(Admin a:list){%>
					<tr>
						<td align="center"><%=a.getId() %></td>
						<td align="center"><%=a.getAname() %></td>
						<td align="center"><%=a.getAaccount() %></td>
						<td><a href="/web001/DeleteUIAdminServlet?id=<%=a.getId()%>">删除</a></td>
						<td><a href="/web001/EditUIAdminServlet?id=<%=a.getId()%>">修改</a></td>
					</tr>
					<%}
					%>
					
					
				</table>
			</form>
		</center>
	</body>
</html>