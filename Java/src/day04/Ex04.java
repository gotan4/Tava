package day04;

/*
	문제 4]
		5자리 정수를 입력받아서
		그 숫자가 회문수인지 아닌지 판별해서 출력하세요.
		
		회문수란?
			앞에서 읽으나 뒤에서 읽으나 똑같은 수를 회문수라 한다.
			예]
				12321	- 회문수
				
				12312	- 회문수가 아님
				
	참고]
		문자열.charAt(위치값) - 문자열의 특정위치의 문자를 반환해주는 함수
		문자열.toCharArray() - 문자열을 문자배열로 반환해주는 함수
		
	반복문 제어 명령]
		
		1. break	- 반복문 또는 switch 문을 종료시키는 명령
		
		2. continue	- 반복문을 다시(다음 회차)로 진행시키는 명령
		
			for( 1 ; 2 ; 3 ){
				4
				continue;
				5
			}
			
			순서 : 1 -> 2 -> 4 -> 3 -> 2 -> 4 -> ...
			
			while( 1 ) {
				2
				continue;
				3
			}
			
			순서  : 1 -> 2 -> 1 -> 2 -> 1 -> ...
 */

import java.util.*;
public class Ex04 {

	public static void main(String[] args) {
		// 입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
		// 메세지 출력하고
		System.out.print("다섯자리 숫자를 입력하세요! : ");
		
		// 결과값을 담을 변수를 만든다.
		String msg = "회문수 ] ";
		// 문자열로 입력받고 변수에 담고
		String str = sc.nextLine();
		
		if(str.equals("q")) break;
		/*
			블럭 안의 내용이 명령문 하나일 경우는 
			블럭기호({}) 를 생략하고 명령문을 바로 기술할 수도 있다.
		 */
		// 반복해서 비교하고 ( 12321 ) -> 1, 2
		for(int i = 0 ; i < str.length() / 2 ; i++ ) {
			// 문자열중 문자를 첫 문자부터 꺼내서 뒤에서부터 문자와 비교한다
			if(str.charAt(i) != str.charAt((str.length() - 1) - i)) {
				// 이 경우는 두 문자가 다른 경우이므로 회문수가 아닌 경우다.
				msg = "회문수 ]가 아니";
				break;
			}
			// 이 경우는 두문자가 같은 경우이므로 다음 문자를 꺼내서 비교해야 겠다.
		}
		// 결과 출력하고
		System.out.println("입력한 숫자 [ " + str + " ] 는 [ " + msg + "다." );
		}
	}

}
