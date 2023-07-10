<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 부트스트랩에서 만든 CSS 적용 -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
	<!-- 섬머노트  -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.20/summernote-bs5.min.css" rel="stylesheet">

</head>
<body>
	<%@include file="../header.jsp"%>
	<div class="container">
		<input type="text" placeholder="제목" class="form-control m-3 title">
		<textarea id="summernote" rows="10" cols="" placeholder="내용" class="content form-control"></textarea>
		<input class="form-control" type="file" />
		<div class="row justify-content-md-center g-3">
			<div class="col-1">
				<input class="form-control" type="button" onclick="submitPost()" value="등록">
			</div>
			<div class="col-1">
				<input type="button" class="form-control" value="다시쓰기">
			</div>
			<div class="col-1">
				<input type="button" onclick="viewPost()" value="목록보기" class="form-control">
			</div>
		</div>
	</div>
	
	<%@include file="../footer.jsp"%>



	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
		crossorigin="anonymous"></script>
		
		<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
		<!-- 섬머노트js  -->
		<script src="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.20/summernote-bs5.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.20/lang/summernote-ko-KR.min.js"></script>
		<script type="text/javascript" src="../js/write.js"></script>

</body>
</html>