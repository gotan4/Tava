package day04;

/*
	�� ���� �Է¹��� ��
	�� ���� �ִ������� ���ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
	
	�ִ����� : �μ��� ���� �� �ִ� �ִ� ��
 */

import java.util.*;
public class Hw01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
		int no1 = sc.nextInt();
		
		System.out.print("�ι�° ���� : ");
		int no2 = sc.nextInt();
//�Է�		
		if(no2 > no1) {
			int tmp = no1;
			no1 = no2;
			no2 = tmp;
		}
		//ū��
		for(int i = no2 ; i > 0 ; i--) {// ���������� 1�� ����
			if(no1 % i == 0 && no2 % i == 0) {//ū���� �� ���� �������� 0�̳����� �������� �������� 0�̳����µ� �μ��� ������ �װ� ����
				System.out.println(no1 + " �� " +no2+ " �� �ִ� ������� " + i + " �Դϴ�.");
				break;
			}
		}
	}

}
