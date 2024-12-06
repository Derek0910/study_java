package jdbc4;

public class _01_OrderDTO {
	_01_ItemDTO idto = new _01_ItemDTO();
	private int itmeno;
	String itemname = idto.getItemname();
	int item_quantity = idto.getItem_quantity();
	String manufacturer = idto.getManufacturer();
	private int order_quantity;
	private int minimum_order;
}
