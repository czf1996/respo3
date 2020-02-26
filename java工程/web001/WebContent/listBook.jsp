<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@page import="com.hxzyan.book.domain.* ,java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>图书列表</title>
</head>
<body>
		<center>
			<h3>图书列表</h3>
		<form action="" method="get">
			<table border="1px" width="80%">
				<tr>
					<th>图书编号</th>
					<th>图书名称</th>
					<th>图书描述</th>
					<th>图书价格</th>
					<th>图书图片</th>
					<th>图书作者</th>
					<th>图书出版社</th>
					<th>图书出版日期</th>
					<th>图书数量</th>
					<th>图书类别编号</th>
					<th>图书上架情况</th>
					<th colspan="2">操作</th>
				</tr>
				<%
					//获取绑定的数据
					List<Book> list =(List<Book>) request.getAttribute("list");
					for(Book b:list){%>
				<tr>
					<td align="center"><%=b.getId() %></td>
					<td align="center"><%=b.getBname() %></td>
					<td align="center"><%=b.getBdescribe() %></td>
					<td align="center"><%=b.getBprivce()%></td>
					<td align="center"><img src="<%=b.getBphoto()%>" /></td>
					<td align="center"><%=b.getBauthor()%></td>
					<td align="center"><%=b.getBpress()%></td>
					<td align="center"><%=b.getBdate()%></td>
					<td align="center"><%=b.getBnumber()%></td>
					<td align="center"><%=b.getCid()%></td>
					<td align="center"><%=b.getFlag()%></td>
					<td><a href="/web001/DeleteUIBookServlet?id=<%=b.getId()%>">删除</a></td>
					<td><a href="/web001/EditUIBookServlet?id=<%=b.getId()%>">修改</a></td>
				</tr>
				<%}%>
					
				</table>
			</form>
		</center>
	</body>
</html>
	