<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 전송 기초1</title>
<script>

	

</script>
</head>
<body>

	<form action="formEx01Pro_연습.jsp" method="post">
		<fieldset>
			<legend>개인정보 입려</legend>
			<!-- form태그 안에 있는 name값이 서버로 전송된다. -->
			<p>이름 : <input type="text" name="name"></p>
			<p>연락처 : <input type="text" name="contact"></p>
			<p>나이 : <input type="text" name="age"></p>
			
			<input type="submit" value="업로드">
		</fieldset>
	</form>

</body>
</html>