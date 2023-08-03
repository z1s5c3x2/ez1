package 복습.part7.Controller;

import 복습.part7.Model.dao.MemberDao;
import 복습.part7.Model.dto.MemberDto;
public class MemberController {
    private static MemberController instance = new MemberController();

	public static MemberController getInstance() {return instance;}
	private MemberController() {}

    public boolean createMember(MemberDto m)
    {
        for(int i=0;i<MemberDao.mem.length;i++)
        {
            if(MemberDao.mem[i] == null)
            {
                MemberDao.mem[i] = m;
                return true;
            }
        }
        return false;
    }
    public boolean loginMember(String id,String pwd)
    {
         for(int i=0;i<MemberDao.mem.length;i++)
        {
            if(MemberDao.mem[i] == null)
            {
                
                return false;
            }
            if(MemberDao.mem[i].getId().equals(id) && MemberDao.mem[i].getPwd().equals(pwd))
            {
                return true;
            }
        }
        return false;
    }
}

