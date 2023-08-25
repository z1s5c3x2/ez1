package model.dto;

import java.sql.Date;

public class AccountbookDto {
    private int ano;
    private String atext;
    private int anumber;
    private String adate;
    public AccountbookDto() {
		// TODO Auto-generated constructor stub
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getAtext() {
		return atext;
	}
	public void setAtext(String atext) {
		this.atext = atext;
	}
	public int getAnumber() {
		return anumber;
	}
	public void setAnumber(int anumber) {
		this.anumber = anumber;
	}
	public String getAdate() {
		return adate;
	}
	public void setAdate(String adate) {
		this.adate = adate;
	}
	public AccountbookDto(int ano, String atext, int anumber, String adate) {
		super();
		this.ano = ano;
		this.atext = atext;
		this.anumber = anumber;
		this.adate = adate;
	}
	public AccountbookDto( String atext, int anumber, String adate) {
		super();
		this.atext = atext;
		this.anumber = anumber;
		this.adate = adate;
	}
    
}
