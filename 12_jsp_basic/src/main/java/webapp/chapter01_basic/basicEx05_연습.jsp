<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>연습문제</title>
</head>
<body>

	<table border="1">
		<%
			for (int i = 1; i <= 10; i++) {
		%>
				<tr></tr>
				<td><%=i + "번" %></td>
		<%
			}
		%>
	</table>
	
</body>
</html>