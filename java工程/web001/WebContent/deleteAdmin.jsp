<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@page import="com.hxzyan.book.domain.Admin ,java.util.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>管理员的删除</title>
	</head>
	<body>
		<center>
			<h3>管理员的删除</h3>
			<form action="DeleteUIAdminServlet" method="post">
				<table>
					<tr>
						<td>管理员名:</td>
						<td>
						<select name="id">
						<%
							List<Admin> list = (List<Admin>) request.getAttribute("list");
							for(Admin a:list){%>
							<option value="<%=a.getId()%>"><%=a.getAname() %></option>
							<%}
						%>
						</select>
						</td>
					</tr>
					<tr>
						<td colspan="2" align="center">
							<input type="submit" value="确定删除" />
						</td>
					</tr>
				</table>
			</form>
		</center>
	</body>
</html>
