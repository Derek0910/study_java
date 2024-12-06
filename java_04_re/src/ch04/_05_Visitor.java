package ch04;

public class _05_Visitor {
	int workDay = 0;
	int salesDay;
	int visitor;
	
	static int workDay2 = 0;
	
	
	public _05_Visitor() {
		workDay2++;
		this.salesDay = (workDay2-1);
	}
	
	
	public int getSalesDay() {
		return salesDay;
	}
	
	public void setSalesDay(int salesDayM) {
		this.salesDay = salesDayM;
	}
	
	public int getVisitor() {
		return visitor;
	}
	
	public void setVisitor(int visitorM) {
		this.visitor = visitorM;
	}
	
	
}
