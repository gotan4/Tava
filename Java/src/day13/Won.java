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
		System.out.println((n+1) + " ] �������� < " + rad + " > �� ���� ���̴� [ " + area + " ] �Դϴ�." );
	}

}
