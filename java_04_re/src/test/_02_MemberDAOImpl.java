package test;

// 인터페이스를 구현하는 클래스
// 구현하되, 싱글톤 작성
public class _02_MemberDAOImpl implements _02_MemberDAO{

	// 싱글톤 작성
	private _02_MemberDAOImpl(){};
	
	static _02_MemberDAOImpl instance = new _02_MemberDAOImpl();
	
	public synchronized static _02_MemberDAOImpl getInstance() {
		if(instance==null) {
			instance = new _02_MemberDAOImpl();
		}
		return instance;
	}
	
	// 재정의
	@Override
	public void login(String id, String password) {
		System.out.println(id + "님이 로그인에 성공하였습니다.");
	}
	
	@Override
	public void memberInsert(_02_MemberDTO dto) {
//		System.out.println(dto + "님 회원가입 성공");
		System.out.println(dto.getId());
		dto.getPassword();
		dto.getGender();
		dto.getEmail();
		dto.getAddress();
		// 여기서 SQL문을 통해서 데이터를 전송한다?
	}
	
	@Override
	public void memberUpdate(_02_MemberDTO dto) {
		dto.getId();
		dto.getPassword();
		dto.getGender();
		dto.getEmail();
		dto.getAddress();
		System.out.println(dto + "님 회원수정 성공");
	}
	
	@Override
	public void memberDelete(String id) {
		System.out.println(id + "님 회원삭제 성공");
	}
	
	@Override
	public void memberSelect(String id) {
		System.out.println(id + "님 회원조회");
	}
}
