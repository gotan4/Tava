package day14;

import javax.swing.JOptionPane;

public class Ex01_01 {
	/*
	public Test02() {
		try {
			Test02();
		} catch(NumberFormatException e) {
			System.out.println("정수만 입력해주세요.");
		} finally {
			System.out.println("나이찾기 끝");
		}
	}
	*/
	public Ex01_01() {
		String str = JOptionPane.showInputDialog("나이를 입력해주세요");
		
		int age = 0;
		String msg = "";
		
		try{
			age = Integer.parseInt(str);
			if(age <= 9) {
				msg = "어린이 입니다.";
			} else if(age <=19) {
				msg = "10대 입니다.";
			} else if(age <=29) {
				msg = "20대 입니다.";
			} else if(age <=39) {
				msg = "30대 입니다.";
			} else if(age <=49) {
				msg = "40대 입니다.";
			} else if(age <=59) {
				msg = "50대 입니다.";
			} else if(age <=69) {
				msg = "60대 입니다.";
			} else if(age <=79) {
				msg = "70대 입니다.";
			} else if(age <=89) {
				msg = "80대 입니다.";
			} else if(age <= 99) {
				msg = "90대 입니다.";
			} else {
				msg = "고령자 입니다.";
			}
		} catch(Exception e) {
			msg = "나이 형식이 아닙니다.";
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}
	public static void main(String[] args) {
		new Ex01_01();
	}

}
