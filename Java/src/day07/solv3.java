package day07;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 ����3]
	
	ȸ���� �̸�, ��ȭ��ȣ, �̸����� ������ �迭�� ����� - ���ڿ� �迭3��
	�����͸� �Է��� ����
	�̸��� �Է��ϸ�
	�׻���� �����͸� ��� ������ �迭�� ����
	�����͸� �ְ� ����ϼ���.
 */
public class solv3 {

	public static void main(String[] args) {
		//name �迭 ����
		String[] name = {"��ҿ�", "�ֵο�", "�����", 
				"������", "������", "�Ӽ���"};
		//tel �迭 ����
		String[] tel = {"010-1111-1111", "010-2222-2222", "010-3333-3333", 
			"010-5555-5555", "010-8888-8888", "010-9999-9999"};
		//mail �迭 ����
		String[] mail = new String[]{"pengsoon@increpas.com", "dDragon@increpas.com", 
						"victory@increpas.com", "nobody@increpas.com",
						"bell@increpas.com", "leem@increpas.com"};
		// sol �迭 ����
		String[] sol = new String[6];
		//for���� �̿��� �̸� ��ȣ �̸��� �� �ϳ��� ����� �迭�� ����
		for (int i = 0; i < sol.length; i++) {
			sol[i] = name[i] +" "+ tel[i] +" "+ mail[i];
		}
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�̸��� �Է��ϼ��� : ");
//		String nm = sc.nextLine();
//		sc.close();
		// �̸��� �Է¹޾Ƽ�
		String nm = JOptionPane.showInputDialog("�̸��� �Է��ϼ���");
		for (int i = 0; i < sol.length; i++) {
			//�̸��� �̸��迭�� i �� �˾Ƴ���
			if (nm.equals(name[i]) == true) {
				
//				System.out.println(sol[i] );
				//i��° sol �� ���
				JOptionPane.showMessageDialog(null, sol[i]);
			}
			
			
		}
		
		
	}

}
