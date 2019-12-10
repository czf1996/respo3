<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@page import="com.hxzyan.book.domain.* ,java.util.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>图书的修改</title>
	</head>
	<body>
		<center>
			<h3>图书分类的修改</h3>
			<form action="UpdateBookServlet" method="post" enctype="multipart/form-data">
				<table>
				<%
					//获取绑定数据
					Book book = (Book) request.getAttribute("book");
				%>
				    <tr>
						<td>图书名:</td>
						<td>
						<input type="text" name="bname" value="<%=book.getBname() %>" />
						<input  type="hidden" name="id" value="<%=book.getId()%>"/>
						</td>
					</tr>
					
					<tr>
						<td>图书价格:</td>
						<td><input type="text" name="bprivce" value="<%=book.getBprivce()%>" /></td>
					</tr>
					
					<tr>
						<td>
							图书的数量：
						</td>
						<td>
							<input type="text" name="bnumber" value="<%=book.getBnumber()%>" />
						</td>
					</tr>
					<tr>
						<td>
							出版日期：
						</td>
						<td>
							<input type="text" name="bdate" value="<%=book.getBdate()%>" />
						</td>
					</tr>
					<tr>
						<td>
							作者：
						</td>
						<td>
							<input type="text" name="bauthor"  value="<%=book.getBauthor()%>"/>
						</td>
					</tr>
					<tr>
						<td>
							图书种类：
						</td>
						<td>
						<select name="cid">
						<%
							List<Category> list = (List<Category>) request.getAttribute("list");
							for(Category c:list){
								if(c.getCid()==book.getCid())
								{%>
								<option value="<%=c.getCid()%>" selected="selected"><%=c.getName() %></option>
								<%
								}else{%>
								<option value="<%=c.getCid()%>"><%=c.getName() %></option>
								<%}
							%>
							
							<%}
						%>
						</select>
						</td>
					</tr>
					<tr>
						<td>
							上架情况：
						</td>
						<td>
							<input type="text" name="flag"  value="<%=book.getFlag()%>"/>
						</td>
					</tr>
					<tr>
						<td>
							出版社：
						</td>
						<td>
							<input type="text" name="bpress"  value="<%=book.getBpress()%>"/>
						</td>
					</tr>
					<tr>
						<td>图书图片:</td>
						<td><input type="file" name="bphoto" /><img  src="<%=book.getBphoto()%>"></td>
					</tr>
					<tr>
						<td>图书描述:</td>
						<td>
							<textarea name="bdescribe" style="width: 153px; height: auto; overflow:hidden;" ><%=book.getBdescribe()%></textarea>
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
