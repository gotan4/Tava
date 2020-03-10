package day01;

public class Ex01 {
	/*
	 	1. 5, 10, 20 을 제외한 숫자하나를 가정하고 (양수, 음수 모두)
	 	이것을 2진수로 바꿔보고
	 	실제프로그램의 결과와 일치하는지 확인하세요.
	 --------------------------------------------------------
	 
	 	2. 반지름이 7인 원의 넓이, 둘레를 계산해서 출력하세요.
	 		원의 둘레 : 2*반지름 * 3.14
	 		원의 넓이 : 반지름 * 반지름* 3.14
	 		단, 반지름, 둘레, 넓이는 변수를 만들어서 처리를 하세요
	 		둘레는 flot 타입의 변수로 만드세요
	 		
	 	3. 두개의 숫자(정수) 변수에 담고
	 		두수를 가로, 세로로 하는 사각형의 넓이를 구하세요.
	 	4. 3번문제에 두수를 밑변과 높이로 가지는 삼각형의 넓이를 구하세요
	 	5. 54232원을 지불해야한다.
	 		우리나라에 화폐로 각 단위가 몇개나 필요한지 계산해서 출력하세요.
	 숙제] 1년은 365.2426일이다.
	 		이 날짜는 과연 몇일 몇시간, 몇분, 몇초인지 계산해서 출력하세요.
	 		 */
	public static void main(String[] args) {
		System.out.println("2 : " + Integer.toBinaryString(2));
		System.out.println("3 : " + Integer.toBinaryString(3));
		System.out.println("6 : " + Integer.toBinaryString(6));
		System.out.println("11 : " + Integer.toBinaryString(11));
		System.out.println("21 : " + Integer.toBinaryString(21));
		
		int rad = 7;
		double pi = 3.14;
		System.out.println("원의 넓이는 : " + 2*rad*pi);
		System.out.println("원의 둘레는 : " + (float)(rad*rad*pi));
		
		int garo = 3;
		int sero = 4;
		System.out.println("사각형의 넓이는 : " + garo*sero);
		System.out.println("삼각형의 넓이는 : " + garo*sero/2); 
		
		int don = 54232;
		int man = 10000;
		int chen = 1000;
		int bek = 100;
		int sip = 10;
		int ill = 1;
		System.out.println("만원권 : " + don/man);
		System.out.println( don );
		
		
		
	}

}
