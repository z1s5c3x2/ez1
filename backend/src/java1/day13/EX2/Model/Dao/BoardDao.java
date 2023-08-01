package java1.day13.EX2.Model.Dao;

import java.util.ArrayList;

import java1.day13.EX2.Model.Dto.BoardDto;

public class BoardDao {
    private static BoardDao instance = new BoardDao();
    private BoardDao(){}
    public static BoardDao getInstance(){return instance;}
    public ArrayList<BoardDto> boardLst = new ArrayList<BoardDto>();

}
