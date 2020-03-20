package day09;

/*
	숫자(정수) 두개를 입력하면 
	두 숫자를 산술연산해주는 함수들을 만들고
	실행을 해서
	변수에 기억하고
	변수를 출력하는 프로그램을 작성하세요.
 */
public class Test02 {
	
	public Test02() {
		// 함수의 반환값을 변수에 담아서 
		int gap1 = plus(3,7);
		int gap2 = minus(6, 7);
		int gap3 = namuji(7, 7);
		int gap4 = gop(1000, 2000);
		int gap5 = nanugi(1, 1);
		
		// 출력한다.
		System.out.println("plus(3, 7) : " + gap1);
		System.out.println("minus(6, 7) : " + gap2);
		System.out.println("namuji(7, 7) : " + gap3);
		System.out.println("gop(1000, 2000) : " + gap4);
		System.out.println("nanugi(1, 1) : " + gap5);
	}
	
	// 더하기 연산
	public int plus(int no1, int no2) {
		int sum = no1 + no2;
		return sum;
	}
	
	// 빼기 연산
	public int minus(int no1, int no2) {
		int result = no1 - no2;
		return result;
	}
	
	// 나머지 연산
	public int namuji(int no1, int no2) {
		int result = no1 % no2;
		return result;
	}
	
	// 곱하기 연산
	public int gop(int no1, int no2) {
		int result = no1 * no2;
		return result;
	}
	
	// 나누기 연산
	public int nanugi(int no1, int no2) {
		int result = no1 /no2;
		return result;
	}
	
	public static void main(String[] args) {
		new Test02();
	}

}
