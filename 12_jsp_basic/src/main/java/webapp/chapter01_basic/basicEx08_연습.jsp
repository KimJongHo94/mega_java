<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>연습문제</title>
</head>
<body>

	<select>
		<%
			for (int i = 2021; i >= 1900; i--) {
		%>
				<option value=<%=i %>><%=i %></option>
		<%
			}
		%>
	</select>
	
</body>
</html>