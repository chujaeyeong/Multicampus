<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$('#result').empty()
			$.ajax({
				url : "one0405",
				data : {
					id : $('#id').val(),
				},
				dataType : "json",
				success : function(json) {
					id = json.id
					pw = json.pw
					name = json.name
					tel = json.tel
					
					table = "<table border=1 width=300><tr><td>항목명</td><td>값</td></tr>" + 
					"<tr><td>아이디</td><td>" + id +"</td></tr>" + 
					"<tr><td>패스워드</td><td>" + pw +"</td></tr>" + 
					"<tr><td>이름</td><td>" + name +"</td></tr>" + 
					"<tr><td>전화번호</td><td>" + tel +"</td></tr></table><br>"
					
					$('#result').append(table)
				} //success
			}) //ajax
		})//b1
		
		$('#b2').click(function() {
			$('#result').empty()
		    $.ajax({
		        url: "list0405",
		        dataType : "json",
		        success: function(json) {
		            for(var i=0; i<json.length; i++){
		                var id = json[i].id
		                var pw = json[i].pw
		                var name = json[i].name
		                var tel = json[i].tel
		                $('#result').append(id + ", " + pw + ", " + name + ", " + tel + ", " + "<br>");
		            }
		        }
		    });
		});
		
		$('#b22').click(function() {
		    $('#result').empty();
		    $.ajax({
		        url: "list0405",
		        dataType: "json",
		        success: function(json) {
		            var table = "<table border=1 width=300><tr><td>id</td><td>pw</td><td>name</td><td>tel</td></tr>";
		           	// table의 헤더 (첫번째줄)만 for 루프에서 빼서 먼저 var table로 변수 지정  
		           	// 그리고 table의 body는 for문으로 돌려준다 
		            for(var i = 0; i < json.length; i++) {
		                var id = json[i].id;
		                var pw = json[i].pw;
		                var name = json[i].name;
		                var tel = json[i].tel;
		                table += "<tr><td>" + id + "</td><td>" + pw +"</td><td>" + name + "</td><td>" + tel + "</td></tr>";
		            } // for
		            // for문 끝나면 나머지 테이블의 마지막 부분 </table> 적어주기 
		            // 위에를 var table로 지정했으니까 밑에는 그냥 table로 변수 선언해서 table 붙이기 
		            table += "</table><br>";
		            $('#result').append(table);
		        } // success
		    }); // ajax
		}); // b22

	})//$
</script>

</head>
<body>
	<h2>심화 REST 정리 문제</h2>

	<hr color="green">
	불러오고싶은 member id를 입력하세요 : <input id="id" value="apple112">
	<button id="b1">MemberVO 내용 출력하기 (table)</button>
	<br>

	<hr color="green">

	<button id="b2">MemberVO 전체리스트 출력하기 (list)</button>
	<br>
	<button id="b22">MemberVO 전체리스트 출력하기 (table)</button>
	<br>

	<hr color="green">

	<button id="b3">코엑스 지도 보기</button>
	<br>

	<hr color="green">

	<button id="b4">구글차트 보기</button>
	<br>

	<hr color="green">

	<div id="result"></div>
</body>
</html>