package day14;
/*
 문제2]
	삼각형 클래스를 작성하고
	
	삼각형 클래스의 밑변과 높이를 입력해서 객체를 만들도록 작성하고 
	만약 밑변이 같으면 같은 삼각형이 되도록
	equals 함수를 오버라이드 하고
	테스트 하세요.	
	
	입력은 JOptionPane 소속의 함수로 처리하고
	출력도 같은 소속의 함수로 처리하세요.
	추가로 예외처리도 해주세요.
		
 */
public class Tri {
	private int mit;
	private int nop;
	private double area;
	

	public Tri(int mit, int nop) {
		this.mit = mit;
		setArea();
		
	}
	
	public void setArea() {
		area = mit * nop * 0.5;
	}
	public double getArea() {
		return this.area;
		
	}
	public boolean equals(Object obj) {
		boolean bool = false;
		
		Tri t = (Tri) obj;
		
		bool = (this.area == t.area) ? true : false;
		// 결과 반환해주고....
		return bool;
		
	}
	public toString() {
		
	}
	
		
}
