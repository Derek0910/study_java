package jdbc4;

public class _01_ItemDTO {
	private int itmeno;
	private String itemname;
	private int item_quantity;
	private String manufacturer;

	public int getItmeno() {
		return itmeno;
	}
	
	public void setItmeno(int itmeno) {
		this.itmeno = itmeno;
	}
	
	public String getItemname() {
		return itemname;
	}
	
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	
	public int getItem_quantity() {
		return item_quantity;
	}
	
	public void setItem_quantity(int item_quantity) {
		this.item_quantity = item_quantity;
	}
	
	public String getManufacturer() {
		return manufacturer; 
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
}
