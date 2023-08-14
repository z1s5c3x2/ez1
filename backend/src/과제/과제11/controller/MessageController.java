package 과제.과제11.controller;

import java.util.ArrayList;
import 과제.과제11.model.dao.MessageDao;
import 과제.과제11.model.dto.MessageDto;

public class MessageController {
	private static MessageController instance = new MessageController();
	public static MessageController getInstance() { return instance; }
	private MessageController() {}
	
	public boolean sendMsg(int bno,int aut,String msg)
	{
		if(msg != null)
		{

			return MessageDao.getInstance().sendMsg(bno, aut, msg);
		}
		
		return false;
	}
	public ArrayList<MessageDto> getMsgList (int mno)
	{
		return MessageDao.getInstance().getMsgList(mno);
	}
	public boolean messageReply(String mid,int mno,String con)
	{
		return MessageDao.getInstance().messageReply(mid, mno, con);
	}
}
