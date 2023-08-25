package model.dao;

import java.sql.PseudoColumnUsage;

import model.dto.MemberDto;

public class MemberDao extends Dao{
	private static MemberDao instance = new MemberDao();
	public static MemberDao getInstance() { return instance; }
	private MemberDao() {}
	
	public boolean signup(MemberDto dto)
	{
		try {
			String sql = "insert into member(mid,mpwd,memail,mimg) values(?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1,dto.getMid());
			ps.setString(2,dto.getMpwd());
			ps.setString(3,dto.getMemail());
			ps.setString(4,dto.getMimg());
			int row = ps.executeUpdate();
			if(row == 1)return true;
			
		} catch (Exception e) {
			System.out.println("에러"+e);
			// TODO: handle exception
		}

		return false;
	}
	public boolean findId(String mid)
	{
		try {
			String sql = "select * from member where mid = "+mid;
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			return rs.next();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("찾기에러"+e);
		}
		return false;
	}
}
