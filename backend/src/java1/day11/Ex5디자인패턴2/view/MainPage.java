package java1.day11.Ex5디자인패턴2.view;

import java.util.Scanner;

import java1.day11.Ex5디자인패턴2.controller.MemberController;
import java1.day11.Ex5디자인패턴2.model.dao.MemberDao;
import java1.day11.Ex5디자인패턴2.model.dto.MemberDto;

public class MainPage { // 입출력 담당하는 클래스 // view -> HTML/JS
	// 0. 싱글톤 생성
		// 1. 현재 클래스에 static 객체를 생성 , 필드는 무조건 잠금
	private static MainPage mainPage = new MainPage();
		// 2. 외부 객체에서 해당 싱글톤 호출하기 위한 메소드 
	public static MainPage getInstance() { return mainPage;}
		// 3. 객체 외부에서 해당 클래스로 객체 생성 잠금 , 생성자를 private
	private MainPage() {}
	// 1. 필드
	private Scanner sc = new Scanner(System.in);
	
	// 2. 생성자
	// 3. 함수
	
	
	public void mainPage() {
		while(true) {
		
			System.out.println("\n\n--------- 회원 시스템 ---------"); 
			System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기    선택> ");
			int ch = sc.nextInt(); 
			
			if( ch == 1 ) { signupPage(); }
			if( ch == 2 ) { loginPage(); } 
			if( ch == 3 ) { findIdPage(); } 
			if( ch == 4 ) { findPwPage(); } 
		}
	
	}
	
	void signupPage() {
		System.out.println("-----------회원가입----------");
		System.out.println("아이디 :"); String id = sc.next();
		System.out.println("비밀번호 :"); String password = sc.next();
		System.out.println("이름 :"); String name = sc.next();
		System.out.println("전화번호 :"); String phone = sc.next();
		System.out.println("나이 :"); int age = sc.nextInt();
		// --> 컨트롤러에게 전달 // 컨트롤 클래스내 메소드 호출
		boolean result = MemberController.getInstance().signupLogic(id,password,name,phone,age);
		if(result) System.out.println("안내) 회원 가입 성공");
		else System.out.println("안내) 회원 가입 실패");
	}
	void loginPage() {
		System.out.println("-----------로그인----------");
		System.out.println("아이디 :"); String id = sc.next();
		System.out.println("비밀번호 :"); String password = sc.next();
		String _str = MemberController.getInstance().loginLogic(id, password);
		if( _str != null)
		{
			System.out.printf("아이디 %s 님 환영합니다",_str);
		}
		else
		{
			System.out.println("계정 정보 오류");
		}	
	}
	void findIdPage() {
		System.out.println("--------- 아이디찾기 ---------");
		System.out.print("이름 : "); 		String name = sc.next();
		System.out.print("전화번호 : ");	String phone = sc.next();
		String _findId = MemberController.getInstance().findIdLogic(name,phone);
		if(_findId != null)
		{
			System.out.println(name+"님의 아이디는 " + _findId+"입니다 ");
		}else{System.out.println("일치하는 정보가 없습니다");}

		
	}
	void findPwPage() {
		System.out.println("-----------비밀번호 찾기----------");
		System.out.print("아이디 : "); 		String id = sc.next();
		System.out.print("전화번호 : ");	String phone = sc.next();
		String _findId = MemberController.getInstance().findPwLogic(id,phone);
		if(_findId != null)
		{
			System.out.println(id+"님의 비밀번호는 " + _findId+"입니다 ");
		}else{System.out.println("일치하는 정보가 없습니다");}

	}
	
}
