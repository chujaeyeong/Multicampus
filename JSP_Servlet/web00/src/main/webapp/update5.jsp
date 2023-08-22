<%@page import="multi.MailDAO"%>
<%@page import="multi.MailVO"%>
<%@page import="javax.net.ssl.HttpsURLConnection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 브라우저가 보낸 데이터를 받아야 함.==> 자바로 짜야함. -->
    <!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품 필요함. -->
    <% // 스크립트릿 - 조금 코드를 써서 만드는 작은 프로그램 
    //자바코드 넣는 부분!!
   	//HttpServletRequest request = new HttpServletRequest();
    //tomcat은 미리 reqeust를 만들어서 내장시켜놨어요! 
    String mailno = request.getParameter("mailno"); 
    String content = request.getParameter("content"); 
    
    // 1. 받은 데이터를 dao에게 주기 위해서 가방을 만들어서 넣자 
    MailVO bag = new MailVO();
    bag.setMailno(mailno);
    bag.setContent(content);
    
    // 2. dao에게 가방을 전달하면서 insert해달라고 하자 
    MailDAO dao = new MailDAO();
    dao.update(bag);
    %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메일 수정 결과</title>
<style type="text/css">
body {
	background: #faf3e1;
}
</style>
</head>
<body>
보낸 메일 수정 요청되었음. 
<hr color = "red">
수정을 원하는 mail no : <%= mailno %> <br>
수정을 원하는 mail 내용 : <%= content %> <br>
</body>
</html>