package jdbc;

public interface _02_MemberDAO2 {
	public String login(String id, String password);
	
	public int memberInsert(_02_MemberDTO2 mdto2);
	
	public int memberUpdate(_02_MemberDTO2 mdto2);
	
	public void memberDelete(String id);
	
	public _02_MemberDTO2 memberSelect(String id);
}
