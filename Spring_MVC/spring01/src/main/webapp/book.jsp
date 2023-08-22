<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>book페이지</title>
<style>
body {
	background : #ceffc7;
}

</style>
</head>
<body>
<h4>book 페이지입니다. </h4>
<h5>
	<a href="list3.multi">전체 book 리스트 불러오기</a>
</h5>
<hr color="green">

<h2>book 글쓰기</h2>
<form action="insert3.multi">
name : <input name="name"> <br>
url : <input name="url"> <br>
img : <input name="img"> <br>
<button type="submit">서버로 전송</button> <br>
</form>
<hr color="green">

<h2>book 검색</h2>
<form action="one3.multi">
id : <input name="id" value="1"> <br>
<button type="submit">서버로 전송</button> <br>
</form>
<hr color="green">

</body>
</html>