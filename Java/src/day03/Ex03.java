package day03;

import java.util.Scanner;

public class Ex03 {
/*
 	���� 2]
 		�������� ����ϴ� ���α׷��� �ۼ��ϼ���
 				�ڵ�	�⺻���	�����
 		������	(1)		  3800		   245
 		�����	(2)		  2400		   157
 		������	(3)		  2900		   169
 		�����	(4)		  3200		   174
 		
 		������ = �⺻��� + ��뷮 * �����
 		
 		������ڵ�� ��뷮�� �Է¹޾Ƽ�
 		�������� ������ִ� ���α׷��� �ۼ��ϼ���.
 */
	public Ex03() {
		Scanner sc = new Scanner(System.in);
		System.out.println("		�ڵ�	�⺻���	�����\r\n" + 
				" 		  ������	(1)		  3800		   245\r\n" + 
				" 		  �����	(2)		  2400		   157\r\n" + 
				" 		  ������	(3)		  2900		   169\r\n" + 
				" 		  �����	(4)		  3200		   174\r\n" + 
				" 		  \r\n" + 
				" 		  ������ = �⺻��� + ��뷮 * �����");
		
		System.out.println("�ڵ带 �Է��ϼ���.");
		int code = sc.nextInt();
		
		System.out.println("��뷮�� �Է��ϼ���.");
		int sa = sc.nextInt();
		int gap = 0 ;
		
		if (code == 1) {
			gap = sa + 3800 * 245;			
		} else if (code == 2) {
			gap = sa + 2400 * 157;
		}else if (code == 3) {
			gap = sa + 2900 * 169;
		}else if (code == 4) {
			gap = sa + 3200 * 174;
		}

		
		
		System.out.println(" ������ : " + gap);
		
		
		
		
	}
	
	

	public static void main(String[] args) {

		new Ex03();
	}

}
