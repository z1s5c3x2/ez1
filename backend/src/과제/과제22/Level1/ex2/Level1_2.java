package 과제.과제22.Level1.ex2;

import java.time.LocalDateTime;

public class Level1_2 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_2 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		System.out.printf("%-10s   %15s   %30s\n" , "type" , "value" , "range" );
		System.out.println("-------------------------------------------------------------");
		
		/* 문제풀이 위치 */
		int a = 1000000000;
		float b = 20.0f;
		char c ='c';
		long d=50000000000l;
		byte e=100;
		short f = 20000;
		double g =0.3541354654161;
		boolean h = true;
		
		System.out.printf("%-10s   %15b   %30s\n","boolean", h, "0~1");
		System.out.printf("%-10s   %15d   %30s\n","byte", e, "-128~127");
		System.out.printf("%-10s   %15c   %30s\n","char", c, "0~65535 [char1]");
		System.out.printf("%-10s   %15d   %30s\n","short", f, "-32768~32767");
		System.out.printf("%-10s   %15d   %30s\n","int", a, "-+2000 million");
		System.out.printf("%-10s   %15d   %30s\n","long", d, "-+2000 million excess");
		System.out.printf("%-10s   %15f   %30s\n","float", b, "8 decimal places");
		System.out.printf("%-10s   %15f   %30s\n","double", g, "17 decimal");

		/* ----------- */
	}
}
/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 8개 선언하고 임의값을 대입하여 출력하시오.
	[조건] 
		1. 모든 기본자료형 8개 사용
		2. printf() 메소드 사용
*/
