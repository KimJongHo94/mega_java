<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카트리스트</title>
</head>
<body>
	<div align="center">
		<h1>'${sessionScope.id }'님의 장바구니 (${sessionScope.role }권한)</h1>
		<h3>상품1 : ${cart1 }</h3>
		<h3>상품2 : ${cart2 }</h3>
		<h3>상품3 : ${cart3 }</h3>
	</div>
</body>
</html>