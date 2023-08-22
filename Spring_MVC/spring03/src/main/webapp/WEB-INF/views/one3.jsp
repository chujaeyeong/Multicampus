<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 표현식(expression) -->
<h2>book 검색 처리 요청이 완료되었습니다.</h2>
<!-- bag.getId() -->
<!--model의 속성으로 전달받은 bag은 EL로 노출한다.   -->
${bag.id} <br> <!-- 출력용(expression language-EL) -->
${bag.name} <br>
${bag.url} <br>
<a href="${bag.url}">${bag.url}</a>
<img src="resources/img/${bag.img}" width=300 height=300> <br>

</body>
</html>




