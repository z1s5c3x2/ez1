package java1.day4;

import java.util.Scanner;

public class EX2_확인문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int saveMoney = 0;
		Scanner sc= new Scanner(System.in);
		while(true)
		{
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료"); 
			System.out.println("----------------------------");
			System.out.println("선택>");
			int num = sc.nextInt();
			if(num==1)
			{
				System.out.println("예금액 >");
				saveMoney += sc.nextInt();
			}
			else if(num ==2)
			{
				System.out.println("출금액");
				saveMoney -= sc.nextInt();
			}
			else if(num ==3)
			{
				System.out.println("잔고>"+saveMoney);
			}
			else
			{
				break;
			}
		}
	}

}
