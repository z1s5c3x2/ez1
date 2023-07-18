package java1.day4;

public class EX1_for {
   public static void main(String[] args) {
      
      int sum = 0;
      
      sum = sum+1;
      sum += 2;
      sum += 3;
      sum += 4;
      sum += 5;
      sum += 6;
      sum += 7;
      sum += 8;
      sum += 9;
      sum += 10;
      
      int sum2 = 0;
      for(int i=1; i<=10; i++){
         sum2 += i;
         System.out.println(sum2);
      }
      
      System.out.println("-------------------------");
      
      int sum3 = 0;
      for(int 반복변수=1; 반복변수<=100; 반복변수++){
         sum3 += 반복변수;
      }
      
      
      int sum4 = 0;
      int i;
      for(i = 1; i<=100; i++){
         sum4 += i;
      }
      System.out.println("1~" + (i-1)+" 합 : "+sum4);
      
      
      for(float x = 0.1f; x<=1.0f; x+=0.1f) {
         System.out.println(x + " ");
      }
      System.out.println("1~" + (i-1)+" 합 : "+sum4);
      
      
      for( double x = 0.1; x<=1.0; x+=0.1) {
         System.out.println( x + " ");
      }
      
      
      
      
      
      
   }
}









