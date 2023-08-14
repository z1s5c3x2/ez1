package 과제.과제11.model.dto;
public class MessageDto {

    private int meno;
    private String meseid;
    private String mereid;
    private String mecontent;
    private String medate;
    
    
   

	public MessageDto(int meno, String meseid, String mereid, String mecontent,String medate) {
		super();
		this.meno = meno;
		this.meseid = meseid;
		this.mereid = mereid;
		this.mecontent = mecontent;
    this.medate = medate;
	}

	@Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    
    public int getMeno() {
      return this.meno;
    }
    public void setMeno(int value) {
      this.meno = value;
    }

    public String getMeseid() {
      return this.meseid;
    }
    public void setMeseid(String value) {
      this.meseid = value;
    }

    public String getMereid() {
      return this.mereid;
    }
    public void setMereid(String value) {
      this.mereid = value;
    }

    public String getMecontent() {
      return this.mecontent;
    }
    public void setMecontent(String value) {
      this.mecontent = value;
    }

    public String getMedate() {
      return this.medate;
    }
    public void setMedate(String value) {
      this.medate = value;
    }
}
