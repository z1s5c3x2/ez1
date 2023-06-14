import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class practice
{
    public static class ProductSave
    {
        /*
         * 1. 제품 객체화 [ 파일명 , 가격 , 재고 ]
         * 제품 변수 ----> 제품 객체화
         */
        public String filePath = "c:/productData.txt";

        public int cokePrice;
        public int siderPrice;
        public int hwantaPrice;

        public int cokeCount;
        public int siderCount;
        public int hwantaCount;

    }

    public static void main(String[] args) throws IOException 
    {
        
        
        // 제품 재고,가격 불러오기
        ProductSave saveData = new ProductSave();
        BufferedReader br = new BufferedReader(new FileReader(saveData.filePath));

        // 1. 제품 가격
        saveData.cokePrice = Integer.parseInt(br.readLine());
        saveData.siderPrice = Integer.parseInt(br.readLine());
        saveData.hwantaPrice = Integer.parseInt(br.readLine());

        // 2. 제품 초기 재고
        saveData.cokeCount = Integer.parseInt(br.readLine());
        saveData.siderCount = Integer.parseInt(br.readLine());
        saveData.hwantaCount = Integer.parseInt(br.readLine());
        br.close();

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
                    if(saveData.cokeCount > 0)
                    {
                        cokeBuyCount ++;
                        saveData.cokeCount --;
                        System.out.println("장바구니 담기");
                    }
                    else
                    {
                        System.out.println("재고부족");
                    }
                    break;
                case 2:
                    if(saveData.siderCount > 0)
                    {
                        siderBuyCount ++;
                        saveData.siderCount --;
                        System.out.println("장바구니 담기");
                    }
                    else
                    {
                        System.out.println("재고부족");
                    }
                    break;
                case 3:
                    if(saveData.hwantaCount > 0)
                    {
                        hwantaBuyCount ++;
                        saveData.hwantaCount --;
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
                        System.out.printf("콜라    %d     %d\n",cokeBuyCount,cokeBuyCount*saveData.cokePrice);
                    }
                    if(siderBuyCount > 0)
                    {
                        System.out.printf("사이다  %d     %d\n", siderBuyCount,siderBuyCount*saveData.siderPrice);
                    }
                    if(hwantaBuyCount > 0)
                    {
                        System.out.printf("환타    %d     %d\n",hwantaBuyCount,hwantaBuyCount*saveData.hwantaPrice);
                    }
                    priceResult = (cokeBuyCount*saveData.cokePrice)+(siderBuyCount*saveData.siderPrice)+(hwantaBuyCount*saveData.hwantaPrice);
                    
                    System.out.printf("총가격 : %d\n",priceResult);
                    System.out.println("결제메뉴\n1.결제 2.취소");

                    if(sc.nextInt() == 1)
                    {
                        System.out.println("돈 입력");
                        getMoney = sc.nextInt();

                        if(getMoney >= priceResult) //결제
                        {
                            System.out.printf("거스름돈 %d\n",getMoney-priceResult);
                            BufferedWriter bw = new BufferedWriter(new FileWriter(saveData.filePath));
                            bw.write(String.valueOf(saveData.cokePrice));
                            bw.newLine();
                            bw.write(String.valueOf(saveData.siderPrice));
                            bw.newLine();
                            bw.write(String.valueOf(saveData.hwantaPrice));
                            bw.newLine();
                            bw.write(String.valueOf(saveData.cokeCount));
                            bw.newLine();
                            bw.write(String.valueOf(saveData.siderCount));
                            bw.newLine();
                            bw.write(String.valueOf(saveData.hwantaCount));
                            bw.close();
                        }
                        else
                        {
                            System.out.println("잔액부족");
                            //재고 되돌리기
                            saveData.cokeCount += cokeBuyCount ;
                            saveData.siderCount += siderBuyCount ;
                            saveData.hwantaCount += hwantaBuyCount;
                            
                        }
                        //장바구니 초기화
                        cokeBuyCount = 0;
                        siderBuyCount = 0;
                        hwantaBuyCount = 0;
                    }
                    else
                    {
                        saveData.cokeCount += cokeBuyCount ;
                        saveData.siderCount += siderBuyCount ;
                        saveData.hwantaCount += hwantaBuyCount;
                        cokeBuyCount = 0;
                        siderBuyCount = 0;
                        hwantaBuyCount = 0;
                    }
                    break;
            }
        }
    }
    
}

