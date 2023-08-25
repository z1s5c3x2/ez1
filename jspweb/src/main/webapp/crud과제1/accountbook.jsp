<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="accountbook.css" type="text/css" />
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="wrap">
	<div class="inputarea">
	항목내용: <input class="txt" type="text"> </br>
	금액: <input class="price" type="text"> </br>
	날짜: <input class="inputdate" placeholder="yyyy-mm-dd 형식으로 입력" type="date"> 
		<button onclick="bookinput()" type="button"> 입력 </button>
	</div>
	<div class="viewbox">
		
		
	</div>
	</div>
	   <!-- 최신 JQUERY 불러오기 : AJAX메소드 사용하기 위해 : JS가 외부로부터 통신하기 위해 -->
   <script src="http://code.jquery.com/jquery-latest.min.js"></script>
   <!-- JS파일 불러오기 -->
   <script src="accountbook.js" type="text/javascript"></script>
</body>
</html>