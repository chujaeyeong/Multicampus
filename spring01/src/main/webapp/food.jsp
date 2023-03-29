<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: #a3f6ff;
}
</style>
</head>
<body>
<h2>좋아하는 음식 / 싫어하는 음식을 입력해보세요!</h2> <br>
<form action="food">
좋아하는 음식 : <input name="like" value="떡볶이"> <br>
싫어하는 음식 : <input name="dislike" value="연근조림"> <br>
<button type="submit">음식 결과 요청</button>
</form>	

</body>
</html>