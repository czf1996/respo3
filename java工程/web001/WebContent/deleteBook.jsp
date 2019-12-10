<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@page import="com.hxzyan.book.domain.Book ,java.util.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>图书的删除</title>
	</head>
	<body>
		<center>
			<h3>图书的删除</h3>
			<form action="DeleteUIBookServlet" method="post">
				<table>
					<tr>
						<td>图书名:</td>
						<td>
						<select name="id">
						<%
							List<Book> list = (List<Book>) request.getAttribute("list");
							for(Book b:list){%>
							<option value="<%=b.getId()%>"><%=b.getBname() %></option>
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
