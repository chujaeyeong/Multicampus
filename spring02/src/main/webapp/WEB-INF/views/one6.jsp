<%@page import="com.multi.mvc02.BbsVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table border=1 width="300">
	<tr>
		<td class="top">no</td>
		<td class="top">title</td>
		<td class="top">content</td>
		<td class="top">writer</td>
	</tr>
	<tr>
		<td class="down">${bag.no}</td>
		<td class="down">${bag.title}</td>
		<td class="down">${bag.content}</td>
		<td class="down">${bag.writer}</td>
	</tr>
</table>