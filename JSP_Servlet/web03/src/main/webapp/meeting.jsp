<%@page import="multi.MeetingDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="bag" class="multi.MeetingVO"></jsp:useBean>
<jsp:setProperty property="*" name="bag"/>
<%
	MeetingDAO dao = new MeetingDAO();
	dao.insert(bag);
%>