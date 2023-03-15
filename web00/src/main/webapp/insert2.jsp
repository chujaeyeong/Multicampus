<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 1. 전달된 값 받기 (request) -->
    <!-- 2. sql 만들어서 DAO에게 값 전달 지금은 생략할거임 -->
    <!-- 3. 전달된 값을 출력하는 결과를 브라우저에 Html로 보내기 -->
    <%
    String no = request.getParameter("no");
    String title = request.getParameter("title");
    String name = request.getParameter("name");
    String content = request.getParameter("content");
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
게시물 번호 : <%= no %> <br>
게시물 제목 : <%= title %> <br>
글쓴이 : <%= name %> <br>
게시물 내용 : <%= content %> <br>
</body>
</html>