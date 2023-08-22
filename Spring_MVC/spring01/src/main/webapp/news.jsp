<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	오늘의 뉴스입니다 <br>
	착한사람만 보이니다...ㅋㅎㅋㅎ 
	<% if(session.getAttribute("id") == null) {
	} else { %>
	<hr color="blue">
	<form action="aaa">
		댓글 : <input name="reply" value="우왕~~"><button>댓글달기</button>
	</form>
	<%}%>
</body>
</html>