package day07;

import java.util.Arrays;

/*
 ����2]
	����10���� ������ �迭�� �����
	�����ϰ� 1~ 50���� ���� �߻����Ѽ�
	�迭�� ���
	�迭�� 5��°������ �����͸� ���� ����� �����ϼ���.
 */
public class solv2 {

	public static void main(String[] args) {
		//no �迭�� ���� 10��¥��
		int[] no = new int[10];
		//solv �迭�� ���� 5��¥��
		int[] solv = new int[5];
		//for���� ������
		for (int i = 0; i < no.length; i++) {
			//no1�� �����Ѽ��� 10���� �־�д�
			int no1 = (int)(Math.random()*(50));
			no[i] = no1;
		}
		System.out.println(Arrays.toString(no));//no �迭 10�� ¥�� ���
		System.arraycopy(no, 0, solv, 0, 5); // ��������� 5������ ���
		System.out.println(Arrays.toString(solv));// ���������Ѱ� ���
	}

}
