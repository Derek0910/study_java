package jdbc2;

public interface _02_MemberDAO_part2 {
	public int memberLogin(_02_MemberDTO_part2 dto_p2);
	
	public int memberInsert(_02_MemberDTO_part2 dto_p2);
	
	public int memberUpdate(_02_MemberDTO_part2 dto_p2);
	
	public _02_MemberDTO_part2 memberSelect(String id);
	
	public int memberDelete(String id);

}
