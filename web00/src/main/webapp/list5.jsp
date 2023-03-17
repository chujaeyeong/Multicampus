
<%@page import="multi.MailVO"%>
<%@page import="multi.MailDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%	
    	MailDAO dao = new MailDAO();
    //5,6)dao가 리턴한 BbsVO가 들어간 ArrayList를 받는다. 
    	ArrayList<MailVO> list = dao.list();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>받은메일함 목록</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<h2>전체 보낸메일함의 메일 수 : <%= list.size() %></h2>
<% if(list.size() == 0) { %>
<h3>보낸 메일이 없습니다.</h3>
<!-- <img src="img/empty.jpg" width=250 height="250"> -->
<%}else{ %>
<table class="table table-active table-striped">
 <tr>
 	<td>mail no</td>
 	<td>e-mail</td>
 	<td>title</td>
 	<td>date</td>
 </tr>
<% 
	for(MailVO bag2: list){
%>
 <tr>
 	<td><%= bag2.getMailno() %></td>
 	<td><%= bag2.getEmail() %></td>
 	<td>
 		<a href="one5.jsp?mailno=<%= bag2.getMailno() %>">
			<%= bag2.getTitle() %>
		</a>
 	</td>
 	<td><%= bag2.getMaildate() %></td>
 </tr>
 <% } //for %>
 </table>
 <% } //else %>
</body>
</html>