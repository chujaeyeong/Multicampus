<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>meeting페이지</title>
<style>
body {
	background : #fcd2eb;
}

</style>
</head>
<body>
<h2>meeting 페이지입니다. </h2>
<h4>
	<a href="MeetingList">전체 meeting 참가자 리스트 불러오기</a>
</h4>
<hr color="green">

<h4>미팅 참가자 등록하기</h4>
<form action="MeetingInsert" method="get">
	rank : <input name="rank"> <br>
	name : <input name="name"> <br>
	phone : <input name="phone"> <br>
	boolean : <input name="boolean2"> <br>
	time : <input name="time"> <br>
<!-- 	boolean : 
	true <input type="radio" name="boolean2" value="true" checked />
	false <input type="radio" name="boolean2" value="false" checked /><br>
	time :
	<input type="datetime-local" id="time"> <br><br> -->
	<button type="submit">서버로 전송</button> <br>
</form>
<hr color="green">

<!-- <h4>미팅 등록내역 수정하기</h4>
<form action="MeetingUpdate" method="get">
	rank : <input name="rank" value="1"><br>
	phone : <input name="phone" value="010-0000-0000"><br><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="green">

<h4>미팅 등록내역 삭제하기</h4>
<form action="MeetingDelete" method="get">
	rank : <input name="rank" value="1"><br><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="green">

<h4>미팅 등록내역 검색하기 (상세)</h4>
<form action="MeetingOne" method="get">
	rank : <input name="rank" value="1"><br><br>
	<button type="submit">서버로 전송</button>
</form> -->

</body>
</html>