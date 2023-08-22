<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: orange;
}
.top {
	background: black;
	color: white;
}
.down {
	background: gray;
}
.td{
	width : 100px;
	text-align: center;
}

</style>
</head>
<body>
<h3>전체 게시물 처리 요청이 완료되었습니다.</h3><br>
<table border="1">
	<tr>
		<td>no</td>
		<td>title</td>
		<td>content</td>
		<td>writer</td>
	</tr>
	<c:forEach items="${list}" var="bag">
	<tr>
		<td>${bag.no} </td>
		<td>${bag.title}</td>
		<td>${bag.content}</td>
		<td>${bag.writer}</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>