package day14;

import javax.swing.JOptionPane;

public class Test02 {

	public static void main(String[] args) {
		String sno = JOptionPane.showInputDialog("숫자를 입력하세요! " );
		
		int no = 0;
		
		try {
			System.out.println("*** 숫자 변환 전 ***");
			no = Integer.parseInt(sno);
			System.out.println("### 숫자 변환 후 ###");
			
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			// 이 블럭은 예외 발생 여부와 상관 없이 반드시 실행되어야 할 명령이 기술되는 부분...
			System.out.println("no : " +no);
		}
	}

}
