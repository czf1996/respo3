<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@page import="com.hxzyan.book.domain.Category ,java.util.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>分类的删除</title>
	</head>
	<body>
		<center>
			<h3>图书分类的删除</h3>
			<form action="DeleteUICatoryServlet" method="post">
				<table>
					<tr>
						<td>分类名称:</td>
						<td>
						<select name="cid">
						<%
							List<Category> list = (List<Category>) request.getAttribute("list");
							for(Category c:list){%>
							<option value="<%=c.getCid()%>"><%=c.getName() %></option>
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
