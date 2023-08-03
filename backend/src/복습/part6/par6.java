package 복습.part6;

import java.util.Scanner;

public class par6 {
	//8분 30초 입니다
	static Member[] mem = new Member[100];
	static Scanner sc = new Scanner(System.in);
/*
 * 0. 저장

2. 각 메소드 기능

    0. main 메소드 : 초기 메뉴 [ 24시간 ]

        1.입력시 회원가입 메소드 호출 

        2. 입력시 로그인 메소드 호출

        3. 입력시 아이디찾기​ 메소드호출 

        4. 입력시 비밀번호찾기 메소드 호출


    2. 로그인 메소드
        1. 아이디 , 비밀번호 입력받아 저장
        2. 입력받은 값과 배열내 동일한 값 찾기
            - 만약에 동일한 값 있으면 로그인 성공
            - 아니면 실패
    3. 아이디찾기 메소드
        1. 이름 , 전화번호 입력받아 저장
        2. 입력받은 값과 배열내 동일한 값 찾기
            - 만약에 동일한 값 있으면 찾은 아이디 출력
            - 아니면 없다.
    4. 비밀번호찾기 메소드
        1. 아이디 , 전화번호 입력받아 저장
        2. 입력받은 값과 배열내 동일한 값 찾기
            - 만약에 동일한 값 있으면 찾은 비밀번호 출력
            - 아니면 없다.
 */
	public static void main(String[] args) {
		
		while(true)
		{
			System.out.println("1. 회원가입 2. 로그인 3. 아이디찾기 4 비밀번호 찾기");
			int ch = sc.nextInt();
			sc.nextLine();
			if(ch == 1){signUp();}
			else if(ch == 2){login();}
			else if (ch==3){findId();}
			else{findPwd();}
			
		}

	}
	static void findPwd()
	{
		String id,pwd;
		System.out.println("아이디 입력해주세요");
		id = sc.nextLine();
		System.out.println("전화번호 입력해주세요");
		pwd = sc.nextLine();
		for(int i=0;i<mem.length;i++)
		{
			if(mem[i] == null){
				System.out.println("일치하는 정보가 없습니다");
				return;}
			if(mem[i].id.equals(id) && mem[i].pwd.equals(pwd))
			{
				System.out.println(mem[i].name+"님의 비밀번호는 "+mem[i].pwd+"입니다");
				return;
			}
		}
	}
	static void findId()
	{
		String name,pn;
		System.out.println("이름을 입력해주세요");
		name = sc.nextLine();
		System.out.println("전화번호 입력해주세요");
		pn = sc.nextLine();
		for(int i=0;i<mem.length;i++)
		{
			if(mem[i] == null){
				System.out.println("일치하는 정보가 없습니다");
				return;}
			if(mem[i].name.equals(name) && mem[i].phoneNum.equals(pn))
			{
				System.out.println(mem[i].name+"님의 아이디는 "+mem[i].id+"입니다");
				return;
			}
		}
	}
	static void login()
	{
		String id,pwd;
		System.out.println("아이디를 입력해주세요");
		id = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요");
		pwd = sc.nextLine();
		for(int i=0;i<mem.length;i++)
		{
			if(mem[i] == null){
				System.out.println("일치하는 정보가 없습니다");
				return;}
			if(mem[i].id.equals(id) && mem[i].pwd.equals(pwd))
			{
				System.out.println(mem[i].name+"님 로그인 성공");
				return;
			}
		}
	}
	static void signUp()
	{
		Member _m = new Member();
		//1. 아이디 , 비밀번호 , 이름 , 전화번호 , 나이 각 입력받아 저장
		
		System.out.println("아이디를 입력해주세요");
		_m.id = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요");
		_m.pwd = sc.nextLine();
		System.out.println("이름을 입력해주세요");
		_m.name = sc.nextLine();
		System.out.println("전화번호를 입력해주세요");
		_m.phoneNum = sc.nextLine();
		System.out.println("나이 입력해주세요");
		_m.age = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<mem.length;i++)
		{
			if(mem[i] == null)
			{
				mem[i] = _m;
				System.out.println("회원가입 성공");
				return;
			}
		}

	}	

}
