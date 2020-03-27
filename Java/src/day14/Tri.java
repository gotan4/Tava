package day14;

public class Tri {
	// 이 클래스가 기억할 정보 저장 변수
	private int width, height;
	private double area;
	
	// 기본 생성자 함수
	public Tri() {}
	
	// 생성자 함수 오버로딩
	public Tri(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	// 면적 구해서 입력하는 함수
	public void setArea() {
		area = width * height * 0.5;
	}
	
	public double getArea() {
		return area;
	}
	
	// 이 클래스의 정보를 문자열로 반환해주는 toString() 오버라이딩
	public String toString() {
		return "\t\t밑변 : " + width + "\n\t\t높이 : " + height + "\n\t\t넓이 : " + area + "\n인 삼각형\n";
	}
	
	// 이 클래스가 밑변이 같으면 같은 객체로 판단해주는 기능의 equals 함수 오버라이딩
	public boolean equals(Object obj) {
		return this.width == ((Tri) obj).width;
	}
}