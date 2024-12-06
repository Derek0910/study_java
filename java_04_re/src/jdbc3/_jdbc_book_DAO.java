package jdbc3;

public interface _jdbc_book_DAO {
	public int bookRent(int bookno);
	public int bookReg(_jdbc_book_DTO jdto);
	public int bookUpdate(_jdbc_book_DTO jdto);
	public _jdbc_book_DTO bookSelect(_jdbc_book_DTO jbdto);
	public int bookDelete(_jdbc_book_DTO jdto);
}
