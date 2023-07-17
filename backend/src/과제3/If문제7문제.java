package 과제3;

import java.util.Scanner;

public class If문제7문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* -------문제1----- */
		System.out.println("정수 1 입력");
		int a = sc.nextInt();
		System.out.println("정수 2 입력");
		int b = sc.nextInt();
		if ( a>b)
		{
			System.out.println(a+"가 더 크다");
		}
		else if (a<b)
		{
			System.out.println(b+"가 더 크다");
		}
		else
		{
			System.out.println("같다");}
		/* -------문제2----- */
		System.out.println("정수 1 입력");
		a = sc.nextInt();
		System.out.println("정수 2 입력");
		b = sc.nextInt();
		System.out.println("정수 3 입력");
		int c = sc.nextInt();
		if(a>b && a>c){System.out.println(a + " 가 제일 크다");}
		else if(a<b && b>c){System.out.println(b+ " 가 제일 크다");}
		else{System.out.println(c+ " 가 제일 크다");}

		/* -------문제3----- */
		System.out.println("정수 1 입력");
		a = sc.nextInt();
		System.out.println("정수 2 입력");
		b = sc.nextInt();
		System.out.println("정수 3 입력");
		c = sc.nextInt();
		int n1,n2,n3;
		if(a>b && a>c){
			n1 = a;
			if( b>c){
				n2 = b;
				n3 = c;
			}
			else{
				n2=c;
				n3=b;
			}
		}
		else if(a<b && b>c){
			n1=b;
			if(a>c)
			{
				n2 = a;
				n3 = c;
			}
			else
			{
				n2=c;
				n3=a;
			}
		}
		else{
			n1 = c;
			if(a>b)
			{
				n2=a;
				n3=b;
			}
			else
			{
				n2=b;
				n3=a;
			}
		}
		System.out.printf("1:%d 2:%d 3:%d \n",n1,n2,n3);
		/* -------문제4----- */
		System.out.println("점수 입력");
		a = sc.nextInt();
		if(a>=90)
		{
			System.out.println("합격");
		}
		else
		{
			System.out.println("불합격");
		}
		/* -------문제5----- */
		System.out.println("점수 입력");
		a=sc.nextInt();
		if(a>=90){System.out.println("A등급");}
		else if(a>=80){System.out.println("B등급");}
		else if(a>=70){System.out.println("C등급");}
		else{System.out.println("재시험");}
		/* -------문제6----- */
		System.out.println("국어 점수");
		a = sc.nextInt();
		System.out.println("영어 점수");
		b = sc.nextInt();
		System.out.println("수학 점수");
		c = sc.nextInt();
		int sum = (a+b+c)/3;
		if(sum >=90)
		{
			if(a==100){System.out.println("국어 우수");}
			if(b==100){System.out.println("영어 우수");}
			if(c==100){System.out.println("수학 우수");}
		}
		else if(sum >= 80)
		{
			if(a>=90){System.out.println("국어 장려");}
			if(b>=90){System.out.println("영어 장려");}
			if(c>=90){System.out.println("수학 장려");}
		}
		else{System.out.println("재시험");}


		/* -------문제7----- */
		sc.nextLine();
		System.out.println("아이디 입력");
		String _str1 = sc.nextLine();
		System.out.println("비밀번호 입력");
		String _str2  = sc.nextLine();
		if(_str1.equals("admin") && _str2.equals("1234"))
		{
			System.out.println("로그인 성공");
		}
		else
		{
			System.out.println("로그인 실패");
		}
		
	}
	
}

/*
 	 문제1 : 2개의 정수를 입력받아서 더 큰수 출력 [ 경우의수 : 3개(크다,작다,같다=그외) ]
 	 문제2 : 3개의 정수를 입력받아서 가장 큰수 출력 
 	 문제3 : 3개의 정수를 입력받아서 오름차순[>] / 내림차순[<] [ 경우의수 :  3 7 5 : 3>7 , 3>5 , 7>5     총 : 3개  ] 
 	 문제4 : 점수를 입력받아 점수가 90점 이상이면 합격 아니면 불합격 출력 [ 경우의수 : 2개 ]
 	
 	 문제5 : 
			// 점수를 입력받아 점수가 90점 이상이면 A등급
			//				점수가 80점 이상이면 B등급
			//				점수가 70점 이상이면 C등급
			//				그외 재시험
	
	
 	 문제6	[ 경우의수 3개 , 첫번째 경우의수 : 3개 , 두번째 경우의수 : 3개 ] 총 9개  
			[ 입력 ] : 국어,영어,수학 입력받기
			[ 조건 ]
				평균이 90점 이상이면서 
					국어점수 100점 이면 '국어우수' 출력
					영어점수 100점 이면 '영어우수' 출력
					수학점수 100점 이면 '수학우수' 출력
				평균이 80점 이상이면서 
					국어점수 90점이상 이면 '국어장려' 출력
					영어점수 90점이상 이면 '영어정려' 출력
					수학점수 90점이상 이면 '수학장려' 출력
				그외 재시험 
		 
	문제7 로그인페이지
	 		[ 입력 ] : 아이디와 비밀번호를 입력받기
	 		[ 조건 ] : 회원아이디가 admin 이고 
	           			비밀번호가 1234 일 경우에는 
	          			로그인 성공 아니면 로그인 실패 출력
 */
