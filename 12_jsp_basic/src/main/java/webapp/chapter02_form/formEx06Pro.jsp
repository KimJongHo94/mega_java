<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>연습문제</title>
</head>
<body>

	<%
			request.setCharacterEncoding("utf-8");
	
			String str = "";
			double height = Double.parseDouble(request.getParameter("height"));
			String withParents = request.getParameter("withParents");
			
			if (height >= 120.0) {
				str = "놀이기구를 이용하실 수 있습니다";
			}
			else if (height < 120.0) {
				
				if (withParents.equals("yes")) {
					str = "놀이기구를 이용하실 수 있습니다";
				}
				else {
					str = "놀이기구를 이용하실 수 없습니다.";
				}
				
			}
	%>
	<h2>키 : <%=height %></h2>
	<h2>부모님 동반 : <%=withParents %></h2>
	<h2>결과 : <%=str %></h2>
</body>
</html>