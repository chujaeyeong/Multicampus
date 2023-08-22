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
<!-- 표현식(expression) -->
<h2>게시물검색 처리 요청이 완료되었습니다.</h2>
<!-- bag.getId() -->
<!--model의 속성으로 전달받은 bag은 EL로 노출한다.   -->
${bag.no} <br> <!-- 출력용(expression language-EL) -->
${bag.title} <br>
${bag.content} <br>
${bag.writer} <br>
</body>
</html>