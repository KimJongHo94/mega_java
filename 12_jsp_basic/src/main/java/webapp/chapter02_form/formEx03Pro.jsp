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
	
		String me = request.getParameter("me");
		//int com = Integer.parseInt(request.getParameter("com"));
		
		String str = "";
		
		// 바위 : 0, 가위 : 1, 보 : 2
		if (me.equals("가위"))      str = "플레이어가 졌습니다.";
		else if (me.equals("보")) str = "플레이어가 이겼습니다.";
		else if (me.equals("바위")) str = "비겼습니다.";
		else              str = "잘못된 값입니다.";
		
	%>
	
	<p><%=str %></p>
	<p><a href="formEx03_연습.jsp">뒤로가기</a></p>
	
</body>
</html>