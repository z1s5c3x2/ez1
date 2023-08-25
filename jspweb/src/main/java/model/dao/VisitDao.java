package model.dao;

import java.util.ArrayList;

import model.dto.VisitLogDto;

public class VisitDao extends Dao{
	
	private static VisitDao memberDao = new VisitDao();
	public static VisitDao getInstance() { return memberDao; }
	private VisitDao() {}

	public boolean vwrite(VisitLogDto _vdt)
	{
		try {
			String sql = "insert into visitlog(vwriter,vpwd,vtext) values(?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, _vdt.getVwriter());
			ps.setString(2, _vdt.getVpwd());
			ps.setString(3, _vdt.getVcontent());
			int res =  ps.executeUpdate();
			if(res != 1)
			{
				return false;
			}
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("에러!"+e);
		}
		
		
		return false;
	}
	public ArrayList<VisitLogDto> vread() {
		ArrayList<VisitLogDto> tmp = new ArrayList<>();
		try {
			String sql = "select * from visitlog order by vdate desc";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next())
			{
				tmp.add(new VisitLogDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));

			}
			return tmp;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("에러!2"+e);
		}
		
		return null;
	}
	
	
	   // 3. 수정 [ 인수 : 수정할 방문록 번호, 수정할 내용, 리턴 : 성공/실패(boolean)=true/false ]
	   public boolean vupdate(int vno, String vcontent, String vpwd) {
	      
	      String sql = "update visitlog set vtext = ? where vno = ? and vpwd = ? ";
	      
	      try {
	         ps = conn.prepareStatement(sql);
	         ps.setString(1, vcontent);
	         ps.setInt(2, vno);
	         ps.setString(3, vpwd);
	         int row = ps.executeUpdate();
	         if(row == 1) return true;
	      }catch(Exception e) {
	         System.out.println("vupdate오류 : " + e);
	      }
	      
	      return false;
	   } 


	// 1. delete ( 삭제 )
	public int vdelete(int vno,String vpwd) {
		System.out.println(vno);
		System.out.println(vpwd);
		try {
			String sql  = "delete from visitlog where vno = ? and vpwd = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, vno);
			ps.setString(2, vpwd);
			int res = ps.executeUpdate();
			
			if(res == 1)
			{
				System.out.println(res);
				return 1;
			}
			return 2;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("dao 삭제 에러"+e);
		}
	   return 3;
	}
}

