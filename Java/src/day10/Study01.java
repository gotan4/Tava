package day10;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/*
 * 	�л��� ������ �Է��ϸ� ������ ������ִ� ���α׷��� �����ϼ���.
	
	��ȭ]
		�����ϰ� �μ��� �����
		�� �ο��� ��ŭ ������ �����ϰ� ���� �Լ��� �����ϰ� �ϼ���.
		
 */
public class Study01 {

	public Study01() {
		int sum = 0;
		ArrayList<Integer> numbers = new ArrayList<>();

		for (;;) {
			String sc = JOptionPane.showInputDialog("������ �Է��ϼ���.");
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
