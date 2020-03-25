package day13;

public class Semo extends Figure {
	private int width;
	private int height;
	private double area;
	@Override
	public double getArea(int...val) {
		width = val[0];
		height = val[1];
		area = width * height * 0.5;
		return area;
	}
	
	@Override
	public void toPrint(int n) {
		System.out.println((n+1) + " ] 밑변 : " + width + " , 높이 : " + height + " 인 삼각형의 넓이는 " + area + " 입니다." );
	}

}
