package day04;

/*
	4�ڸ� ���ڷ� �� �⵵�� �Է¹޾Ƽ�
	�������� ������� �Ǵ��ؼ� ����ϼ���.
	��, switch ~ case �������� ó���ϼ���.
 */

import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
		// �Է¹��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			// �޼�������ϰ�
			System.out.print("4�ڸ� �⵵ : ");
			// �Է¹ް�
			int year = sc.nextInt();
			// �ڵ常��� ( 4�� �����������¼� - 1, 100���γ����������� �� - 2 , 400���γ����������� ���� - 3 )
			
			int code = 0;
			if(year % 400 == 0) {
				code = 3;
			} else if( year % 100 == 0) {
				code = 2;
			} else if(year % 4 == 0) {
				code = 1;
			} else if(year == 9) {
				code = 9;
			}
			
			// switch ~ case ����ó��...
			String hae = "���";
			switch(code) {
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			case 3:
				hae = "����";
				break;
			case 2:
				break;
			case 1:
				hae = "����";
				break;			
			}
			
			// ����ϰ�
			System.out.println("�Է��� �⵵ [ " + year + " ] �� [ " + hae + " ] �Դϴ�.");
		}
	}

}
