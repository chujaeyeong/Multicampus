<%@page import="com.multi.mvc03.BbsVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: yellow;
}

td {
	width: 100px;
	text-align: center;
}

.top {
	background: black;
	color: white;
}

.down {
	background: lime;
}
</style>
</head>
<body>
	<table>
		<tr>
			<td class="top">no</td>
			<td class="top">title</td>
			<td class="top">content</td>
			<td class="top">writer</td>
		</tr>

		<c:forEach items="${list}" var="bag"> 

<tr>
				<td class="down">${bag.id}</td>
				<td class="down"><a href="one3.multi?id=${bag.id}">${bag.name}</a>
				</td>
				<td class="down">${bag.url}</td>
				<td class="down">
					<img src="resources/img/${bag.img}" width=200 height=200>				
				</td>
			</tr>

		</c:forEach>
	</table>
</body>
</html>