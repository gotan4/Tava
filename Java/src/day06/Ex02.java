package day06;

/*
	문제 2] 
		'A' ~ 'J' 문자를 랜덤하게 100개 발생시킨 후	- 문자 배열 1개
		각 문자의 카운트를 구해서(숫자) 출력하세요.		- 정수 배열 1개
		
		추가로 숫자만큼 별표(*)를 찍어서 출력하세요.
 */
public class Ex02 {

	public static void main(String[] args) {
		// 문자배열
		char ch[] = new char[100];
		// 카운트 수를 저장할 정수 배열 
		int[] cnt = new int[10];
		
		for(int i = 0 ; i < 100 ; i++ ) {
			// 'A' ~ 'J' 까지 문자 100개를 랜덤하게 만들고
			char tmp = (char)(Math.random()*('J' - 'A' + 1) + 'A'); 
			// ch배열에 차곡차곡 넣고
			ch[i] = tmp;
		}
		
		// 만들어진 문자배열에서 각 문자가 저장된 카운트를 올려준다.
		for(int i = 0 ; i < 100; i++ ) {
			int idx = ch[i] - 'A';
			
			cnt[idx] += 1;
		}
		
		for(int i = 0 ; i < 10 ; i++ ) {
			System.out.printf("%3s : ", (char)('A' + i));
			for(int j = 0 ; j < cnt[i] ; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
