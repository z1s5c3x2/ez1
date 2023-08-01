package java1.day13.EX2.Controller;

import java.util.ArrayList;

import java1.day13.EX2.Model.Dao.BoardDao;
import java1.day13.EX2.Model.Dto.BoardDto;

public class BoardController {
    private static BoardController instance = new BoardController();
    private BoardController(){}
    public static BoardController getInstance(){return instance;}

    public void writeView(BoardDto _bdt)
    {
        BoardDao.getInstance().boardLst.add(_bdt);
        
    }
    public BoardDto printView(int _ch)
    {
        return BoardDao.getInstance().boardLst.get(_ch);
    }
    public void updateView(int ch,String _con)
    {
        BoardDao.getInstance().boardLst.get(ch-1).setContent(_con);


    }
    public void deleteView(int _ch)
    {
        BoardDao.getInstance().boardLst.remove(_ch-1);
    }
}
