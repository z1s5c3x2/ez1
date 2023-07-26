package 복습.part3;

import java.util.Scanner;

public class par3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] 재고관리 = { "10,0,300,콜라" , "3,0,200,환타" , "2,0,100,사이다"};
		/*    - 제품은 콜라 -> 환타 -> 사이다 순으로 작성되어 있으며 각 제품별 필드는 재고 -> 바구니 -> 가격->제품명 순 으로 작성한 문자열 입니다.

3. 키오스크 메뉴 [ 무한루프 : 종료 없음(24시간) ]
    1. 콜라 2.사이다 3.환타 4.결제
            [ 1~3 선택시 ]
                - 재고가 있을경우 바구니 담기 / 없으면 '재고부족' 출력

            [ 4 선택시 ]
                - 현재 바구니 현황 표시 목록[ * 바구니가 0보다 컸을경우에만 출력합니다 ]
                    ----------------------------------
                        제품명 수량 가격
                        사이다 1 400
                        환타 2 1000
                        총가격 : 1400 */		

		while(true)
		{
			System.out.println("1. 콜라[300] 2.환타[200] 3. 사이다[100] 4. 결제");
			System.out.println("선택>>");
			int num = sc.nextInt();	
			if(num !=4)
			{

				int sav = Integer.parseInt(재고관리[num-1].split(",")[1])+1;
				if(sav > Integer.parseInt(재고관리[num-1].split(",")[0]))
				{
					System.out.printf("안내) %s의 재고가 부족합니다\n",재고관리[num-1].split(",")[3]);
				}
				else
				{
					System.out.printf("안내) %s 담았습니다\n",재고관리[num-1].split(",")[3]);
					재고관리[num-1] = 재고관리[num-1].replace(재고관리[num-1],재고관리[num-1].split(",")[0]+","+sav+","+
					재고관리[num-1].split(",")[2]+","+
					재고관리[num-1].split(",")[3]);
				}
			}
			else
			{
				System.out.println("제품명\t수량\t가격\t");
				int res = 0;
				for(int i=0;i<재고관리.length;i++)
				{
					if(Integer.parseInt(재고관리[i].split(",")[1]) > 0)
					{
						int a = Integer.parseInt(재고관리[i].split(",")[1]);
						int b = Integer.parseInt(재고관리[i].split(",")[2]);
						res += a*b;
						System.out.printf("%s\t%s\t%s\n",재고관리[i].split(",")[3],a,b);	
					}
					
				}
				System.out.println("총 가격: "+res);
			}
		}

	}

}
