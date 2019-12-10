<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@page import="com.hxzyan.book.domain.* ,java.util.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>分类的修改</title>
	</head>
	<body>
		<center>
			<h3>图书分类的修改</h3>
			<form action="UpdateCatoryServlet" method="post">
				<table>
					<tr>
						<td>分类名称:</td>
						<td>
						
						<%
						//获取绑定数据
						Category category = (Category)request.getAttribute("category");
						%>
						<input type="text" name="cname" value="<%=category.getName() %>" />
						<input  type="hidden" name="cid" value="<%=category.getCid()%>"/>
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

