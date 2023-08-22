<%@page import="com.multi.mvc02.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			// 1. 화면을 이동하지 않고, 서버에 insert해달라고 요청 
			// 2. 성공하면, result 아래에 append!
			content = $('#reply').val()
			writer = "apple"
			$. ajax({
				url: "insert4",
				data: {
					bbsno: ${bag.no},
					content: content,
					writer: writer
				},
				success: function() {
					alert('댓글 달기 성공!')
					$('#result').append("- " + content + ", " + writer + "<br>")
					$('#reply').val('')
					
				} // success
			}) // ajax
		}) // b1
	}) // $

</script>


<style>
body {
	background: yellow;
}
</style>
</head>
<body>
<a href="bbs.jsp">처음페이지로</a>
<a href="list2">게시물 전체 목록페이지</a>
<hr color="red">

게시물검색 처리 요청이 완료되었습니다.
<br>
${bag.no}, ${bag.title}, 
${bag.content}, ${bag.writer}
<hr color="red">
댓글달기 <input id="reply"> <button id="b1">댓글달기</button> <br>
<hr color="green">
<div id="result">
<!-- for-each를 이용해 댓글 목록을 프린트!! -->
	<c:forEach items="${list}" var="bag"> 
	- ${bag.content}, ${bag.writer} <br>
	</c:forEach>
</div>
</body>
</html>