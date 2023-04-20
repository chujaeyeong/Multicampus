<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원검색 요청이 완료되었습니다. </h2>
<!-- 속성으로 지정한 값은 EL로 프린트 -->
<c:forEach items="${list}" var="vo">
<hr color = "green">
ID : ${vo.id} <br>
PW : ${vo.pw} <br>
NAME : ${vo.name} <br>
TEL : ${vo.tel} <br>
</c:forEach>
</body>
</html>