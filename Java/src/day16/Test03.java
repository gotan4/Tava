package day16;

/*
	ChoiceFormat
	
		학생의 점수를 입력받아
		학점을 출력하는 프로그램을 작성해보자.
 */

import java.text.*;

import javax.swing.JOptionPane;
public class Test03 {

	public Test03() {
		// 먼저 limits를 만들어 준다.
		double[] limits = {0, 60, 70, 80, 90};
		// limits를 만들때 주의사항
		// 		반드시 오름차순 정렬되어야 한다.
		//		이것의 의미는 60 ~ 69 사이는 하나의 문자로 바꾸고
		// 		70 ~ 79 사이는 다른 하나의 문자로 바꿔라 ....
		
		// 교체할 문자를 만들고
		String[] formats = {"F", "D", "C", "B", "A"};
		// 이때 반드시 limits와 갯수를 일치 시켜야 한다.
		
		ChoiceFormat cForm = new ChoiceFormat(limits, formats);
		
		// 이제 점수를 입력받아서 학점을 처리해보자.
		while(true) {
			String str = JOptionPane.showInputDialog("점수를 입력하세요!\n종료는q를 입력하세요!");
			if(str.equals("q")) {
				break;
			}
			int score = 0;
			try {
				score = Integer.parseInt(str);
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "당신 점수를 입력하세요!");
				continue;
			}
			
			String grade = cForm.format(score);
			JOptionPane.showMessageDialog(null, "점수 : " + score + "\n학점 : " + grade);
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
