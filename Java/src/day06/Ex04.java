package day06;

import java.util.Arrays;

/*
 ���� 4]
	
	������ 5���� ����� �迭�� �����
	�����ϰ� 5���� �������� ���� �Է��ϰ�
	������ �������� ���� ���� ���̸� ����ؼ� ������ �迭�� �����
	�� ���� �ѷ��� ����ؼ� ������ �迭�� ����
	
	����� ����ϴ� ���α׷��� �ۼ��ϼ���.
	
	��, ������´�
		
		��]
			������ : 10, ���� �ѷ� : 62.8, ���� ���� : 314
			
	�� ���·� ��µǰ� �ϼ���.

 */
public class Ex04 {

	public static void main(String[] args) {
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
			System.out.println("�ݸ����� " + arr[i] + " ���� �ѷ��� " + arr[i] * 3.14 * 2 + " ���� ���̴� " + arr[i] * arr[i] * 3.14);

		}System.out.println(Arrays.toString(arr));
		System.out.println();
	}

		

}
