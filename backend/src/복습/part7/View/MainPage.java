package 복습.part7.View;
import java.util.Scanner;

import 복습.part7.Controller.MemberController;
import 복습.part7.Model.dto.MemberDto;

public class MainPage {
    private static MainPage instance = new MainPage();

	public static MainPage getInstance() {return instance;}
	private MainPage() {}
    /*
     *         1.입력시 회원가입 메소드 호출 

            1. 회원가입에 필요한 데이터 5가지 입력받습니다.

            2. 입력받은 데이터를 컨트롤에게 전달후 결과를 응답 받습니다. 

            3. 응답 결과에 따라 출력문을 출력합니다.

        2.입력시 로그인 메소드 호출

            1. 로그인에 필요한 아이디와 비밀번호 입력받습니다.

            2. 입력받은 데이터를 컨트롤에게 전달후 결과를 응답 받습니다.

            3. 응답 결과에 따라 출력문을 출력합니다.

    5. MemberController.java 

            1. 회원가입 메소드 기능 구현 

                1. view에서 전달 받은 매개변수를 이용한 회원가입 처리후 결과 반환 

            2. 로그인 메소드 기능 구현 

                1. view에서 전달 받은 매개변수를 이용한 로그인 처리후 결과 반환
     */
    Scanner sc = new Scanner(System.in);
    public void index()
    {
      
        while(true)
        {
            System.out.println("1.회원가입 2.로그인");
            int ch = sc.nextInt();
            
            sc.nextLine();
            if(ch==1)
            {
                signup();
            }else{
                login();
            }
        }

    }
    void login()
    {
        String id,pwd;
        System.out.println("아이디를 입력해주세요");
        id = sc.nextLine();
        System.out.println("비밀번호를 입력해주세요");
        pwd = sc.nextLine();
        boolean res = MemberController.getInstance().loginMember(id, pwd);
        if(res)
        {
            System.out.println("로그인 성공");
            return;
        }
        System.out.println("일치하는 정보가 없음");
    }
    void signup()
    {
        MemberDto m = new MemberDto();
        System.out.println("아이디를 입력해주세요");
        m.setId(sc.nextLine());
        System.out.println("비밀번호를 입력해주세요");
        m.setPwd(sc.nextLine());
        System.out.println("이름를 입력해주세요");
        m.setName(sc.nextLine());
        System.out.println("전화번호를 입력해주세요");
        m.setPn(sc.nextLine());
        System.out.println("나이를 입력해주세요");
        m.setAge(sc.nextInt());
        sc.nextLine();
        boolean res = MemberController.getInstance().createMember(m);
        if(res)
        {
            System.out.println("가입 성공");
        }else{System.out.println("가입 실패");}
    }
}
