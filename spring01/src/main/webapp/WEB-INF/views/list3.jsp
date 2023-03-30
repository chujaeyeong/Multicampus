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
	background: #ceffc7;
}
.top {
	background: black;
	color: white;
}
.down {
	background: #e8e4df;
}
td{
	width : 200px;
	text-align: center;
}

</style>
</head>
<body>
<h3>전체 book 처리 요청이 완료되었습니다.</h3><br>
<table border="1">
	<tr>
		<td class="top">id</td>
		<td class="top">name</td>
		<td class="top">url</td>
		<td class="top">img</td>
	</tr>
	<c:forEach items="${list}" var="bag">
	<tr>
		<td class="down">${bag.id} </td>
		<td class="down">${bag.name}</td>
		<td class="down"><a href="${bag.url}">사이트 바로가기</a></td>
		<td class="down"><img src="resources/img/${bag.img}" width="100" height="100"></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>