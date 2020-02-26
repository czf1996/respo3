<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@page import="com.hxzyan.book.domain.* ,java.util.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>图书添加</title>
	</head>
	<body>
		<center>
			<h3>图书添加</h3>
			<form action="AddBookServlet" method="post" enctype="multipart/form-data">
				<table>
					<tr>
						<td>图书分类:</td>
						<td>
						<select name="cid" style="width: 145px;">
						<%
							List<Category> list = (List<Category>) request.getAttribute("list");
							for(Category c:list){%>
							<option value="<%=c.getCid()%>"><%=c.getName() %></option>
							<%}
						%>
						</td>
					</tr>
					<tr>
						<td>图书名称:</td>
						<td><input type="text" name="bname" /></td>
					</tr>
					<tr>
						<td>图书价格:</td>
						<td><input type="text" name="bprivce" /></td>
					</tr>
					
					<tr>
						<td>
							图书的数量：
						</td>
						<td>
							<input type="text" name="bnumber" />
						</td>
					</tr>
					<tr>
						<td>
							出版日期：
						</td>
						<td>
							<input type="text" name="bdate" />
						</td>
					</tr>
					<tr>
						<td>
							作者：
						</td>
						<td>
							<input type="text" name="bauthor" />
						</td>
					</tr>
					<tr>
						<td>
							出版社：
						</td>
						<td>
							<input type="text" name="bpress" />
						</td>
					</tr>
					<tr>
						<td>图书图片:</td>
						<td><input type="file" name="bphoto" /></td>
					</tr>
					<tr>
						<td>图书描述:</td>
						<td>
							<textarea name="bdescribe" style="width: 153px; height: auto; overflow:hidden;" ></textarea>
						</td>
					</tr>
					<tr>
						<td colspan="2" align="center">
							<input type="submit" value="添加" />
						</td>
					</tr>
				</table>
			</form>
		</center>
	</body>
</html>
