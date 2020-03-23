package day11;

public class Test03 {
	int no1 = 10; // 1. 명시적 초기화
	int no2;
	static int no3;
	int no4;
	
	{
		no2 = 20; // 2. 초기화 블럭을 이용한 초기화
	}
	
	static {
		no3 = 30; //3. static 블럭을 이용한 초기화
//		no2 = 40;
	}
	public Test03() {
		this.no4 = 50;
		System.out.println("no1: " + no1);
		System.out.println("no2: " + no2);
		System.out.println("no3: " + no3);
		System.out.println("no4: " + no4);
	}
	public static void main(String[] args) {
		new Test03();
	}

}
