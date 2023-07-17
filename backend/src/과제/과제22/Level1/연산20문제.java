package 과제.과제22.Level1;

import java.util.Scanner;

public class 연산20문제 {
	
	public static void main(String[] args) {
		
		//------ 문제1 여기에 풀이-------//
		System.out.println("|\\_/|\r" );
		System.out.println("|q p|   /}\r");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
		
		//------ 문제2 여기에 풀이-------//
		Scanner sc = new Scanner(System.in);
		System.out.println("작성자 입력");
		String _str1 = sc.nextLine();
		System.out.println("내용 입력");
		String _str2 = sc.nextLine();
		System.out.println("날짜 입력");
		String _str3 = sc.nextLine();
		System.out.println("--------------방문록--------------------");
		System.out.println("| 순번  | 작성자  | 	내용 	| 날짜       |");
		System.out.printf("|  1   | %s |%s |  %s    |\n",_str1,_str2,_str3);
		
		
		//------ 문제3 여기에 풀이-------//
		System.out.println("기본급 입력");
		int pay1 = sc.nextInt();
		System.out.println("수당 입력");
		int pay2 = sc.nextInt();
		int result = pay1+pay2;
		result *=0.9;
		System.out.println("실수령액:"+result);
		sc.nextLine();
		
		//------ 문제4 여기에 풀이-------//
		System.out.println("금액 입력");
		int money = sc.nextInt();
		System.out.println("십만원:"+money/100000);
		System.out.println("만원:"+((money%100000)/10000));
		System.out.println("천원:"+((money%10000)/1000));
		System.out.println("백원:"+((money%1000)/100));
		sc.nextLine();
		
		//------ 문제5 여기에 풀이-------//
		System.out.println("정수 하나 입력 7의 배수인가?");
		System.out.println(sc.nextInt()%7==0?'O':'X');
		sc.nextLine();
		//------ 문제6 여기에 풀이-------//
		System.out.println("정수 하나 입력 홀수면 O 짝수 X");
		System.out.println(sc.nextInt()%2!=0?'O':'X');
		sc.nextLine();
		//------ 문제7 여기에 풀이-------//
		System.out.println("정수 하나 입력 7의 배수이면서 짝수면 O 아니면 X");
		int num = sc.nextInt();
		System.out.println(num%2==0 && num%7 ==0?'O':'X');
		sc.nextLine();
		
		//------ 문제8 여기에 풀이-------//
		
		System.out.println("정수 하나 입력 7의 배수이거나 홀수면 O 아니면 X");
		num = sc.nextInt();
		System.out.println(num%2!=0 || num%7 ==0?'O':'X');
		sc.nextLine();
		//------ 문제9 여기에 풀이-------//
		System.out.println("정수 두개 비교 후 크기 비교");
		num = sc.nextInt();
		int num1 = sc.nextInt();
		System.out.println(num>num1?num:num1);
		sc.nextLine();

		//------ 문제10 여기에 풀이-------//
		System.out.println("반지름 입력받아 원 넓이 출력");
		num = sc.nextInt();
		System.out.println(num*num*3.14);
		sc.nextLine();
		
		//------ 문제11 여기에 풀이-------//
		System.out.println("두 실수를 입력받아 앞 실수의 값이 뒤의 값의 몇 %인지 출력하기");
		float fl1 = sc.nextFloat();
		float fl2 = sc.nextFloat();		
		System.out.printf("%f",fl1/fl2*100);
		System.out.println("%");
		sc.nextLine();
		//------ 문제12 여기에 풀이-------//
		System.out.println("사다리 꼴의 넓이 구하기");
		System.out.println("밑변 입력");
		num = sc.nextInt();
		System.out.println("윗변 입력");
		int num2 = sc.nextInt();
		System.out.println("높이 입력");
		num1 = sc.nextInt();
		System.out.println("넓이:" + ((num+num2)*num1)/2.0);
		sc.nextLine();
		//------ 문제13 여기에 풀이-------//
		System.out.println("키 입력");
		System.out.println("표준 체중 ="+(sc.nextInt()-100)*0.9);
		sc.nextLine();
		//------ 문제14 여기에 풀이-------//
		System.out.println("키 입력");
		num = sc.nextInt();
		System.out.println("몸무게 입력");
		num1 = sc.nextInt();
		float fresult = num1/((num/100)*(num/100));
		System.out.println("bmi = "+fresult);
		sc.nextLine();
		//------ 문제15 여기에 풀이-------//
		System.out.println("변환 할 inch 입력");
		System.out.printf("%fcm\n",sc.nextFloat()*2.54);
		sc.nextLine();
		//------ 문제16 여기에 풀이-------//
		System.out.println("중간,기말,수행 점수 입력 받아 최종 점수출력");
		System.out.println("중간");
		num = sc.nextInt();
		System.out.println("기말");
		num1 = sc.nextInt();
		System.out.println("수행");
		num2 = sc.nextInt();
		fresult = (num*0.3f)+(num1*0.3f)+(num2*0.4f);
		System.out.printf("%.2f점",fresult);
		sc.nextLine();
		
		//------ 문제17 여기에 풀이-------//
		System.out.println("연산 순서 나열");
		System.out.println("첫번째줄 첫번째 x == 10 두번째 x == 9  y = 24");
		System.out.println("두번째줄 x=8 y= 23");

		
		//------ 문제18 여기에 풀이-------//
		System.out.println("나이 입력");
		num = sc.nextInt();
		System.out.println((num>=40)? "중년":(num>=20)? "성인":"학생");
		sc.nextLine();
		
		//------ 문제19 여기에 풀이-------//
		System.out.println("국어점수 입력");
		num=sc.nextInt();
		System.out.println("영어점수 입력");
		num1=sc.nextInt();
		System.out.println("수학점수 입력");
		num2=sc.nextInt();
		System.out.println("총점 = "+(num+num1+num2));
		System.out.printf("평균=%.2f",(num+num1+num2)/3.0);
		sc.nextLine();
		//------ 문제20 여기에 풀이-------//
		System.out.println("아이디 입력 ");
		_str1 = sc.nextLine();
		System.out.println("비밀번호 입력");
		_str2 = sc.nextLine();
		String adminIdSav = "admin";
		String adminPwdSav = "1234";
		System.out.println((_str1.equals("admin")&&_str2.equals("1234"))? "로그인성공":"로그인 실패");
		
		//------ 문제21 여기에 풀이-------//
		System.out.println("세 정수 입력하여 가장 큰수 출력");
		System.out.println("정수1 입력 ");
		num = sc.nextInt();
		System.out.println("정수2 입력 ");
		num1 = sc.nextInt();
		System.out.println("정수3 입력 ");
		num2 = sc.nextInt();
		System.out.println( (num>num1 && num>num2)? num: (num1>num&&num1>num2)? num1:num2);
		
	}

}


/*

문제1 : 강아지 console 출력
	|\_/|
	|q p|   /}
	( 0 )"""\
	|"^"`    |
	||_/=\\__|

문제2 : 입력받은 3개 데이터를 이용한 표 만들기 
	[입력변수]
		1. 작성자[문자열] , 내용[문자열] , 날짜[문자열] 입력받아 각 변수에 저장 
	[출력 예]
		   --------------방문록--------------------
		   | 순번  | 작성자  | 	내용 	| 날짜       |
		   |  1   | 강호동  |안녕하세요  |  09-28    |
		  ----------------------------------------
	
문제3 : 급여 계산
	[입력조건]
		기본급[정수] , 수당[정수]
	[ 조건 ] 
		 실수령액 = 기본급 + 수당 - 세금[기본급10%] 
	[출력조건] 
		실수령액 출력[ 소수점 없이  ]

문제4 : 지폐 세기 
	 [입력조건 ] 
		금액 
	 [조건 ] 
		 십만원 부터 백원 까지의 개수 세기 
	[ 출력조건 ]
		예) 356789 입력시 
		 십만원 3장 
		 만원 5장
		 천원 6장 
		 백원 7개

문제5 : 하나의 정수를 입력받아 7의 배수인지 출력[ 'O' 혹은 'X' 로 출력]

문제6 : 하나의 정수를 입력받아 홀수 인지 출력 [ 'O' 혹은 'X' 로 출력]

문제7 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 출력 [ 'O' 혹은 'X' 로 출력 ]

문제8 : 하나의 정수를 입력받아 7의 배수 이거나 홀수 인지 출력 [ 'O' 혹은 'X' 로 출력 ]

문제9 : 두개의 정수를 입력받아 더 큰수 출력 

문제10 : 반지름을 입력받아 원 넓이 출력하기 
	계산식) 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]

문제11 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기 
	예) 54.5   84.3 실수 2개입력시 결과는   64.285714%

문제12 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기 
	계산식) 사다리꼴 계산식 = > (윗변 + 밑변) * 높이 / 2

문제13: 키를 정수를 입력받아 표준체중 출력하기 
	계산식) 표준체중 계산식 = > (키 - 100) * 0.9

문제14: 키와 몸무게를 입력받아 BMI 출력하기 
	계산식) BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))

문제15: inch 를 입력받아 cm 로 변환하기 
	계산식) 1 inch -> 2.54cm

문제16:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여 소수 둘째자리까지 점수 출력하시오 
	계산식 반영비율)  중간고사 반영비율 => 30 %  / 기말고사 반영비율 => 30 %   / 수행평가 반영비율 => 40 %

문제17 :  연산 순서 나열 하고 printf() 에 출력되는 x 와 y 값을 예측하시오.
	int x = 10;
	int y = x-- + 5 + --x;
	printf(" x의 값 : %d , y의값 :  %d ", x, y)

문제18 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기

문제19 : 국어 , 영어 , 수학 점수를 입력받아 각 변수에 저장하고 총점(소수점 0자리) 출력 , 평균(소수점 2자리 까지) 출력

문제20 : 아이디[문자열] 와 비밀번호[문자열] 를 입력받아 아이디가 'admin' 이고 비밀번호가 '1234' 와 일치하면 로그인성공 아니면 로그인실패 출력

문제21 : 세 정수를 입력받아 가장 큰수 출력 

  
 */
