<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file="../header.jsp" %>
		<div class="webcontainer">
		<h3> 글 목록 페이지 </h3>
		<button onclick="onWrite()"> 글쓰기 </button>
	
		</div>
	<%@include file="../footer.jsp" %>
	<script  src="/jspweb/js/board/list.js" type="text/javascript"></script>
</body>
</html>