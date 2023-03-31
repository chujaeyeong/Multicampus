<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<img src="https://cdn.pixabay.com/photo/2016/03/05/19/02/hamburger-1238246_960_720.jpg"
     width="300" height="300"> <br>
<%
	if(session.getAttribute("id") != null) { //로그인이 성공 
%>
	<a href="bbb"> <button>공동구매 참여</button></a>
<%}else{ %> <!-- 로그인 안함.  -->
	<a href="login.jsp">로그인페이지로</a>
<%}%>
</body>
</html>