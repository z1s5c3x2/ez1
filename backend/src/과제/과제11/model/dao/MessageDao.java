package 과제.과제11.model.dao;

import java.util.ArrayList;

import 과제.과제11.model.dto.MessageDto;

public class MessageDao  extends Dao{
	private static MessageDao instance = new MessageDao();
	public static MessageDao getInstance() { return instance; }
	private MessageDao() {}
	
	public boolean sendMsg(int bno,int aut,String con)
	{

		try {
			String sql = "insert into message(meseid,mereid,mecontent) VALUES((select mid from member where mno = ?),(select mid from member where mno = (select mno from board where bno = ?)),?)";

			ps = conn.prepareStatement(sql);
			ps.setInt(1,aut);
			ps.setInt(2,bno);
			ps.setString(3,con);
			int row = ps.executeUpdate();
			if(row ==1)
			{
				return true;
			}
			return false;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("메세지 전송 에러 "+e);
			return false;
		}
		
		
	}
	public boolean messageReply(String mid,int senno,String con)
	{
		try {
			String sql = "insert into message(meseid,mereid,mecontent) VALUES((select mid from member where mno = ?),?,?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1,senno);
			ps.setString(2,mid);
			ps.setString(3,con);
			ps.executeUpdate();
			
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("메세지 보내기 오류"+e);
			return false;
		}

	}
	public ArrayList<MessageDto>getMsgList(int mno)
	{
		ArrayList<MessageDto> res = new ArrayList<MessageDto>();
		try {
			String sql = "select * from message where mereid = (select mid from member where mno = ?)";
			ps =conn.prepareStatement(sql);
			ps.setInt(1,mno);
			rs = ps.executeQuery();
			while(rs.next())
			{
				
				MessageDto _tmp = new MessageDto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
				res.add(_tmp);
			}
			return res;

		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
