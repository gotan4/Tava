package day13;

public class Test03 {
	int no = 100;
	
	static class Cls01{// Top Level Inner Class
		
	}
	
	class Cls02{
		int num = no;
	}
	public Test03() {
		hw(new Inter01() {
			public void toPrint() { // 무명 내부 클래스
				System.out.println("***여기는 익명 내부 클래스***");
			
			}
		});
		
		
		abc();
	}
	
	public void abc() {
		int b = 10;
		
		class Cls03{
			int c = 100;
			public void xyz() {
				System.out.println("^^^^^^^^^^^^^^^^^^");
			}
		}
	Cls03 c3 = new Cls03();
	
	c3.xyz();
	}
	public static void main(String[] args) {
		new Test03();
	}
// 클래스 블럭 내에 만들어지는 클래스를 내부클래스라고 한다.
	public void hw(Inter01 i) {
		i.toPrint();
	}
}

class Test03_01{ //외부클래스
	
}