package day04;

public class Ex03 {
/*
 	문제 3]
 		2X + 4Y = 10의 방적싱의 결과를 출력하세요.
 		단, X, Y는 모두 0부터 10사이의 정수이다.
 */
	public static void main(String[] args) {
		System.out.println("2X + 4Y = 10");
		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				int bang = (2*x)+(4*y);
				if (bang == 10) {
					
					System.out.println("X = " + x + " Y = " + y );
					
				}
				
			}
			
		}
		
	}

}
