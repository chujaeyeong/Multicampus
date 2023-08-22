<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: #fcd2eb;
}

</style>
</head>
<body>
<h2>회원검색(상세) 처리 요청이 완료되었습니다.</h2>
<!-- bag.getId() -->
<!--model의 속성으로 전달받은 bag은 EL로 노출한다.   -->
${bag.rank} <br> <!-- 출력용(expression language-EL) -->
${bag.name} <br>
${bag.phone} <br>
${bag.boolean2} <br>
${bag.time}
</body>
</body>
</html>