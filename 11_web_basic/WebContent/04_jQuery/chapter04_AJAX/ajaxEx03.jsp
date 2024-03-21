<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>receive 예시</title>
<script src="04_jQuery/js/jquery-3.6.1.min.js"></script>
<script>

	$().ready(function(){
		
		$("#ajaxExBtn").click(function(){
				$.ajax({
					
					url :"ajaxEx03",
					type:"post",
					// 통신이 성공했을 경우 실행되는 콜백 함수
					success:function(data, status, xhr){
						
						let checkCnt = $("#checkCnt").text();
						checkCnt++;
						$("#checkCnt").text(checkCnt);
						
						console.log("-통신 성공-");
						console.log(data);   /* 반환 데이터 */
						console.log(status); /* 상태 */
						console.log(xhr);    /* 메타 데이터 */
						console.log("");    
					},  /* try */
					// 통신이 실패공했을 경우 실행되는 콜백 함수
					error:function(xhr, status, errorThrown){
						console.log("-통신 실패-");
						console.log(xhr);         /* 메타 데이터 */
						console.log(status);      /* 상태 */
						console.log(errorThrown); /* 에러 던짐 */
						console.log("");
					},    /* catch */
					// 성공 실패여부와 상관없이 반드시 실행되는 콜백 함수
					complete:function(xhr, status){
						console.log("-반드시 실행-");
						console.log(xhr);         /* 메타 데이터 */
						console.log(status);      /* 상태 */
						console.log("");
					}  /* finally */
				});
		});
		
	});
</script>
</head>
<body>

	<p><img src="04_jQuery/images/pic_9.jpg" width="200" height="200"> </p>
	<h3>데이터 수신 횟수 : <span id="checkCnt">1</span></h3>
	<p>
		<span id="recvData"></span> <input type="button" id="ajaxExBtn" value="recvData">
	</p>
	
</body>
</html>