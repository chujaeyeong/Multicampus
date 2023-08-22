<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			// 기존에 있던 result 내용을 삭제하자 
			$('#result').empty()
			$.ajax({
				url: "list5",
				success : function(x) {
					$('#result').append(x)
				} // success
			}) // ajax
		}) // b1
		
		$('#b2').click(function() {
			// 기존에 있던 result 내용을 삭제하자 
			$('#result').empty()
			$.ajax({
				url: "list6",
				data: {
					bbsno: 35
				},
				success : function(x) {
					$('#result').append(x)
				} // success
			}) // ajax
		}) // b2
		
		$('#b3').click(function() {
			// 기존에 있던 result 내용을 삭제하자 
			$('#result').empty()
			$.ajax({
				url: "list6",
				data: {
					bbsno: 12
				},
				success : function(x) {
					$('#result').append(x)
				} // success
			}) // ajax
		}) // b3
		
		$('#b4').click(function() {
			// 기존에 있던 result 내용을 삭제하자 
			$('#result').empty()
			$.ajax({
				url: "one5",
				data: {
					id: "apple"
				},
				success : function(x) {
					$('#result').append(x)
				} // success
			}) // ajax
		}) // b4
		
		$('#b5').click(function() {
			// 기존에 있던 result 내용을 삭제하자 
			$('#result').empty()
			$.ajax({
				url: "one6",
				data: {
					no: "35"
				},
				success : function(x) {
					$('#result').append(x)
				} // success
			}) // ajax
		}) // b5
		
		$('#b6').click(function() {
			// 기존에 있던 result 내용을 삭제하자 
			$('#result').empty()
			$.ajax({
				url: "list7",
				success : function(x) {
					$('#result').append(x)
				} // success
			}) // ajax
		}) // b5
		
	}) // $

</script>
</head>
<body>
<button id="b1" style="background: yellow">bbs 리스트 가지고 오기</button>
<button id="b2" style="background: orange">bbs 35번 reply 리스트 가지고 오기</button>
<button id="b3" style="background: orange">bbs 12번 reply 리스트 가지고 오기</button> <br> <br>
<button id="b4" style="background: green">member id가 apple인 사람의 정보 가지고 오기</button> <br> <br>
<button id="b5" style="background: pink">bbs no가 35인 게시물의 정보 가지고 오기</button>
<!-- one6, no: 1, views/one6.jsp -->
<button id="b6" style="background: pink">member의 모든 리스트 가지고 오기</button>
<!-- list7, views/list7.jsp -->
<hr color="blue">
<div id="result" style="background: #ffdbf0"></div>
</body>
</html>