package 과제.과제5;

import java.util.Scanner;

public class 과제5_키오스크 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String 재고관리 = "";
		/* 재고관리 변수 샘플  */
		재고관리 = "콜라:300,3,0 환타:200,10,0 사이다:100,10,0";
		/* ----------- */
		
		while(true) {
			System.out.println("\n\n-------------------- 메뉴 ------------------- ");
			System.out.println("1.콜라[300] 2.환타[200] 3.사이다[100] 4.결제");
			System.out.print(">>>>>> 선택 : "); int ch = scanner.nextInt();
			//for(int i =0;i<3;i++)
			//{
		//		System.out.println(재고관리.split(" ")[i]);
		//	}
			
			/* 문제풀이 위치 */
			if(ch != 4)
			{
				
				if(1>Integer.parseInt(재고관리.split(" ")[ch-1].split(":")[1].split(",")[1]))
				{
					System.out.println("재고 부족");
				}
				else
				{
					int savcnt = Integer.parseInt(재고관리.split(" ")[ch-1].split(":")[1].split(",")[1]) -1;
					int buysav = (Integer.parseInt(재고관리.split(" ")[ch-1].split(":")[1].split(",")[2]))+1;
					String target = 재고관리.split(" ")[ch-1].split(":")[0]+":"+(400-(ch*100)+","+(savcnt+1)+","+(buysav-1));
					String chg = 재고관리.split(" ")[ch-1].split(":")[0]+":"+(400-(ch*100)+","+savcnt+","+buysav);
					재고관리 = 재고관리.replace(target, chg);
					
				}

			}
			else //결제
			{
				System.out.println("- 현재 장바구니 현황 표시 목록 ");
				System.out.println("----------------------------------");
				System.out.println("제품명	수량	가격");
				int result = 0;
				for(int i=0;i<3;i++)
					{
						if(Integer.valueOf(재고관리.split(" ")[i].split(":")[1].split(",")[2]) > 0)
						{
							System.out.println(재고관리.split(" ")[i].split(":")[0]+"\t"+재고관리.split(" ")[i].split(":")[1].split(",")[2] +"\t"+ 재고관리.split(" ")[i].split(":")[1].split(",")[0]);
							int _a = Integer.valueOf(재고관리.split(" ")[i].split(":")[1].split(",")[0]);
							int _b = Integer.valueOf(재고관리.split(" ")[i].split(":")[1].split(",")[2]);
							result += _a * _b;
						}
					}
				System.out.println("총 금액 : " + result);
				System.out.println("1 결제 2취소");
				int _num = scanner.nextInt();
				if(_num == 1) 
				{
					System.out.println("금액 입력");
					if(scanner.nextInt() > result) //성공 
					{
						for(int i=0;i<3;i++)
						{
							String _tmp = 재고관리.split(" ")[i];
							int _len = _tmp.length();
							재고관리 = 재고관리.replace(_tmp, _tmp.substring(0, _len-2)+",0");
							
							
						}
					}
					else
					{
						for(int i=0;i<3;i++)
						{
							if(Integer.valueOf(재고관리.split(" ")[i].split(":")[1].split(",")[2]) > 0)
							{
							//System.out.println(재고관리.split(" ")[i].split(":")[0]+"\t"+재고관리.split(" ")[i].split(":")[1].split(",")[2] +"\t"+ 재고관리.split(" ")[i].split(":")[1].split(",")[0]);
							int _a = Integer.valueOf(재고관리.split(" ")[i].split(":")[1].split(",")[1]);
							int _b = Integer.valueOf(재고관리.split(" ")[i].split(":")[1].split(",")[2]);
							_a += _b;
							_b = 0;
							String _tmp = 재고관리.split(" ")[i];
							int _len = _tmp.length();
							재고관리 = 재고관리.replace(_tmp, 재고관리.substring(0, _len-3)+_a+","+_b);
							////결제 재고관리 = "콜라:300,10,0 환타:200,10,0 사이다:100,10,0";
							}
						}
					}
					
				}
				else // 취소
				{
					for(int i=0;i<3;i++)
						{
							if(Integer.valueOf(재고관리.split(" ")[i].split(":")[1].split(",")[2]) > 0)
							{
							//System.out.println(재고관리.split(" ")[i].split(":")[0]+"\t"+재고관리.split(" ")[i].split(":")[1].split(",")[2] +"\t"+ 재고관리.split(" ")[i].split(":")[1].split(",")[0]);
							int _a = Integer.valueOf(재고관리.split(" ")[i].split(":")[1].split(",")[1]);
							int _b = Integer.valueOf(재고관리.split(" ")[i].split(":")[1].split(",")[2]);
							_a += _b;
							_b = 0;
							String _tmp = 재고관리.split(" ")[i];
							int _len = _tmp.length();
							재고관리 = 재고관리.replace(_tmp, 재고관리.substring(0, _len-3)+_a+","+_b);
							////결제 재고관리 = "콜라:300,10,0 환타:200,10,0 사이다:100,10,0";
							}
						}
				}
			}
			
			/* ----------- */
			
		} // while end 
	} // main end 
	
} // class end 

/*

	 주제 : 키오스크(변수버전)
	 	- 실행예시 사진은 없습니다.
		조건 
		1. 제품 가격/재고/바구니 상태를 하나의 문자열 변수에서 관리 
			// 샘플 : 
					이름 : 콜라 , 환타 , 사이다
					가격 : 300 , 200 , 100
					바구니 : 0 , 0 , 0
			
		2. 키오스크 메뉴 [ 무한루프 : 종료 없음(24시간) ] 
			1. 콜라 2.사이다 3.환타 4.결제
			[ 1~3 선택시 ]
				- 재고가 있을경우 장바구니 담기 / 없으면 '재고부족' 출력
				 
			[ 4 선택시 ] 
				- 현재 장바구니 현황 표시 목록 
				----------------------------------
				제품명	수량	가격
				사이다	1	400
				환타		2	1000
				총가격 : 1400
				- 결제메뉴 표시
					1. 결제 2.취소 
					[결제]
						- 금액 입력받아 총가격에 뺀 잔액 출력 -> 결제 성공시 장바구니 초기화 
						- 만약에 금액이 부족하면 결제 취소 -> 장바구니 초기화 / 재고 다시 되돌리기
					[취소]
						- [ 장바구니 초기화 / 재고 다시 되돌리기 ]
 
 */







