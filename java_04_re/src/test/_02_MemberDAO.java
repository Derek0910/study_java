package test;

public interface _02_MemberDAO {
	public void login(String id, String password);
	
	public void memberInsert(_02_MemberDTO dto);
	
	public void memberUpdate(_02_MemberDTO dto);
	
	public void memberDelete(String id);
	
	public void memberSelect(String id);
}
