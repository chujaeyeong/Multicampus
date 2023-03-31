<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: pink;
}
</style>
</head>
<body>
현재 게시물 조회수 ${count}

<% if(session.getAttribute("id") != null) { %>
<h3>게시판 화면입니다. </h3><br>
<a href="list2.multi">게시판 전체 게시물 검색하기</a>
<hr color="green">
<form action="insert2.multi" method="get">
	no : <input name="no" value="001"><br>
	title : <input name="title" value="Hello~"><br>
	content : <input name="content" value="이것은내용입니다"><br>
	writer : <input name="writer" value="${id}"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="green">

<h3>게시판 - 게시물 수정 화면입니다.</h3>
<hr color="green">
<form action="update2.multi" method="get">
	no : <input name="no" value="001"><br>
	content : <input name="content" value="이것은내용입니다222"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="green">

<h2>게시물 삭제 화면입니다. </h2>
<hr color="green">
<form action="delete2.multi" method="get">
	no : <input name="no" value="001"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="green">
<% } else {%>
<a href="login.jsp">
	<button style="background: green;">로그인 화면으로 GO!</button>
</a>
<%} %>
<h3>게시물 검색 화면입니다. </h3>
<hr color="green">
<form action="one2.multi" method="get">
	no : <input name="no" value="001"><br>
	<button type="submit">서버로 전송</button>
</form>

<hr color="green">

<!-- <button type="button">먹통버튼(아무 기능이 없음)</button> -->
</body>
</html>