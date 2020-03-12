package day04;

public class Ex02 {
/*
 	문제2]
 	두 개의 주사위를 던져서 합이 6이 되는 경우를 출력하세요.
 */
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j < 6; j++) {
				sum = i+j;
				if (sum == 6) {
					System.out.println(i +  "+" +  j+ "="+ sum );
					
				}
				
			}
		}
		
		// TODO Auto-generated method stub

	}

}
