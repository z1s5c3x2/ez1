package 과제.과제4.Level3.ex3;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level3_3 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level3_3 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		
		int july1 = 3532100; 
		int july2 = 9123700;
		int july3 = 5183400;
		int july4 = 11738700;
		
		/* 문제풀이 위치 */
		String _str = "";
		for(int i=0;i<july1/1000000;i++)
		{
			_str +="■";
		}
		System.out.printf("1주차 : %s%d만원\n",_str,july1/10000);
		_str = "";

		for(int i=0;i<july2/1000000;i++)
		{
			_str +="■";
		}
		System.out.printf("2주차 : %s%d만원\n",_str,july2/10000);
		_str = "";

		for(int i=0;i<july3/1000000;i++)
		{
			_str +="■";
		}
		System.out.printf("3주차 : %s%d만원\n",_str,july3/10000);
		_str = "";

		for(int i=0;i<july4/1000000;i++)
		{
			_str +="■";
		}
		System.out.printf("4주차 : %s%d만원\n",_str,july4/10000);
		_str = "";
		/* ----------- */
	}
}
/* 
	[문제] 
		다음과 같이 july1,july2,july3,july4 변수는 7월의 1주차,2주차,3주차,4주차 의 매출액이 저장된 변수 입니다.
		1. 주차별로 100만원당 도형 '■' 출력하시오.
		2. 도형 뒤로는 그림과 같이 만원대 까지만 출력하시오.
	[조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.

*/
