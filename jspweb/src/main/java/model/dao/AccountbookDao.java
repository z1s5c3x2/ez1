package model.dao;

import java.util.ArrayList;

import model.dto.AccountbookDto;

public class AccountbookDao extends Dao {
	private static AccountbookDao instance = new AccountbookDao();
	public static AccountbookDao getInstance() { return instance; }
	private AccountbookDao() {}
	
	public boolean bookupdate(int ano,String atext,int aprice)
	{
		try {
			String sql  = "update accountbook set atext = ? , anumber = ? where ano = ? ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, atext);
			ps.setInt(2, aprice);
			ps.setInt(3, ano);
			int res = ps.executeUpdate();
			if(res ==1)
			{
				return true;
			}
			return false;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("수정 오류"+e);
			return false;
		}
		
	}
	public ArrayList<AccountbookDto> loadList()
	{
		ArrayList<AccountbookDto> ret = new ArrayList<>();
		
		try {
			String sql = "select * from accountbook";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next())
			{
				ret.add(new AccountbookDto(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4)));
				
			}
			return ret;
				
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("모든 항목 불러오기 에러"+e);
		}
		return null;
	}
	public boolean inputbook(AccountbookDto _dto) 
	{
		try {
			String sql = "insert into accountbook(atext,anumber,adate) VALUES(?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, _dto.getAtext());
			ps.setInt(2, _dto.getAnumber());
			ps.setString(3, _dto.getAdate());
			int res = ps.executeUpdate();
			if(res ==1)
			{
				return true;
			}
			return false;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("인풋 에러"+e);
		}
		return false;
	}
	public boolean deleteboook(int ano)
	{
		try {
			String sql ="delete from accountbook where ano = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, ano);
			int res = ps.executeUpdate();
			if(res ==1)
			{
				return true;
			}
			return false;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("삭제 에러"+e);
			return false;
		}
	}
}
