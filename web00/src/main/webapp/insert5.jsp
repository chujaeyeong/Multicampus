
<%@page import="multi.MailDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bag" class="multi.MailVO"></jsp:useBean> 
    <jsp:setProperty property="*" name="bag"/>
    <!-- 1. 전달된 값 받기 (request) -->
    <!-- 2. sql 만들어서 DAO에게 값 전달 지금은 생략할거임 -->
    <!-- 3. 전달된 값을 출력하는 결과를 브라우저에 Html로 보내기 -->
    <%
    // 2. dao에게 가방을 전달하면서 insert해달라고 하자 
    MailDAO dao = new MailDAO();
    dao.insert(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: #faf3e1;
}
</style>
</head>
<body>
<h2>메일 보내기 성공! </h2>
<hr color = "red">
mail no : <%= bag.getMailno() %> <br>
e-mail : <%= bag.getEmail() %> <br>
title : <%= bag.getTitle() %> <br>
content : <%= bag.getContent() %> <br>
date : <%= bag.getMaildate() %> <br>
</body>
</html>