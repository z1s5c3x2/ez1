package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbc연동 {
	public static void main(String[] args)
	{
			//Class.forName("oracle.jdbc.OracleDriver");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb4web","root","1234");
			System.out.println(conn);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
}
