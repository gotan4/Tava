package day11;

public class Test02 {

	public static void main(String[] args) {
//		int no1 = getRandom(); //static 멤버 안에서는 static멤버와 메모리에 올려진 애들만 사용할 수 있다.
		
		// 꼭 사용해야 겠다면
		// 1. 사용할 함수를 멤버로 가지는 클래스의 객체를 만들어 준다.
		//	객체 = 참조변수 +  인스턴스'
		Test02 t1 = new Test02();
		int no1 = t1.getRandom();
		
		//static 멤버 호출
		int no2 = getTen();
		
		
	}
	public int getRandom() {
		int result = (int)(Math.random()*7+1);
		return result; 
	}
	public static int getTen() {
		return 10;
		
	}

}
