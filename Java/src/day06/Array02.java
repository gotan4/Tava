package day06;

import java.util.Arrays;

/*
	�迭 ������ �ݺ���
		
		1 ~ 10 ���� ���� �� �迭�� ���弼��.
 */
public class Array02 {

	public static void main(String[] args) {
		// ���� 10���� ���ڸ� ����� �迭�� �����
		int[] arr = new int[10];
		
		// �ݺ��ؼ� ���� �־��ְ�
		int i = 0; 
		while(i < 10) {
			// �迭�� ������ �Է��ϰ�

			
			// ī���� ���� ������Ű��
			i++;
		}
		
		// �迭�� ������ �����ϰ� ������ ���
		// �ݺ������� ���� for ������ ����ϸ� �ȴ�.
		for(int no : arr) {
			System.out.printf("%3d", no);
		}
		System.out.println();
		// �迭�� ����� ���븸 ���캸��.
		System.out.println("arr : " + Arrays.toString(arr));
	}

}