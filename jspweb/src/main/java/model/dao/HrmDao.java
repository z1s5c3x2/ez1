package model.dao;

import java.util.ArrayList;

import model.dto.HrmDto;

public class HrmDao extends Dao{
	private static HrmDao instance = new HrmDao();
	public static HrmDao getInstance() { return instance; }  
	private HrmDao() {}
	
	public boolean signup(String hname,String hphone,String himg,String hrank)
	{
		try {
			String sql = "insert into hrm (hname,hphone,himg,hrank) VALUES(?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, hname);
			ps.setString(2, hphone);
			ps.setString(3, himg);
			ps.setString(4, hrank);
			return (ps.executeUpdate() == 1) ? true : false;
					
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("가입 에러");
		}
		
		return false;
	}
	public ArrayList<HrmDto> loadHrm()
	{
		ArrayList<HrmDto> res = new ArrayList<>();
		try {
			String sql = "select * from hrm";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next())
			{
				res.add(new HrmDto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
			}
			return res;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("호출 에러");
		}
		
		return null;
		
	}
}
