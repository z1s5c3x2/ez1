package java1.day7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class EX1_파일처리 {
   public static void main(String[] args) throws FileNotFoundException {
      
      // 스택영역 : 함수는 호출시 메모리할당, 종료시 메모리초기화
      
      // 파일처리 라이브러리( 미리 만들어진 클래스/메소드 )
         // * 스트림 : 자바 외부와 통신할 때 사용 통로 [ 바이트단위 ]
            // 통신 중 오류 발생할 수 있기에 '예외처리/오류처리'를 필수적으로 사용
         // 1. FileOutputStream : 파일 내보내기/저장 관련된 메소드를 제공하는 클래스
            // new FileOutputStream("파일경로");   : 해당 파일과 연동/연결
            // 파일경로
               // 상대경로 : 프로젝트명 생략 -> ./src/패키지명/파일명
               // 절대경로 : C:\Users\504\git\ezen_web_2023\backend\src\java1\day07\Ex1_테스트.java
         // 2. 제공하는 함수
            // 1   .write(바이트배열)
                  //* 영문:1바이트 / 한글:2바이트
                  //여러 글자를 입력해야할 시 바이트 배열을 이용
            
      
      
      
      // 1. 파일처리 [저장]
      FileOutputStream fileOutputStream = new FileOutputStream("./src/java1/day07/Ex1_테스트.txt");
      
      
   }
}