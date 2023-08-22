<%@page import="com.multi.mvc01.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<a href="bbs.jsp">처음페이지로</a>
<a href="list2">게시물 전체 목록페이지</a><br>
<hr color="red">
<% 
	// 세션에서 값을 꺼내는 방법 
	String id = (String)session.getAttribute("id");
	// 모델에서 값을 꺼내는 방법 
	// BbsController 에서 model을 model.addAttribute("bag", bag); 이라고 했으니까 
	BbsVO bag = (BbsVO)request.getAttribute("bag"); 
	String writer = bag.getWriter();
	if (id.equals(writer)) { %>

<a href="update2">
	<button style="background: green;" >수정</button>
</a>
<a href="delete2.multi?no=${bag.no}">
	<button style="background: green;" >삭제</button>
</a><br>
<%} %>
게시물검색 처리 요청이 완료되었습니다.
<br>
${bag.no}, ${bag.title}, 
${bag.content}, ${bag.writer}
</body>
</html>