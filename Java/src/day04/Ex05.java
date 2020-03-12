package day04;

/*
	문제 5]
		
		1 - 2 + 3 - 4 + 5 - 6 .....
		홀	짝	홀	짝	홀	짝
		
		이렇게 계산을 할 경우 결과값이 100이 넘어가는 처음 숫자는 몇인지 
		결과값과 함께 출력하세요.
 */
public class Ex05 {

	public static void main(String[] args) {
		
		int giho = -1;
		int sum = 0;
		for(int i = 1 ; ; i++ ) {
			giho *= -1;
			sum += giho * i;
			if(sum > 100) {
				System.out.print(i + " 일때 처음 100이 넘어서고 합계는 " + sum);
				break;
			}
		}
	}

}
