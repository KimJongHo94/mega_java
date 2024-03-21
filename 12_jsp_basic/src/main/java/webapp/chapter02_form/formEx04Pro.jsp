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
  
  		String dbId = request.getParameter("dbId");
  		String dbPw = request.getParameter("dbPw");
  		
  		String id = request.getParameter("id");
  		String pw = request.getParameter("pw");
  		
  		String str = "";
  		
  		if (id != null && pw != null) {
  			if (dbId.equals(id) && dbPw.equals(pw)) {
  	  			str = dbId + "님 로그인 성공";
  	  		}
  	  		else {
  	  			str = "아이디 혹은 비밀번호를 다시 확인해주세요.";
  	  		}
  		}
  		else {
  			str = "아이디와 비밀번호는 필수입력 항목입니다";
  		}
  		
  		
  
  %>
  
  <p><%=str %></p>
  <p><a href="formEx04_문제.jsp">뒤로가기</a></p>
	
</body>
</html>