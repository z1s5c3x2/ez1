package java1.day13.EX2.View;

import java.util.ArrayList;
import java.util.Scanner;

import java1.day13.EX2.Controller.BoardController;
import java1.day13.EX2.Model.Dto.BoardDto;

public class MainPage {
    private static MainPage instance = new MainPage();
    private MainPage(){}
    public static MainPage getInstance(){return instance;}
    private Scanner sc=  new Scanner(System.in);
    public void mainView()
    {
        while(true)
        {
            System.out.println("----방문록 프로그램------------");
            System.out.println("1. 글등록 2. 글보기 3.글수정 4.글삭제");
            switch(sc.nextInt())
            {
                case 1:
                    writeView();
                    break;
                case 2:
                    printView();
                    break;
                case 3:
                    updateView();
                    break;
                default:
                    deleteView();
                    break;
            }
        }
    }
    void writeView()
    {
        sc.nextLine();
        BoardDto _tmp = new BoardDto(null,null, null);
        System.out.println("작성자 입력 ");
        _tmp.setWriter(sc.nextLine());
        System.out.println("제목 입력 ");
        _tmp.setTitle(sc.nextLine());
        System.out.println("내용 입력 ");
        _tmp.setContent(sc.nextLine());
        BoardController.getInstance().writeView(_tmp);
    }
    void printView()
    {
        System.out.println("보고싶은 게시글의 id를 입력해주세요");
        int _ch = sc.nextInt();
        BoardDto _tmp =  BoardController.getInstance().printView(_ch-1);
        sc.nextLine();
        System.out.printf("게시글 id:%d 작성자:%s 제목 :%s \n내용%s\n",_ch,_tmp.getWriter(),_tmp.getTitle(),_tmp.getContent());
        
    }
    void updateView()
    {
        sc.nextLine();
        System.out.println("수정할 게시글의 id를 입력해주세요");
        int _id = sc.nextInt();
        sc.nextLine();
        System.out.printf("%d번의 게시글에 수정할 내용을 입력해주세요\n",_id);
        String _con = sc.nextLine();
        BoardController.getInstance().updateView(_id, _con);
    }
    void deleteView()
    {
        System.out.println("삭제할 게시글의 id를 입력해주세요");
        BoardController.getInstance().deleteView(sc.nextInt());
        sc.nextLine();
    }
}
