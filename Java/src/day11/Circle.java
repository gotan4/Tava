package day11;

/*
	문제 1]
		이 클래스는 원의 정보를 저장할 클래스이다.
		이 클래스 객체가 될 때 
		반지름을 입력받아서 원의 대한 정보가 입력이 되게 
		클래스를 정의 하세요.
		
		반지름이 입력이 안 될 경우는 10으로 입력되게 하세요.
 */
public class Circle {
	// 이 클래스는 원의 대한 정보를 기억하는 클래스이므로
	// 반지름, 둘레, 넓이를 기억하면 될것이다.
	int rad;
	double arround, area;
	
	// 기본 생성자 함수
	public Circle() {
		this(10);
	}
	
	// 생성자함수 오버로딩
	public Circle(int rad) {
		this.rad = rad;
		this.arround = getArround(rad);
		this.area = getArea(rad);
	}
	
	// 원의 둘레 구해주는 함수
	public double getArround(int rad) {
		return 2 * rad * 3.14;
	}
	
	// 원의 넓이 구해주는 함수
	public double getArea(int rad) {
		return rad * rad * 3.14;
	}
	
	// 출력하는 기능의 함수
	public void toPrint() {
		System.out.printf("반지름 : %5d | 원의둘레 : %7.2f | 원의 넓이 | % 7.2f\n", rad, arround, area);
	}
}
