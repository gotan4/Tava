package day18;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Properties;

/*
	문제 2]
		학생의 이름, 번호, 반, 국어, 영어, 수학, 총점, 평균
		을 저장할 VO 클래스를 만들고
		
		5학생의 데이터를 입력해서 관리할 Set을 만들어서
		이름 순으로 출력하세요.
		
 */
public class Ex02 {
	public Ex02() {
		String[] arr = {"이한철", "이진수", "손은진", "김종형", "서동혁"};
		ArrayList<String> student = (ArrayList<String>)Arrays.asList(arr);
	
			
		
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
