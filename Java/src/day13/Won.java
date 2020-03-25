package day13;

public class Won extends Figure {
	private int rad;
	private double area;
	
	@Override
	public double getArea(int...val) {
		rad = val[0];
		area = rad * rad * 3.14;
		return area;
	}

	@Override
	public void toPrint(int n) {
		System.out.println((n+1) + " ] 반지름이 < " + rad + " > 인 원의 넓이는 [ " + area + " ] 입니다." );
	}

}
