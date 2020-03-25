package day13;

/*
 	이 클래스는 사각형의 정보를 기억할 클래스
 	
 */
public class Class01 extends Test01 {
	private int garo;
	private int sero;
	
	@Override
	public double calcArea(int... a) {
		garo = a[0];
		sero = a[1];
		return garo*sero;
	}

}
