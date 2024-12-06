package book;

public interface _01_bookDAO {
	public void bookNo(int bookno);
	public void bookTitle(String booktitle);
	public int bookInsert(_01_bookDTO bdto);
	public int bookUpdate(_01_bookDTO bdto);
	public void bookDelete(_01_bookDTO bdto);
}
