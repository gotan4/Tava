package day04;
/*
	(중첩된 반복문으로 처리
  	2~100 사이의 수중 소수만 출력해주는 프로그램을 작성하세요.
 */
public class Hw03 {

	public static void main(String[] args) {
		for (int i = 2; i < 100 ; i++) {
			if (i%i == 0) {
				System.out.println(i);
			}
			
			
		}

	}

}
