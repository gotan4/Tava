package day13;
// 추상클래스
public abstract class Figure {
	public abstract double getArea(int...val);
	// getArea 배열 생성
	public void toPrint(int n) {//toPrint 구문
		System.out.println("### 여기는 Figure Class ###");
	};
}
