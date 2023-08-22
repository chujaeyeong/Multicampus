<%@page import="multi.MemberVO"%>
<%@page import="multi.MemberDAO3"%>
<%@page import="multi.BbsVO"%>
<%@page import="multi.BbsDAO"%>
<%@page import="javax.net.ssl.HttpsURLConnection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% 
    String id = request.getParameter("id"); // 외부에서 입력한 값은 숫자여도 몽땅 다 String 
     
    MemberDAO3 dao = new MemberDAO3();
    MemberVO bag2 = dao.one(id);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: #037BFC;
}
</style>
</head>
<body>
검색 요청한 아이디 : <%= id %> <br>
<hr color = "red">
검색한 pw : <%= bag2.getPw() %> <br>
검색한 name : <%= bag2.getName() %> <br>
검색한 tel : <%= bag2.getTel() %> <br>
</body>
</html>