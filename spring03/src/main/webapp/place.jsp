<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>또간집 - 맛집 등록 & 공유 커뮤니티 입니다.</h2>

<hr color=green>

<h4>맛집을 등록하기</h4>
<form action="insert10.place" method="get">
name : <input name="name" value="상호명을 입력하세요"> <br>
url : <input name="url" value="네이버지도 url을 입력해주세요"> <br>
content : <input name="content" value="맛집 평가를 써주세요"> <br>
userid : <input name="userid" value="user id를 입력하세요"> <br>
<button type="submit">서버로 전송</button>
</form>

<hr color="blue">

<h4>등록한 맛집 평가 수정하기</h4>
<form action="update10.place" method="get">
content : <input name="content" value="맛집평을 수정해주세요"> <br>
userid : <input name="userid" value="user id를 입력하세요"> <br>
<button type="submit">서버로 전송</button>
</form>

<hr color="blue">

<h4>등록한 맛집 평가 삭제하기</h4>
<form action="delete10.place" method="get">
name : <input name="name" value="상호명을 입력하세요"> <br>
<button type="submit">서버로 전송</button>
</form>

<hr color="blue">

<h4>등록한 맛집 검색하기</h4>
<form action="one10.place" method="get">
name : <input name="name" value="상호명을 입력하세요"> <br>
<button type="submit">서버로 전송</button>
</form>

<hr color="blue">

<h4><a href="list10.place">등록된 맛집 전체 목록 불러오기</a></h4>

</body>
</html>