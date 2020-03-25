package day13;

public class Nemo extends Figure {//Figure 클래스가 상위 클래스
	
	private int width;
	private int height;
	private double area;
	
	@Override
	public double getArea(int...val) {
		width = val[0];//val 배열의 첫번째 방에 width를 넣는다.
		height = val[1];//val 배열의 두번째 방에 height를 넣는다.
		area = width * height;// area에 연산을 넣는다.
		return area;
	}
	
	@Override
	public void toPrint(int n) {//출력문
		System.out.println((n+1) + " ] 가로 : " + width + " , 세로 : " + height + " 인 사각형의 넓이는 " + area + " 입니다." );
	}

}
