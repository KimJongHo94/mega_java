<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>연습문제</title>
</head>
<body>

	<%
		Random ran = new Random();
	
		int rNum = ran.nextInt(3);
		out.println("rNum : " + rNum);
	%>
	<hr>
	<br>
	<%
		if (rNum == 0) {
	%>
	
			<select>
				<option>HTML5</option>
				<option>CSS3</option>
				<option>JAVASCRIPT</option>
			</select>
	<%
		}
		else if (rNum == 1) {
	%>
			<input type="checkbox" name="subject">HTML5
			<input type="checkbox" name="subject">CSS3
			<input type="checkbox" name="subject">JAVASCRIPT
	<%
		}
		else if (rNum == 2) {
	%>
			<input type="radio" name="subject">HTML5
			<input type="radio" name="subject">CSS3
			<input type="radio" name="subject">JAVASCRIPT
	<%		
		}
	%>
	
</body>
</html>