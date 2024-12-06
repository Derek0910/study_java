package test;

public class _Ex_11_1_Imp implements _Ex11_1 {
	@Override
	public double times(double a, double b, double c) {
		double aa = a * b * c;
		return aa;
	}
	
	@Override
	public double div(double a, double b, double c) {
		double aa = a / b / c;
		return aa;
	}

}
