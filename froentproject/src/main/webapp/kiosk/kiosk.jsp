<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <title>Insert title here</title>
   <link href="/frontendProject/css/kiosk.css" rel="stylesheet">
   
</head>
<body>
   <%@include file="../header.jsp" %>
   
   <div class="kioskwrap"><!-- 전체 레이아웃 -->
      
      <div>   <!-- 헤더 : 광고이미지/카테고리출력 표시되는 구역 -->
         <img class="himg" src="../img/버거킹1.png">
         
         <!-- 카테고리 -->
         
         <ul class="categorymenu">
            <!-- categoryPrint() 함수가 출력하는 구역 -->
         </ul>
         
      
      </div>   <!-- 헤더 end -->
      
      
      <div class="kioskcontent"> <!-- 본문 : 제품출력/카트출력 구역 -->
         <div class="productbox"><!-- 제품구역 -->
            
            
            <div class="product"><!-- 제품 1개 기준 -->
            
               <img class="himg" src="../img/헬로디아블로와퍼.png">
               <div class="pinfo">
                  <div class="pname">헬로 디아블로 와퍼 </div>
                  <div class="pprice">15,000원</div>
               </div>
            </div>
            
            
         </div><!-- 제품구역 end -->
         
         
         <div class="cartbox"><!-- 카트구역 -->
            <div class="cartcontent"><!-- 제품개수/가격, 제품정보 출력 -->
               
               <div class="carttop"><!-- 제품개수/가격 출력구역 -->
                  <div> 카트 <span class="ccount">3</span> </div>
                  <div> 총 주문금액 <span class="ctotal"> 31,000</span> </div>
               </div>
               
               <div class="cartbottom"><!-- 제품정보 출력구역 -->
                  
                  <div class="citem"><!-- 카트 내 제품 1개 -->
                     <div class="iname">더블비프불고기버거</div><!-- 제품명 -->
                     <div class="iprice">12,000원</div><!-- 제품가격 -->
                     <div class="icancel">X</div><!-- 제품 개별 취소 -->
                  </div>
                  
               </div>
               
            </div><!-- 제품개수/가격, 제품정보 출력 end -->
            
            
            <div class="cartbtn"><!-- 버튼 구역 -->
               <button class="cancelbtn">취소하기</button>
               <button class="orderbtn">주문하기</button>
            </div><!-- 버튼 구역 end -->
            
            
         </div><!-- 카트구역 end -->
         
      </div><!-- 본문 : 제품출력/카트출력 구역 end -->   
      
      
      
      
      
      
   </div><!-- 전체 레이아웃 end -->
   
   <%@include file="../footer.jsp" %>
   
   <script src="/frontendProject/js/kiosk.js"></script>
</body>
</html>