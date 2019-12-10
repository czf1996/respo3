<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@page import="com.hxzyan.book.domain.User ,java.util.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>用户的修改</title>
	</head>
	<body>
		<center>
			<h3>用户的修改</h3>
			<form action="UpdateUserServlet" method="post">
				<table>
				<%
					//获取绑定数据
					User user = (User) request.getAttribute("user");
				%>
				    <tr>
						<td>用户名:</td>
						<td>
						<input type="text" name="uname" value="<%=user.getUname() %>" />
						<input  type="hidden" name="id" value="<%=user.getId()%>"/>
						</td>
					</tr>
					 <tr>
						<td>用户账号:</td>
						<td>
						<input type="text" name="uaccount" value="<%=user.getUaccount() %>" />
						</td>
					</tr>
					<tr>
						<td>用户密码:</td>
						<td>
						<input type="password" name="upassword" value="<%=user.getUpassword() %>" />
						</td>
					</tr>
					 <tr>
						<td>用户地址:</td>
						<td>
						<input type="text" name="uaddress" value="<%=user.getUaddress() %>" />
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
