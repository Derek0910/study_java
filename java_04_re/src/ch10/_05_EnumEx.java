package ch10;

enum Vege{Mush, Lettuce, Chicory}

public class _05_EnumEx {
	private Vege kind;
	private String name;
	
	public _05_EnumEx () {};
	
	public _05_EnumEx(Vege kind, String name) {
		this.kind = kind;
		this.name = name;
	};
	
	public String getVege() {
		return kind + " : " + name;
	}
	
	public void setVege(Vege kind, String name) {
		this.kind = kind;
		this.name = name;
	}
	
}
