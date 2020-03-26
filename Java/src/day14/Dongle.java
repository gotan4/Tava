package day14;

public class Dongle {
	private int rad;
	private double arround, area;
		
	public Dongle(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}
	
	public void setArround() {
		arround = 2 * 3.14 * rad;
	}
	
	public void setArea() {
		area = 3.14 * rad *rad;
		
	}
	// area 는 접근지정자가 private 이고 이것은 클래스네에서만 
	// 접근이 가능 하므로 함수를 만들어서 데이터를 반환해주도록 하자.
	
	public double getArea() {
		return this.area;
	}
	// 이제 면적이 같으면 같은 원으로 판단되도록 equals 함수를 오버라이드 해보자
	public boolean equals(Object obj) {
		boolean bool = false;
		// 입력되는 Dongl 인스턴스는 오브젝트 타입으로 자동 형변환이 되서 기억이 될 것이므로
		// Dongl 타입으로 강제 형변환을 시켜서 멤버를 사용해야 겠다.
		Dongle d1 = (Dongle) obj;
		
		// 타입은 변환이 됬고 이제 면적을 꺼내서 비교해보자
		// 비교는 대상이 두개가 필요하다. 하나는 매개변수로 입력을 받았다. 그럼 하나는??
		bool = (this.area == d1.area) ? true : false;
		// 결과 반환해주고....
		return bool;
		
		
	}
}
