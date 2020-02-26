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
			<form action="EditUIUserServlet" method="post">
				<table>
					<tr>
						<td>用户名:</td>
						<td>
						<select name="id">
						<%
							List<User> list = (List<User>) request.getAttribute("list");
							for(User u:list){%>
							<option value="<%=u.getId()%>"><%=u.getUname() %></option>
							<%}
						%>
						</select>
						</td>
					</tr>
					<tr>
						<td colspan="2" align="center">
							<input type="submit" value="确定修改" />
						</td>
					</tr>
				</table>
			</form>
		</center>
	</body>
</html>
