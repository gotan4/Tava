package day03;

import java.util.Scanner;

public class Ex04 {
	/*
	 	����3]
	 		�μ���ȣ�� �Է��ϸ�
	 		�μ��̸��� ������ִ� ���α׷��� �ۼ��ϼ���
	 		
	 			10 - �ѹ���
	 			20 - ȸ���
	 			30 - ������
	 			40 - �����
	 			������ - ������ȸ��...
	 			
	 */
	
	public Ex04() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�μ���ȣ : 10, 20, 30, 40");
		System.out.println("�μ���ȣ�� �Է��ϼ���. : ");
		
		int bu = sc.nextInt();
		sc.close();
		
		if (bu == 10) {
			System.out.println("�ѹ���");
			
		} else if (bu == 20) {
			System.out.println("ȸ���");
			
		} else if (bu == 30) {
			System.out.println("������");
			
		} else if (bu == 40) {
			System.out.println("�����");
			
		}else {
			System.out.println("������ȸ�� ....");
		}
		
		
	}

	public static void main(String[] args) {
		new Ex04();
	}

}
