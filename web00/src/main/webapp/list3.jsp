<%@page import="multi.ProductVO"%>
<%@page import="multi.ProductDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	  	
    	ProductDAO dao = new ProductDAO();
    //5,6)dao가 리턴한 BbsVO가 들어간 ArrayList를 받는다. 
    	ArrayList<ProductVO> list = dao.list();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
 <table class="table table-hover table-striped">
 <tr>
 	<td>id</td>
 	<td>name</td>
 	<td>content</td>
 	<td>price</td>
 </tr>
<% 
	for(ProductVO bag2: list){
%>
 <tr>
 	<td><%= bag2.getId() %></td>
 	<td>
 		<a href="one3.jsp?id=<%= bag2.getId() %>">
			<%= bag2.getName() %>
		</a>
 	</td>
 	<td><%= bag2.getContent() %></td>
 	<td><%= bag2.getPrice() %>원</td>
 </tr>
 <% } %>
 </table>
</body>
</html>