/*
   함수 [ 함 : 상자 / 수 : 숫자 ]
         - 상자 안에 들어있는 수/코드
         - 누군가가 미리 상자에 넣어둔 수/코드
         - 미리 정의[만들어진]된 수/코드 
            - 요리 { 레시피 }
               - 라면 스프 { 소금, 고춧가루, 간장분말 }
               - 양념장 { } 
      1. function = 함수 / 행동 이벤트 내용물 
      2. 하나의 특별한 목적의 작업을 수행하기 위한 독립적인 *코드의 집합*
      3. 사용 목적
         1. 재활용성 / 재사용 : 한번 정의[만들기] 하면 반복적으로 사용 가능
         2. 인수[매개변수]/반환[리턴] : 인수에 따른 서로 다른 반환값 얻을 수 있다.
            - 인수[매개변수] : 함수 안으로 들어가는 수/코드 [*생략가능]
            - 반환[리턴] : 함수 밖으로 나오는 수/코드 [*생략가능]
               ex)
                  더하기함수{x+y}    [1. 함수 정의]
                  더하기함수(3, 5)   [2. 함수에 인수전달]
                  함수반환 = 8      [3. 함수 실행결과]
               
               
                  인수/매개변수/INPUT
               ----   -------------------
               |                         |
               |                         |
               |   function              |
               |                         |
               ------------------    ----
                           반환/리턴/OUTPUT
               ->
                  자판기
                     인수 : 돈, 음료수번호
                      정의{ 입력받은 돈이하의 음료수 번호에 따른 데이터 검사}
                     반환 : 선택된 음료수 [*돈과 선택에 따른 서로다른 음료수]
               ->
                  사람_내장(위)
                     인수 : 음식
                     
                     반환 : ~~~~
                     
         3. 메모리 효율성 높일 수 있다.
            - 함수 { } 안에서 '{' 시작 되고 '}' 끝나면 메모리/코드 다 사라짐
            - 지역변수 : {} 안에서 선언된 메모리는 { } 밖으로 못 나감
            - 전역변수 : {} 없는 곳에서 선언된 메모리는 모든 곳에서 호출 가능 
               * 메모리 : 변수/상수/배열/객체 등등
               * 메모리 증가 -> 속도 감소 -> 개발비(돈) 증가

      4. 함수 선언
      
         function 함수명(인수1, 인수2, 인수3) {
            
            **** 코드 정의 ****
            return 반환값;
         }
         
         1. function : 함수 선언 키워드 
         2. 함수명    : 서로 다른 함수간의 식별 용의자 [ * js 내 동일한 이름 불가 / 키워드[let, const] 불가]
         3. ()       : 인수 [ 함수 안으로 들어가는 코드/변수/배열/객체 등 ]
                  ,로 구분
         4. { }       : '{' 함수 시작 / '}' 함수 끝
         5. return    : 함수 종료 / 리턴      [ *해당 함수를 호출했던 곳으로 반환/리턴]
                  return 3;    함수를 호출했던 곳으로 '3' 반환
                  return;      반환 값이 없으므로 반환값없이 함수종료
                  
         ex) 1. 유재석이 핸드폰이 고장나서 서비스센터 간다.
         
                           
               유재석          삼성 서비스센터 ( 함수 )
                  ------고장난핸드폰----->
                     ( 인수/매개변수 )      함수 실행( 핸드폰 수리 행동 )
                     
                  <-----수리된핸드폰-----
                     ( 반환/리턴 )
                     
            2. 유재석이 핸드폰을 폐휴대폰 수거함에 넣는다.
               유재석          삼성 서비스센터 ( 함수 )
                  ------고장난핸드폰----->
                     ( 인수/매개변수 )      함수 실행( 핸드폰 수거함에 등록 )
                     
                  <-------------------
                     ( 반환/리턴 없다 )
      5. 함수 호출/사용

*/
// 1. 함수 정의
function 함수1(){}      // 1. 인수x 반환x 
function 함수2(x){}      // 2. 인수(x = 임의의 인수/매개변수명) / 반환 없다
function 함수3(x,y,z){}    // 3. 인수 다수(, 구분) / 반환 없다
function 함수4(x, y, z){ return 3;} // 4. 인수있다 / 반환 있다
function 함수5(){return 5;} // 5. 인수 없다 / 반환 값 있다
function 함수6(){return;} // 6. 인수 없다 / 반환 값 = 단순 함수종료 역활 
   // * 함수가 종료되는 조건 : 1. '}' 끝났을때 2. return 키워드를 만났을때 [ 아래 코드 있어도 종료 ]
   
// 2. 함수 호출
console.log('안녕')         // 1. 미리 정의된(JS 만든 사람) log(인수 = 출력하고싶은 문자열) 함수
배열명.splice(0, 1)         // 2. 미리 정의된(JS 만든 사람) splic(인수1, 인수2)
document.querySelector('')    // 3. 미리 정의된(JS 만든 사람) querySelector(인수1 = ????)
                     // ----> 다른 사람이 만든(API, 프레임워크, 라이브러리 ) 코드는 설계를 모르기 때문에 암기x
함수1();                  // 4. JS에서 내가 만든 함수 호출
함수2(3);                  // 5. 함수호출과 동시에 해당 함수에 3 전달 [ X = 3 ]
함수3(3, 5, 20)            // 6. 함수호출과 동시에 해당 함수에게 데이터 3개 전달 [ X = 3, Y = 5, Z = 20 ]
let 함수결과1 = 함수명4(3, 5, 20)   // 7. 함수 종료 후 리턴/반환 값
let 함수결과2 = 함수명5()         // 8. 함수 종료 후 리턴/반환 값을 변수에 저장
let 함수결과3 = 함수명6();         // 9. 함수 종료 후 리턴/반환 값이 없으므로 별도로 저장 안함
 
// 3. 함수 호출2
// 1. HTML 이벤트 함수 호출
//   <input type="button" onclick="함수6()">
//   <button type="button" onclick="함수6()">
// 2. 함수내에서 다른 함수 호출
function 함수7() { console.log('함수안에서 함수호출');}
function 함수8() {함수7();}

// 4. 함수 연산
let 연산결과 = 함수4() + 10;      // 함수4의 반환값이 3이므로 [3+10]





    











