package day14;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class Nai {
	
	public static void main(String[] args) {
		String year = JOptionPane.showInputDialog(" ���̸� �Է� �ϼ���");
		int age = Integer.parseInt(year);
		
		loop:
		for (int i = 0; ; i++) {
			if(age <= 0) {
				JOptionPane.showMessageDialog(null, "0�� ������ �ƴ� ���� �Է��ϼ���");
				continue loop;
			} else if (age <= 9) {
				JOptionPane.showMessageDialog(null, age + "�� �ֱ��Դϴ�.");
				
			} else {
				JOptionPane.showMessageDialog(null, (age/10)*10 + "�� �Դϴ�.");
			}
			 break;
				
		}
		
/*
		if (age < 20 &&  age >= 10) {
			System.out.println("�Է��Ͻ� ���� " + year + "�� '10' �� �Դϴ�.");
		} else if (age < 30 &&  age >= 20) {
			System.out.println("�Է��Ͻ� ���� " + year + "�� 7'20' �� �Դϴ�.");
		} else if (age < 40 &&  age >= 30) {
			System.out.println("�Է��Ͻ� ���� " + year + "�� '30' �� �Դϴ�.");
		} else if (age < 50 &&  age >= 40) {
			System.out.println("�Է��Ͻ� ���� " + year + "�� '40' �� �Դϴ�.");
		} else if (age < 60 &&  age >= 50) {
			System.out.println("�Է��Ͻ� ���� " + year + "�� '50' �� �Դϴ�.");
		}else if (age < 70 &&  age >= 60) {
			System.out.println("�Է��Ͻ� ���� " + year + "�� '60' �� �Դϴ�.");
		} 
		*/	
	}


}
