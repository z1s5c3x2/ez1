package 과제.과제4.Level3.ex6;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class Level3_6 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level3_6 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		
		/* 문제풀이 위치 */
		int num = 0;
		int _ch;
		while(true)
		{
			System.out.println("1. 예약 2. 예약 취소 3. 예약 현황");		
			switch(scanner.nextInt())
			{
				case 1:
					System.out.println("예약 좌석 입력");
					_ch = scanner.nextInt();
					if(num%(Math.pow(10,(_ch))) >= Math.pow(10,(_ch-1))){System.out.println("예약된 자리 입니다");}
					else{
						System.out.println(_ch + "자리 예약 완료");
						num +=  Math.pow(10,(_ch-1));
					}
					break;
				case 2:
					System.out.println("예약 취소 좌석 입력");
					_ch = scanner.nextInt();
					if(num%(Math.pow(10,(_ch))) < Math.pow(10,(_ch-1))){System.out.println("빈자리 입니다");}
					else
					{
						System.out.println(_ch+"번자리 예약 취소");
						num -= Math.pow(10,(_ch-1));
					}
					break;
				default:
					int check = 10;
					for (int i = 0; i < 6; i++) {
						if (num % check >= (check / 10)) {
							System.out.print("[예약]");
						} else {
							System.out.print("[ ]");
						}
						check *= 10;
						if (i == 2) {
							System.out.println();
						}
					}
					System.out.println();

					break;
			}
			
		}

		/* ----------- */

	}
}
/* 
	주제 : 예약 좌석 시스템
	실행결과는 제공하지 않습니다.
	
	- 변수 조건 
		1. 변수 : 6개의 좌석 은 변수를 이용합니다. [ 배열X ]
		2. 그외 자유롭게 사용. 배열/리스트 사용 금지 [ day1~day4 문법 이용 ]
	- 메뉴 조건
		0. 메뉴 : 1.예약하기 2.예약취소 3.예약현황 
	- 기능 조건 
	 	예약하기 출력예시 )
	 		1. 예약할 좌석을 선택한다.
	 		2. 만약에 비어 있으면 예약성공 아니면 예약 실패 
	 	예약취소 출력예시 )
	 		1. 예약할 취소할 좌석을 선택한다.
	 	예약현황 출력예시 )
	 		* 3개씩 2줄로 출력합니다.
			[ 예약 ]	[ ]	[ ]
			[ ] [예약] [ ]  
			- 예약이 되어 있는 좌석은 [예약] 예약이 없으면 [ ] 공란으로 출력합니다.
			
*/
