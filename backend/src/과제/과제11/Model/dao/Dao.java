package 과제.과제11.Model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
    public Connection conn;
    public PreparedStatement ps;
    public ResultSet rs;

    protected Dao()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb4web","root","1234");    
            System.out.println("연결성공");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        
    }

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	public PreparedStatement getPs() {
		return ps;
	}

	public void setPs(PreparedStatement ps) {
		this.ps = ps;
	}

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}
    
}
