<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><% 
    String d = request.getParameter("dollar");
    int dollar =  Integer.parseInt(d);
    int won = 1283;
    int result = dollar * won;
%>
<%=result %>