<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
   <link href="../hrm/hrm.css" rel="stylesheet">
</head>
<body>

	 <%@include file = "../header.jsp" %>
	 <form class="signupForm">
	 <input onchange="preimg( this )" name="himg" class="mimg" type="file" accept="image/*"><br/>
	 
	 <input type="text" name="hname" placeholder="직원명" maxlength="10">
	 <input type="text" name="hphone" placeholder="폰번" maxlength="30">
	 <select name="hrank">
    	<option value="사장">사장</option>
    	<option value="부장">부장</option>
    	<option value="팀장">팀장</option>
    	<option value="대리">대리</option>
    	<option value="주임">주임</option>
    	<option value="사원">사원</option>
		</select>

	</form>
	<button onclick="signup()"> 가입 </button>
	<button onclick="loadlist()"> 불러오기 </button>
	<img class ="asd" src="">
	<div class="viewbox">
		
	</div>
			<script src="../hrm/hrm.js" type="text/javascript"></script>
</body>
</html>