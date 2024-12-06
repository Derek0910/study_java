package jdbc4;

public interface _01_ConvenienceDAO {
	public int itemReg(_01_ItemDTO idto);
	public _01_ItemDTO itemSelect(_01_ItemDTO idto);
	public int itemDelete(_01_ItemDTO idto);
	public _01_OrderDTO itemOrder(_01_OrderDTO iodto);
}
