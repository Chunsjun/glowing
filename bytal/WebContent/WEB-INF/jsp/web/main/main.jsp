<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% String check = (String) session.getAttribute("memberName"); %>
<html>
<head>
<c:out value="${error}" escapeXml="false"/>
<title>:::Bytal Web:::</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
<script src="/bootstrap/js/jquery.min.js"></script>
<script src="/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<table width="100%" height="100%">
	<tr>
		<td>
			<%@include file="top.jsp"%>
		</td>	
	</tr>
	<tr>
		<td align="center">
			<div style="text-align: center">
			<img src="/image/선문대 전경.png" align="middle" width="80%" height="70%">
		</div>
		</td>
	</tr>
</table>
<hr>개발문의사항 : <a href="https://open.kakao.com/o/gpVISyo">오픈카톡</a><p>
</div>
</body>
</html>