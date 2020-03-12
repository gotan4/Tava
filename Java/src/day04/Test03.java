package day04;


/*
	예제]
		구구단 전체를 출력하세요.
 */
public class Test03 {

	public static void main(String[] args) {
		for(int i = 0; i < 8 ; i++) {
			for(int j = 0; j < 9; j++) {
				System.out.println((i+2) + " x " + (j+1) + " = " + ((i+2) * (j+1)));
			}
			System.out.println("**********");
			
		}
	}

}
