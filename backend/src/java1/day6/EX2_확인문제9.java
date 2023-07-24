package java1.day6;

import java.util.Scanner;

public class EX2_확인문제9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1.메뉴 프린트
		 * 2.학생 배열 만들기
		 * 3.점수 배열 만들기
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int num;
		int[] scoreArr = new int[0] ;
		while(true)
		{
			System.out.println("-------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트 | 4.분석 | 5. 종료");
			System.out.println("-------------------------------------------------------");
			
			System.out.println("선택> ");
			num = sc.nextInt();
			
			if(num == 1)
			{
				System.out.println("학생수> ");
				scoreArr =  new int[sc.nextInt()];
			}
			else if(num == 2)
			{
				for(int i = 0;i<scoreArr.length;i++)
				{
					System.out.printf("scores[%d]>",i);
					scoreArr[i] = sc.nextInt();
				}
			}
			else if(num == 3)
			{
				for(int i =0;i<scoreArr.length;i++)
				{
					System.out.printf("scores[%d]> %d\n",i,scoreArr[i]);
				}
			}
			else if(num == 4)
			{
				int max = 0;
				int sum = 0;
				for(int i =0;i<scoreArr.length;i++)
				{
					if(max < scoreArr[i])
					{
						max = scoreArr[i];
					}
					sum += scoreArr[i];
					
				}
				System.out.printf("최고 점수 : %d\n평군 점수: %.1f\n",max,(sum/3.0f));
			}
			else
			{
				System.out.println("종료");
				break;
			}

		}

	}
}
