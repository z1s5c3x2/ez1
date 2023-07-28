package 복습.part2;

import java.util.Scanner;

public class par2 {

	public static void main(String[] args) {
		//11분 
		String 재고관리 = "10,0,300\n3,0,200\n2,0,100\n";
		Scanner sc = new Scanner(System.in);
		int ch = 0;

		while(true)
		{
			//System.out.println(재고관리);
			//System.out.println(재고관리);
			System.out.println(" 1. 콜라[300] 2.사이다[200] 3.환타[100] 4.결제");
			System.out.print("선택: ");
			ch = sc.nextInt();
			//재고관리.split("\n")[ch-1].split(",")[0]
			boolean isBuy = false;

			if(ch != 4)
			{
				String sav = 재고관리.split("\n")[ch-1];
				int a = Integer.parseInt(sav.split(",")[0]);
				int b = Integer.parseInt(sav.split(",")[1])+1;
				if(a >= b)
				{
					int _cnt = Integer.parseInt(재고관리.split("\n")[ch-1].split(",")[1])+1;
					String _str = 재고관리.split("\n")[ch-1].split(",")[0]+","+_cnt+","+재고관리.split("\n")[ch-1].split(",")[2];
					재고관리 = 재고관리.replace(재고관리.split("\n")[ch-1],_str);
					String _pro = "";
					if(ch==1) { _pro = "콜라";}
					if(ch==2) { _pro = "사이다";}
					if(ch==3) { _pro = "환타";}
					System.out.printf("안내) %s 담았습니다.\n",_pro);
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
				int result = 0;
				String _pr = "";
				for(int i = 0;i<3;i++)
				{
					if( Integer.parseInt(재고관리.split("\n")[i].split(",")[1]) >0)
					{
						if(i==0) { _pr += "콜라\t";}
						if(i==1) { _pr += "사이다\t";}
						if(i==2) { _pr += "환타\t";}
						_pr += 재고관리.split("\n")[i].split(",")[1]+"\t"+재고관리.split("\n")[i].split(",")[2]+"\n";
					}					
					result += Integer.parseInt(재고관리.split("\n")[i].split(",")[1]) * Integer.parseInt(재고관리.split("\n")[i].split(",")[2]);
				}
				System.out.println("제품명\t수량\t가격");
				System.out.println(_pr);
				System.out.println("총 가격: "+ result);
				System.out.println("1. 결제 2.취소");

				if(sc.nextInt() == 1)
				{

					System.out.println("안내) 금액 투여");
					int Money = sc.nextInt();
					if(Money >= result)
					{
						for(int i=0;i<3;i++)
						{
							int sav = Integer.parseInt(재고관리.split("\n")[i].split(",")[0]) - Integer.parseInt(재고관리.split("\n")[i].split(",")[1]);
							String _str = sav+",0,"+재고관리.split("\n")[i].split(",")[2];
							재고관리 = 재고관리.replace(재고관리.split("\n")[i], _str);
							isBuy = true;
						}
				
						System.out.println("잔액: "+ (Money-result));
					}else{System.out.println("안내) 잔액 부족");}
				}
				else{System.out.println("안내) 결제 취소");}
				if(!isBuy)
				{
					for(int i=0;i<3;i++)
					{
						String _str = 재고관리.split("\n")[i].split(",")[0]+",0,"+재고관리.split("\n")[i].split(",")[2];
						재고관리 = 재고관리.replace(재고관리.split("\n")[i], _str);
						
					}
				}
			}
		}
	}
}