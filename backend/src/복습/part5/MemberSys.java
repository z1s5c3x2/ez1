package 복습.part5;

import java.util.Scanner;

public class MemberSys {

	/*
	 * 1. 초기 메뉴 [ 24시간 ]

    1. 회원가입 2.로그인

2. 조건 기능

     1. 회원가입

         1. 아이디 , 비밀번호 , 이름 , 전화번호 , 나이 각 입력받아 저장

         2. Member 객체화

          3. 객체를 배열 저장

     2. 로그인

          1. 아이디 , 비밀번호 입력받아 저장

          2. 입력받은 값과 배열내 동일한 값 찾기

          - 만약에 동일한 값 있으면 로그인 성공

          - 아니면 실패
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Member[] memarr = new Member[100];
		while(true)
		{
			System.out.println("----회원 시스템----");
			System.out.println("1. 회원가입 2.로그인 \t 선택>");
			if(sc.nextInt() ==1)
			{
				System.out.println("-------------회원가입--------------");
				sc.nextLine();
				Member _tmp = new Member();
				System.out.println("아이디 : ");
				_tmp.아이디 = sc.nextLine();
				System.out.println("비밀번호 : ");
				_tmp.비밀번호= sc.nextLine();
				System.out.println("이름 : ");
				_tmp.이름= sc.nextLine();
				System.out.println("전화번호 : ");
				_tmp.전화번호= sc.nextLine();
				System.out.println("나이 : ");
				_tmp.나이 = sc.nextInt();
				sc.nextLine();
				for(int i=0;i<memarr.length;i++)
				{
					if(memarr[i] == null)
					{
						memarr[i] = _tmp;
						break;
					}
				}

			}else //로그인
			{
				System.out.println("-------------로그인--------------");
				sc.nextLine();
				System.out.println("아이디 : "); String _id = sc.nextLine();
				System.out.println("비밀번호 : "); String _pwd = sc.nextLine();
				String result = "안내) 로그인실패";
				for(int i=0;i<memarr.length;i++)
				{
					if(memarr[i] == null) {break;}
					else if(memarr[i].아이디.equals(_id) && memarr[i].비밀번호.equals(_pwd))
					{
						result = "안내) 로그인 성공";
						break;
					}
				}
				System.out.println(result);
			}
			
		}
	}

}
