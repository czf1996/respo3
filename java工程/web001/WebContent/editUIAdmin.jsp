<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@page import="com.hxzyan.book.domain.Admin ,java.util.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>用户的修改</title>
	</head>
	<body>
		<center>
			<h3>用户分类的修改</h3>
			<form action="UpdateAdminServlet" method="post">
				<table>
				<%
					//获取绑定数据
					Admin admin = (Admin) request.getAttribute("admin");
				%>
				    <tr>
						<td>用户名:</td>
						<td>
						<input type="text" name="aname" value="<%=admin.getAname() %>" />
						<input  type="hidden" name="id" value="<%=admin.getId()%>"/>
						</td>
					</tr>
					 <tr>
						<td>用户账号:</td>
						<td>
						<input type="text" name="aaccount" value="<%=admin.getAaccount() %>" />
						</td>
					</tr>
					<tr>
						<td>用户密码:</td>
						<td>
						<input type="password" name="apassword" value="<%=admin.getPassword() %>" />
						</td>
					</tr>
					 
					<tr>
						<td colspan="2" align="center">
							<input type="submit" value="修改" />
						</td>
					</tr>
				</table>
			</form>
		</center>
	</body>
</html>
