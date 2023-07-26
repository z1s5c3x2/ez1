package 복습.part2;

import java.util.Scanner;

public class par2 {

	public static void main(String[] args) {
		String 재고관리 = "10,0,300\n3,0,200\n2,0,100\n";
		Scanner sc = new Scanner(System.in);

		while(true)
		{
			System.out.println("1. 콜라[300] 2. 사이다[200] 3. 환타[100] 4. 결제");
			int ch = sc.nextInt();

			if(ch != 4)
			{
				String sav = 재고관리.split("\n")[ch-1];
				int a = Integer.parseInt(sav.split(",")[0]);
				int b = Integer.parseInt(sav.split(",")[1])+1;
				if(a >= b)
				{
					String _pr = "";
					if(ch==1){_pr = "콜라";}
					else if(ch==2){_pr = "사이다";}
					else{_pr = "콜라";}
					재고관리 = 재고관리.replace(sav,a+","+b+","+재고관리.split("\n")[ch-1].split(",")[2]);

				}else{
					String _pr = "";
					if(ch==1){_pr = "콜라";}
					else if(ch==2){_pr = "사이다";}
					else{_pr = "환타";}
					System.out.println(_pr+"재고가 부족합니다");
				}

			}
			else
			{
				System.out.println("제품명\t수량\t가격");
				int res = 0;
				for(int x=0;x<재고관리.split(",").length;x++)
				{
					int a = 재고관리.split("\n")[ch-1].split(",")[1];
					if (a > 0)
					{
						String _pr = "";
						if(ch==1){_pr = "콜라";}
						else if(ch==2){_pr = "사이다";}
						else{_pr = "환타";}

					}
				}
			}
			
		}

	}
}
