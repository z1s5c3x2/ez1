package java1.day11.Ex5디자인패턴2.controller;

import java1.day11.Ex5디자인패턴2.model.dao.MemberDao;
import java1.day11.Ex5디자인패턴2.model.dto.MemberDto;

public class MemberController { // 기능처리(로직) 담당하는 클래스 // controller -> java
	
	// 1. 싱글톤 생성 [ private static ]
	private static MemberController memberController = new MemberController();
	// 2. 외부로부터 싱글톤 호출할수 있도록 get~
	public static MemberController getInstance() {return memberController;}
	// 3. 외부에서 객체 생성 차단 위한 생성자 잠금
	private MemberController() {}
	
	public boolean signupLogic(String id , String password , String name , String phone, int age) {
		MemberDto m = new MemberDto(id,password,name,phone,age);
		for(int i = 0; i<MemberDao.memberList.length; i++) {
			if(MemberDao.memberList[i] == null) {
				MemberDao.memberList[i] = m; return true;
			
			}
		} // for end
		return false;
	}
	public String loginLogic(String id , String password) {
		//System.out.println(MemberDao.memberList[0]);
		
		for(int i = 0; i<MemberDao.memberList.length; i++) {
			if(MemberDao.memberList[i] !=null 
					&& MemberDao.memberList[i].getPassword().equals(password)
					&& MemberDao.memberList[i].getId().equals(id)) {
	
				return MemberDao.memberList[i].getName();
			}
		}
		return null;
	}
	public String findIdLogic(String _name, String _pn) {
		for(int i = 0; i<MemberDao.memberList.length; i++) {
			if(MemberDao.memberList[i] !=null 
					&& MemberDao.memberList[i].getPhone().equals(_pn)
					&& MemberDao.memberList[i].getName().equals(_name)) {
	
				return MemberDao.memberList[i].getId();
			}
		}
		return null;
	}
	public String findPwLogic(String _id,String _pn) {
		for(int i = 0; i<MemberDao.memberList.length; i++) {
			if(MemberDao.memberList[i] !=null 
					&& MemberDao.memberList[i].getId().equals(_id)
					&& MemberDao.memberList[i].getPhone().equals(_pn)) {
	
				return MemberDao.memberList[i].getPassword();
			}
		}
		return null;
		
	}
}
