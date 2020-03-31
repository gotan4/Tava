package day17;

public class Sagak implements Comparable {
	private int width;
	private int height;
	private double area;
	
	public Sagak() {}
	
	public Sagak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}

	@Override
	public int compareTo(Object o) {
		// 이 함수는 Comparable  인터페이스가 가지고 있는 추상함수 이므로
		// 이 인터페이스를 구현해서 클래스를 제작하는 경우에는 
		// 반드시 이 함수를 오버라이드 해줘야 한다.
		// 이때 반환값이 음수인 경우는 정렬시 입력된 데이터와 자리를 바꾸어야 하고
		// ==> 매개변수로 입력되는 데이터가 더 크다.
		// 반환값이 0 인 경우는 같은 경우이다.
		// 반환값이 양수인 경우는 정렬시 입력된 데이터와 자리를 바꾸지 않는다.
		
		// Object 타입으로 입력된 데이터를 Sagak 타입으로 강제형변환을 해줘야 한다.
		Sagak s = (Sagak) o;
		
		double result = s.getArea() - this.getArea();
		
		return (int) -result;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getArea() {
		return area;
	}
	public void setArea() {
		this.area = width * height;
	}
	public void setArea(double area) {
		this.area = area;
	}

	
}
