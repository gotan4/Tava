package day10;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/*
 * 	학생의 점수를 입력하면 총점을 계산해주는 프로그램을 제작하세요.
	
	심화]
		랜덤하게 인수를 만들고
		그 인원수 만큼 점수를 랜덤하게 만들어서 함수를 실행하게 하세요.
		
 */
public class Study01 {

	public Study01() {
		int sum = 0;
		ArrayList<Integer> numbers = new ArrayList<>();

		for (;;) {
			String sc = JOptionPane.showInputDialog("점수를 입력하세요.");
			Integer score = new Integer(sc);
			numbers.add(score);

			System.out.println(score);
			sum += score;
			if (sc == "q") {
				System.out.println(sum);
				break;
			}

		}

	}

	public static void main(String[] args) {
		new Study01();
	}

}
