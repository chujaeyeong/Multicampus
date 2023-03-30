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
	background: #fcd2eb;
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
<h3>전체 미팅 참가자 리스트입니다. </h3><br>
<table border="1">
	<tr>
		<td class="top">rank</td>
		<td class="top">name</td>
		<td class="top">phone</td>
		<td class="top">boolean</td>
		<td class="top">time</td>
	</tr>
	<c:forEach items="${list}" var="bag">
	<tr>
		<td class="down">${bag.rank} </td>
		<td class="down">${bag.name}</td>
		<td class="down">${bag.phone}</td>
		<td class="down">${bag.boolean2}</td>
		<td class="down">${bag.time}</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>