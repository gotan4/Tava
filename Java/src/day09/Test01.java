package day09;

public class Test01 {
	int no;
	int[] arr;
	
	public Test01() {
		setNo(1004);
	}
	
	public static void main(String[] args) {
		new Test01();
	}
	
	public void setNo(int a) {
		// 이 함수의 기능은 멤버변수의 초기화다.
		// 이 함수의 실행의 결과는 변수 no에 데이터를 채워주는 것이고
		// 그 기능을 수행하면 이 함수의 목적은 달성이 됬다.
		// 따라서 내보내야할 데이터가 존재하는 것은 아니다.
		// 함수 내부에서 이 함수의 기능은 모두 달성되었다.
		no = a;
//		return;
	}
}
