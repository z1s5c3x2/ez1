package 복습.part7.Model.dto;

public class MemberDto {
//- 필드는  아이디 , 비밀번호 , 이름 , 전화번호 , 나이
    private String id,pwd,name,pn;
    private int age;
	public MemberDto(String id, String pwd, String name, String pn, int age) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.pn = pn;
		this.age = age;
	}
    public MemberDto(){}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPn() {
		return pn;
	}
	public void setPn(String pn) {
		this.pn = pn;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
