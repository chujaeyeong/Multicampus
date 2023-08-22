<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 1. 전달된 값 받기 (request) -->
    <!-- 2. sql 만들어서 DAO에게 값 전달 지금은 생략할거임 -->
    <!-- 3. 전달된 값을 출력하는 결과를 브라우저에 Html로 보내기 -->
    <%
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    String writer = request.getParameter("writer");
    
    // 1. 받은 데이터를 dao에게 주기 위해서 가방을 만들어서 넣자 
    BbsVO bag = new BbsVO();
    bag.setTitle(title);
    bag.setContent(content);
    bag.setWriter(writer);
    
    // 2. dao에게 가방을 전달하면서 insert해달라고 하자 
    BbsDAO dao = new BbsDAO();
    dao.insert(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: skyblue;
}
</style>
</head>
<body>
게시판 글쓰기 요청됨.
<hr color = "red">
제목 : <%= title %> <br>
내용 : <%= content %> <br>
작성자명 : <%= writer %> <br>
</body>
</html>