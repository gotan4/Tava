package day14;

import javax.swing.JOptionPane;

public class Ex01_01 {
	/*
	public Test02() {
		try {
			Test02();
		} catch(NumberFormatException e) {
			System.out.println("������ �Է����ּ���.");
		} finally {
			System.out.println("����ã�� ��");
		}
	}
	*/
	public Ex01_01() {
		String str = JOptionPane.showInputDialog("���̸� �Է����ּ���");
		
		int age = 0;
		String msg = "";
		
		try{
			age = Integer.parseInt(str);
			if(age <= 9) {
				msg = "��� �Դϴ�.";
			} else if(age <=19) {
				msg = "10�� �Դϴ�.";
			} else if(age <=29) {
				msg = "20�� �Դϴ�.";
			} else if(age <=39) {
				msg = "30�� �Դϴ�.";
			} else if(age <=49) {
				msg = "40�� �Դϴ�.";
			} else if(age <=59) {
				msg = "50�� �Դϴ�.";
			} else if(age <=69) {
				msg = "60�� �Դϴ�.";
			} else if(age <=79) {
				msg = "70�� �Դϴ�.";
			} else if(age <=89) {
				msg = "80�� �Դϴ�.";
			} else if(age <= 99) {
				msg = "90�� �Դϴ�.";
			} else {
				msg = "����� �Դϴ�.";
			}
		} catch(Exception e) {
			msg = "���� ������ �ƴմϴ�.";
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}
	public static void main(String[] args) {
		new Ex01_01();
	}

}
