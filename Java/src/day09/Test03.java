package day09;

/*
	1차원 배열에 
	'A' ~ 'E' 까지 초기화 해주는 함수를 제작해서
	전역변수 ch 에 초기화를 해주고
	
	대문자를 입력하면 소문자로 반환해주는 함수를 만들어서
	ch의 문자를 소문자로 모두 변경하세요.
	
	
	심화학습 ]
		
		문자배열을 입력하면
		문자배열을 'A' ~ 'E' 초기화해주는 기능을 가진 함수를 작성하고
		실행해서 출력하세요. 
 */
public class Test03 {
	char[] ch;
	
	public Test03() {
		setCh();
		
		for(char c : ch) {
			System.out.printf("%2c | ", c);
		}
		System.out.println();
		// 배열에 담긴 내용을 소문자로 변경해주자.
		for(int i = 0 ; i < ch.length ; i++ ) {
			char d = ch[i];
			char e = toSo(d);
			ch[i] = e;
		}
		
		// 출력
		for(char c : ch) {
			System.out.printf("%2c | ", c);
		}
		System.out.println();
		
		setCh();
		
		// 출력
		for(char c : ch) {
			System.out.printf("%2c | ", c);
		}
		System.out.println();
	}
	
	// 문자배열 초기화시키는 기능의 함수
	public void setCh() {
		ch = new char[5];
		for(int i = 0 ; i < 5 ; i++ ) {
			ch[i] = (char)('A' + i);
		}
	}
	
	// 대문자를 소문자로 반환해주는 함수
	public char toSo(char d) {
		char result = (char)(d + ('a' - 'A'));
		return result;
	}
	
	public static void main(String[] args) {
		new Test03();
	}

}
