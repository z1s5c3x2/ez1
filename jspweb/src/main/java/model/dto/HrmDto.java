package model.dto;


public class HrmDto {
	
    private int hno;
    private String himg;
    private String hname;
    private String hphone;
    private String hrank;
    private String hdate;
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getHimg() {
		return himg;
	}
	public void setHimg(String himg) {
		this.himg = himg;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getHphone() {
		return hphone;
	}
	public void setHphone(String hphone) {
		this.hphone = hphone;
	}
	public String getHrank() {
		return hrank;
	}
	public void setHrank(String hrank) {
		this.hrank = hrank;
	}
	public String getHdate() {
		return hdate;
	}
	public void setHdate(String hdate) {
		this.hdate = hdate;
	}
    public HrmDto() {
		// TODO Auto-generated constructor stub
	}
	public HrmDto(int hno, String himg, String hname, String hphone, String hrank, String hdate) {
		super();
		this.hno = hno;
		this.himg = himg;
		this.hname = hname;
		this.hphone = hphone;
		this.hrank = hrank;
		this.hdate = hdate;
	}
	public HrmDto(String himg, String hname, String hphone, String hrank) {
		super();
		this.himg = himg;
		this.hname = hname;
		this.hphone = hphone;
		this.hrank = hrank;
	}


	
}
