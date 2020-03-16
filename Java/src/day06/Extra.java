package day06;

/*
	extra ]
		1, 1,...
		로 시작하는 피보나치 수열을 10개를 출력하세요.
		
		참고]
			피보나치 수열 :
				앞의 두 수를 더한값들의 집합...
				
				1, 1, 2, 3, 5, ..
 */
public class Extra {

	public static void main(String[] args) {
		int jagn = 1;
		int kn = 1;
		System.out.print(jagn + ", " + kn + ", ");
		for(int i = 0 ; i < 8; i++) {
			int result = jagn + kn;
			jagn = kn;
			kn = result;
			System.out.print( kn + ", ");
		}
	}

}
