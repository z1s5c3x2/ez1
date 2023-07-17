package 과제.과제22.Level1.ex3;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level1_3 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_3 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		/* 문제풀이 위치 */
		System.out.print("\nintput int");
		int a = scanner.nextInt();
		System.out.print("\nintput float");
		float b = scanner.nextFloat();
		System.out.print("\nintput char");
		char c = scanner.next().charAt(0);
		System.out.print("\nintput long");
		long d=scanner.nextLong();
		System.out.print("\nintput byte");
		byte e=scanner.nextByte();
		System.out.print("\nintput short");
		short f = scanner.nextShort();
		System.out.print("\nintput double");
		double g =scanner.nextDouble();
		System.out.print("\nintput boolean");
		boolean h = scanner.nextBoolean();
		
		
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
	[문제] 그림과 같이 기본자료형을 이용하여 변수 8개를 출력하시오.
	[조건] 
		1. 모든 기본자료형 8개 사용
		2. print() 메소드 사용
		3. scanner 객체 사용하여 입력받기
*/
