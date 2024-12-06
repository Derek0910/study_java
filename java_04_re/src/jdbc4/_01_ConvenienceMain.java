package jdbc4;

public class _01_ConvenienceMain {
	public static void main(String[] args) {
		_01_ConvenienceImpl cdao = _01_ConvenienceImpl.getInstance();
		_01_ItemDTO idto = new _01_ItemDTO();
		
		int regCnt = cdao.itemReg(idto);
		
		if (regCnt==1) {
			System.out.println("아이템 등록에 성공하셨습니다.");
		} else {
			System.out.println("아이템 등록에 실패하셨습니다!!!!!!");
		}
		
	}
}
