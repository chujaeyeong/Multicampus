<%@page import="multi.ProductDAO"%>
<%@page import="multi.ProductVO"%>
<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bag" class="multi.ProductVO"></jsp:useBean> 
    <jsp:setProperty property="*" name="bag"/>
    <!-- 1. 전달된 값 받기 (request) -->
    <!-- 2. sql 만들어서 DAO에게 값 전달 지금은 생략할거임 -->
    <!-- 3. 전달된 값을 출력하는 결과를 브라우저에 Html로 보내기 -->
    <%
    /* String id = request.getParameter("id");
    String name = request.getParameter("name");
    String content = request.getParameter("content");
    String price = request.getParameter("price");
    String company = request.getParameter("company");
    String img = request.getParameter("img"); */
    
    // 1. 받은 데이터를 dao에게 주기 위해서 가방을 만들어서 넣자 
    /* ProductVO bag = new ProductVO();
    bag.setId(id);
    bag.setName(name);
    bag.setContent(content);
    bag.setPrice(Integer.parseInt(price));
    bag.setCompany(company);
    bag.setImg(img); */

    // 2. dao에게 가방을 전달하면서 insert해달라고 하자 
    ProductDAO dao = new ProductDAO();
    dao.insert(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: #fac5d6;
}
</style>
</head>
<body>
상품 등록 요청됨.
<hr color = "red">
<img src="img/<%= bag.getImg() %>" width=300, height=300>
</body>
</html>