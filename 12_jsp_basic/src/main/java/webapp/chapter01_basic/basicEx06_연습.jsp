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
				<tr>
		<%
				
				if (i % 2 == 1) {
		%>
					
					<td style="background-color: tomato"><%=i + "번" %></td>
					
		<%
				}
				if (i % 2 == 0) {
		%>
					
					<td style="background-color: skyblue"><%=i + "번" %></td>
					
		<%
				}
		%>
				
		<%
			}
		%>
			</tr>
	</table>
	
</body>
</html>