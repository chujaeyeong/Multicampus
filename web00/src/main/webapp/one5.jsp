
<%@page import="multi.MailVO"%>
<%@page import="multi.MailDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String mailno = request.getParameter("mailno"); 
    	
    	MailDAO dao = new MailDAO();
    	MailVO bag2 = dao.one(mailno);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>보낸메일 검색(상세) 결과</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<h2>당신이 검색을 원하는 mail no : <%= mailno %></h2>
<!-- 복수 리스트를 검색 결과로 불러오고 싶으면 list 하나 더 만들어서 arraylist로 불러오기!  -->
<hr color="red">

 <table class="table table-active table-striped">
 	<tr>
 		<td>email</td>
 		<td><%= bag2.getEmail() %></td>
 	</tr>
 	<tr>
 		<td>title</td>
 		<td><%= bag2.getTitle() %></td>
 	</tr>
 	<tr>
 		<td>content</td>
 		<td><%= bag2.getContent() %></td>
 	</tr>
 	<tr>
 		<td>받은 날짜</td>
 		<td><%= bag2.getMaildate() %></td>
 	</tr>
 </table>

</body>
</html>