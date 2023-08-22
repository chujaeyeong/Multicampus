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
	background: yellow;
}

</style>
</head>
<body>
<h3>회원검색 처리 요청이 완료되었습니다.</h3><br>
<c:forEach items="${list}" var="bag" begin="1" end="3">
${bag.id} <br>
${bag.pw} <br>
${bag.name} <br>
${bag.tel} <br>
</c:forEach>
</body>
</html>