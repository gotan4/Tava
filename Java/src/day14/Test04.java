package day14;

import javax.swing.JOptionPane;

public class Test04 extends Test03 {
	// getNum()의 기능을 수정을 해보자.
	// 입력받은 숫자에 10을 곱한 정수를 반환해주도록 오버라이드 해조바.
	/*
	 	오버라이드 규칙]
	 		0. 상속을 받아야 한다.
	 		1. 함수의 원형을 유지한다.
	 		2. 접근지정자는 같거나 넓은 방향으로....
	 		3. 예외처리는 같거나 좁은 방향으로...
	 */
	public int getNum() throws NumberFormatException, Exception {
		// 반환값 담을 변수 선언 및 초기화
		int num = 0 ;
		
		// 숫자를 입력받아서 문자열로 담고
		String sno = JOptionPane.showInputDialog("숫자입력하세요!");
		
		// 문자열을 정수로 변환하고
		num = Integer.parseInt(sno);
		//음수일 경우 강제로 예외를 발생시키낟.
		if(num < 0) throw new NumberFormatException(); 
			return num* 10;
	}
	public static void main(String[] args) {
		new Test04();
	}

}
