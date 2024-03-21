<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>연습문제</title>
</head>

	<%
		request.setCharacterEncoding("utf-8");
	
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		String result = Integer.toString(num1 * num2);
				
		String answer = request.getParameter("answer");
		String str = "";
		
		if (result != null) {
			if (result.equals(answer)) {
				str = "정답";
			}
			else {
				str = "땡";
			}
		}
		
	%>
	<h2>결과 : <%=str %></h2>
</body>
</html>