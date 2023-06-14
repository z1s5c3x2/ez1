import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class qwe
{
    
    public static void main(String[] args)
    {
        /*

        과제2 [ console  키오스크 ]
        요구사항 [ 변수사용가능 , 배열 사용금지 , 함수사용금지 , main함수만 가능 , 클래스 사용금지 ] 변수와 반복문/제어문 만 사용합니다.
        1. 제품 가격
           1.콜라[300원]  2.사이다[400원]  3.환타[500원]
        
        2. 제품 초기 재고
           콜라 10개   , 사이다 8개 , 환타 15개      * 판매시 재고 차감되고 다시 채우기 제외 
     
        3. 키오스크 메뉴 [ 무한루프 : 종료 없음(24시간) ] 
           1. 콜라 2.사이다 3.환타 4.결제
           [ 1~3 선택시 ]
              - 재고가 있을경우 장바구니 담기 / 없으면 '재고부족' 출력 
           [ 4 선택시 ] 
              - 현재 장바구니 현황 표시 목록 
              ----------------------------------
              제품명   수량   가격
              사이다   1   400
              환타      2   1000
              총가격 : 1400
                 
              - 결제메뉴 표시
                 1. 결제 2.취소 
                 [결제]
                    - 금액 입력받아 총가격에 뺀 잔액 출력 -> 결제 성공시 장바구니 초기화 
                    - 만약에 금액이 부족하면 결제 취소 -> 장바구니 초기화 / 재고 다시 되돌리기
                 [취소]
                    - [ 장바구니 초기화 / 재고 다시 되돌리기 ]
        */

        //1. 제품 가격
        int cokePrice = 300;
        int siderPrice = 400;
        int hwantaPrice = 500;

        //2. 제품 초기 재고
        int cokeCount = 3;
        int siderCount = 8;
        int hwantaCount = 15;

        Scanner sc = new Scanner(System.in);

        int cokeBuyCount = 0;
        int siderBuyCount = 0;
        int hwantaBuyCount = 0;

        int priceResult = 0;
        int getMoney = 0;
        
        while (true)
        {
            System.out.println("제품 선택 : 1.콜라 2.사이다 3.환타 4.결제");
            switch(sc.nextInt())  // 3. 키오스크 메뉴 [ 무한루프 : 종료 없음(24시간) ]  1. 콜라 2.사이다 3.환타 4.결제
            {
                case 1: 
                    if(cokeCount > 0)
                    {
                        cokeBuyCount ++;
                        cokeCount --;
                        System.out.println("장바구니 담기");
                    }
                    else
                    {
                        System.out.println("재고부족");
                    }
                    break;
                case 2:
                    if(siderCount > 0)
                    {
                        siderBuyCount ++;
                        siderCount --;
                        System.out.println("장바구니 담기");
                    }
                    else
                    {
                        System.out.println("재고부족");
                    }
                    break;
                case 3:
                    if(hwantaCount > 0)
                    {
                        hwantaBuyCount ++;
                        hwantaCount --;
                        System.out.println("장바구니 담기");
                    }
                    else
                    {
                        System.out.println("재고부족");
                    }
                    break;
                default:
                    System.out.println("현재 장바구니 표시 목록\n----------------------------------");
                    System.out.println("제품명  수량  가격");
                    if(cokeBuyCount > 0)
                    {
                        System.out.printf("콜라    %d     %d\n",cokeBuyCount,cokeBuyCount*cokePrice);
                    }
                    if(siderBuyCount > 0)
                    {
                        System.out.printf("사이다  %d     %d\n", siderBuyCount,siderBuyCount*siderPrice);
                    }
                    if(hwantaBuyCount > 0)
                    {
                        System.out.printf("환타    %d     %d\n",hwantaBuyCount,hwantaBuyCount*hwantaPrice);
                    }
                    priceResult = (cokeBuyCount*cokePrice)+(siderBuyCount*siderPrice)+(hwantaBuyCount*hwantaPrice);
                    
                    System.out.printf("총가격 : %d\n",priceResult);
                    System.out.println("결제메뉴\n1.결제 2.취소");

                    if(sc.nextInt() == 1)
                    {
                        System.out.println("돈 입력");
                        getMoney = sc.nextInt();

                        if(getMoney >= priceResult) //결제
                        {
                            System.out.printf("거스름돈 %d\n",getMoney-priceResult);

                        }
                        else
                        {
                            System.out.println("잔액부족");
                            //재고 되돌리기
                            cokeCount += cokeBuyCount ;
                            siderCount += siderBuyCount ;
                            hwantaCount += hwantaBuyCount;
                            
                        }
                        //장바구니 초기화
                        cokeBuyCount = 0;
                        siderBuyCount = 0;
                        hwantaBuyCount = 0;
                    }
                    else
                    {
                        cokeCount += cokeBuyCount ;
                        siderCount += siderBuyCount ;
                        hwantaCount += hwantaBuyCount;
                        cokeBuyCount = 0;
                        siderBuyCount = 0;
                        hwantaBuyCount = 0;
                    }
                    break;
            }
        }
    }
}