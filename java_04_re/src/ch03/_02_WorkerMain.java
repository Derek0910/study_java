package ch03;

public class _02_WorkerMain {
	public static void main(String[] args) {
		_02_Worker com = new _02_Worker();
		
		com.setCompany("DtotheBE");
		com.setEstablish(2025);
		com.setBusiness("은행보안관리");
		com.setWorker(200);
		
		com.showInfo();
	}
}
