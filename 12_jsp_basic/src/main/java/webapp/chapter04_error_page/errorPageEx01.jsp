<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테스트 페이지</title>
</head>
<body>

	<!-- 
	
		# 에러 페이지
		
		- 에러메세지를 화면에 그대로 노출시키면 
		  웹 서버 관련 정보 및 데이터베이스의 이름 , 테이블명 , 쿼리문 등 중요한 코드들이 브라우저 화면에 노출된다.
		  [보안 취약점 , 해당 취약점은 서비스 오픈 불가]
		
		- 보안적인 문제 외에도 에러페이지 화면을 그대로 노출하면 웹서비스를 이용하는 사용자에게 거부감을 준다.
		
		- 그러므로 에러 페이지를 별도로 관리해야 한다. 
		
			[ 방법 ]
		
			1) web.xml에 아래의 코드를 추가한다.
		
			<error-page>
				<error-code>에러코드</error-code>
				<location>jsp파일 경로</location>       
			</error-page>
			<error-page>
				<error-code>에러코드</error-code>
				<location>jsp파일 경로</location>	
			</error-page>
			
				* location태그에서는 webapp(/)를 기준으로 에러페이지의 절대경로를 작성한다.
			
			
			2) location에 적혀있는 실제 위치에 에러가 날 경우 화면에 보여줄 페이지를 생성한다.
	
	 -->
	
	<%
	  // 500 에러(시스템 에러)
		/* System.out.println("절대 안보임");
		conn = DriverManager.getConnection(url, user, password); */
	%>
	
	<!-- 404 에러 (페이지를 찾을 수 없음) -->
	<a href="abcdfef.jsp">페이지 이동</a><br>
	
	<form action="abxfsdf.jsp">
		<input type="submit" value="전송">
	</form>
	
</body>
</html>