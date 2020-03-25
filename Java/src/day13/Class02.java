package day13;

public class Class02 extends Test01 {
	private int mitbyun;
	private int nopee;
	@Override
	public double calcArea(int... a) {
		mitbyun = a[0];
		nopee = a[1];	
		return mitbyun * nopee * 0.5;
	}

}
