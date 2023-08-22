<%@page import="multi.MovieDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bag" class="multi.MovieVO"></jsp:useBean> 
    <jsp:setProperty property="*" name="bag"/>
    <!-- 1. 전달된 값 받기 (request) -->
    <!-- 2. sql 만들어서 DAO에게 값 전달 지금은 생략할거임 -->
    <!-- 3. 전달된 값을 출력하는 결과를 브라우저에 Html로 보내기 -->
    <%
    // 2. dao에게 가방을 전달하면서 insert해달라고 하자 
    MovieDAO dao = new MovieDAO();
    dao.insert(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: #cec5fa;
}
</style>
</head>
<body>
<h2>영화 정보 등록 요청됨.</h2>
<hr color = "red">
id : <%= bag.getId() %> <br>
title : <%= bag.getTitle() %> <br>
content : <%= bag.getContent() %> <br>
location : <%= bag.getLocation() %> <br>
director : <%= bag.getDirector() %> <br>
</body>
</html>