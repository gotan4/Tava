package day04;
/*
	(중첩된 반복문으로 처리
  	2~100 사이의 수중 소수만 출력해주는 프로그램을 작성하세요.
  	
 */
public class Hw03 {
	
	public static void main(String[] args) {
		int ge = 0;
		loop:
		for (int i = 2; i < 100; i++) {
			for (int j = 2; j < i; j++) {
				
				if (i%j == 0) {
				
					continue loop;
					
				}
				
			}
			/*
			 	 위의 반복문이 정상적으로 끝까지 반복처리가 됬다면 이 행을 실행할 것이고
			 	 그 말은 나눌수 있는 수가 없다는 말이므로
			 	 이 수(i)는 소수일 것이다.
			 	 
			 	 그러면 소수를 출력만 하면 될 것이다.
			 */
			System.out.println(i + ",");
			ge++;
		}
		System.out.println(ge);
	}
}