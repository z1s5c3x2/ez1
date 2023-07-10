<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<!-- css호출 -->
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 부트스트랩에서 만든 CSS 적용 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
   <link href="/frontendProject/css/index.css" rel="stylesheet">
</head>


   <h4>헤더입니다</h4>
   <!-- 메뉴 -->
   <ul class="head_menu">
      <li><a href="/frontendProject/index.jsp"> home </a> </li><!-- a태그를 통한 다른페이지 이동 -->
      <li><a href="/frontendProject/kiosk/kiosk.jsp"> 키오스크 </a> </li>
      <li><a href="/frontendProject/board/list.jsp"> 게시판 </a> </li>
      <li><a href="/frontendProject/calendar/calendar.jsp"> 캘린더 </a> </li>
   </ul>
   
   <!-- js호출 -->
   <script src="/frontendProject/js/index.js"></script>
   
   
   <!-- 
      HTTP 상태 404 - 찾을 수 없음
         - 페이지 못찾음 [ 1.경로문제 2. 오타 3.존재하지 않는 파일 ]
      
      절대경로
         - 로컬기준 : 기존에 사용하던 방식은 로컬기준의 절대경로
         - 서버기준 : 서버를 이용하여 생성된 서버기준의 절대경로
               [http://localhost:8080/frontendProject/index.jsp]
               중 [http://localhost:8080]를 생략할 수 있기에 편의상 생략한다
      상대경로
    -->
    
    