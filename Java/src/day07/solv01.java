package day07;

import java.util.Arrays;

/*
 ����1]
	���ĺ� 10���� ������ �迭�� �����
	�빮�� 10���� �����ϰ� �����ؼ� �迭�� �����ϰ�
	����� �迭�� ���� ����� �����ؼ�
	����ϰ�, 
	���� �迭�� �ҹ��ڷ� ������ ��
	�ι迭�� ����ϼ���.
 */
public class solv01 {

	public static void main(String[] args) {
		// ���ĺ� 10���� �����ϴ� �迭
		char[] alp = new char[10];
		//���Ĺ� 10���� alp �迭 ������ŭ(10��)�� ���ĺ� �빮�ڿ��� 10�� �����ؼ�
		
		for (char i = 0; i < alp.length; i++) {
			char alpa = (char)(Math.random()*('Z'-'A' +1) + 'A');
		//����� alpa�� for���� �̿��Ͽ� alp�迭�� ä���
			alp[i] =alpa;
		
		}//�빮�� ���ĺ��� ����ϰ�
		System.out.println(Arrays.toString(alp));
		//�ҹ��ڸ� ���� alp1 �迭�� �����Ѵ�.
		char[] alp1; 
		//���� ����
		alp1 = alp;
		
		for (int i = 0; i < alp1.length; i++) {
			alp1[i] = (char)(('a' -'A')+(alp[i]));
		//�ҹ��ڷ� ��ȯ�ؼ� ��Ƽ�
		}
	
		//���
		System.out.println(Arrays.toString(alp1));
		

	}

}
