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
		// 시작하자마자 bbs list를 띄워주자 
		$('#result').empty()
		$.ajax({
			url : "list5",
			success : function(x) {
				$('#result').append(x)
			} // success
		}) // ajax

		$('#b2').click(function() {
			$('#result').empty()
			$.ajax({
				url : "update5",
				data : {
					no : $('#no').val(),
					content : $('#content').val()
				},
				success : function(x) {
					$('#result').append(x)
					alert("게시물 수정을 완료했습니다!")
				} // success
			}) // ajax
		}) // b2
		
		$('#b3').click(function() {
			$('#result').empty()
			$.ajax({
				url : "delete5",
				data : {
					no : $('#no2').val(),
				},
				success : function(x) {
					alert("게시물 삭제를 완료했습니다!")
					document.location.reload();
				} // success
			}) // ajax
		}) // b3
		
		$('#b4').click(function() {
			$('#result').empty()
			$.ajax({
				crossOrigin: true,
				url: 'http://api.openweathermap.org/data/2.5/weather?q=seoul&units=metirc&lang=kr&appid=43238037f8f84c1b9d70369513a425e6',
				dataType: 'json',
				success: function(x) {
					console.log(x);
					$('#result').html(
			                "위치 : " + x.name + "<br>"+
			                "날씨 : " + x.weather[0].description + "<br>"+
			                "최고 기온 : " + (x.main.temp_max - 273.15).toFixed(1) + "℃ <br>" +
			                "최저 기온 : " + (x.main.temp_min - 273.15).toFixed(1) + "℃ <br>" +
			                "체감 온도 : " + (x.main.feels_like - 273.15).toFixed(1) + "℃ <br>"
			            );
				} // success 
			}) // ajax
		}) // b4
		
	}) // $
</script>
</head>
<body>
	1) 수정할 게시물 no :
	<input id="no" value="12">
	<br> 2) 수정하고싶은 게시물 내용 :
	<input id="content" value="수정한 게시물 내용11">
	<br>
	<button id="b2">게시물 수정하기</button>
	<hr color="green">

	1) 삭제하고싶은 게시물 no :
	<input id="no2" value="20">
	<button id="b3">게시물 삭제하기</button>
	<hr color="green">

	<button id="b4">오늘의 날씨정보 확인하기</button>
	<hr color="green">

	<div id="result" style="background: #d9c9ff"></div>

</body>
</html>