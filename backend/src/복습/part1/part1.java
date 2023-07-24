package 복습.part1;

import java.util.Scanner;

public class part1 {
    public static void main(String[] args) {
        int 콜라재고 = 10;
        int 환타재고 = 3;
        int 사이다재고 = 2;
        int 콜라바구니 = 0;
        int 환타바구니 = 0;
        int 사이다바구니 = 0;
        int 콜라가격 = 300;
        int 환타가격 = 200;
        int 사이다가격 = 100;
        int _num = 1;
        Scanner sc = new Scanner(System.in);
        int ch;
        while(true)
        {
            System.out.printf("1. 콜라[%d] 2.환타[%d] 3.사이다[%d] 4.결제\n",콜라가격,환타가격,사이다가격);
            System.out.print(">>>>>> 선택 :");
            switch(sc.nextInt())
            {
                case 1: 
                    if(콜라재고 > 0)
                    {
                        콜라재고 --;
                        콜라바구니++;
                        System.out.println("안내) 콜라 담았습니다.");
                    }
                    else
                    {
                        System.out.println("안내) 콜라 재고가 없습니다. [관리자에게 문의]");
                    }
                    break;  
                case 2: 
                    if(환타재고 > 0)
                    {
                        환타재고 --;
                        환타바구니++;
                        System.out.println("안내) 환타 담았습니다.");
                    }
                    else
                    {
                        System.out.println("안내) 환타 재고가 없습니다. [관리자에게 문의]");
                    }
                    break;  
                case 3: 
                if(사이다재고 > 0)
                    {
                        사이다재고 --;
                        사이다바구니++;
                        System.out.println("안내) 사이다 담았습니다.");
                    }
                    else
                    {
                        System.out.println("안내) 사이다 재고가 없습니다. [관리자에게 문의]");
                    }
                    break;  
                default:
                    System.out.println("----------장바구니------");
                    System.out.println("제품명\t수량\t가격");
                    if(콜라바구니 > 0) System.out.printf("%s\t%d\t%d\n","콜라",콜라바구니,콜라바구니*콜라가격);
                    if(환타바구니 > 0) System.out.printf("%s\t%d\t%d\n","환타",환타바구니,환타바구니*환타가격);
                    if(사이다바구니 > 0) System.out.printf("%s\t%d\t%d\n","사이다",사이다바구니,사이다바구니*사이다가격);
                    int res =  (콜라바구니*콜라가격) + (환타바구니*환타가격) + (사이다바구니*사이다가격);
                    System.out.println("총가격 : "+res);
                    System.out.println("1. 결제 2.취소");
                    ch = sc.nextInt();
                    
                    if(ch == 1)
                    {
                        System.out.println("안내) 금액 투여");
                        int Money = sc.nextInt();
                        if(Money >= res)
                        {
                            System.out.println("잔액 : "+ (Money-res));
                            System.out.println("주문 번호 "+ _num++);
                            사이다바구니 =0;
                            콜라바구니 = 0;
                            환타바구니 = 0;
                        }
                        else
                        {
                            System.out.println("안내 ) 잔액이 부족합니다.");
                            사이다재고 +=사이다바구니;
                            콜라재고 += 콜라바구니;
                            환타재고 += 환타바구니;
                            사이다바구니 =0;
                            콜라바구니 = 0;
                            환타바구니 = 0;
                        }
                        
                        
                    }
                    else
                    {
                        System.out.println("안내 ) 결제가 취소되었습니다.");
                        사이다재고 +=사이다바구니;
                        콜라재고 += 콜라바구니;
                        환타재고 += 환타바구니;
                        사이다바구니 =0;
                        콜라바구니 = 0;
                        환타바구니 = 0;
                    }

                    break;
            }
        }
        
    }
}
