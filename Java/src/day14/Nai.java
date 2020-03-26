package day14;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class Nai {
	
	public static void main(String[] args) {
		String year = JOptionPane.showInputDialog(" 나이를 입력 하세요");
		int age = Integer.parseInt(year);
		
		loop:
		for (int i = 0; ; i++) {
			if(age <= 0) {
				JOptionPane.showMessageDialog(null, "0과 음수가 아닌 값을 입력하세요");
				continue loop;
			} else if (age <= 9) {
				JOptionPane.showMessageDialog(null, age + "살 애기입니다.");
				
			} else {
				JOptionPane.showMessageDialog(null, (age/10)*10 + "대 입니다.");
			}
			 break;
				
		}
		
/*
		if (age < 20 &&  age >= 10) {
			System.out.println("입력하신 나이 " + year + "은 '10' 대 입니다.");
		} else if (age < 30 &&  age >= 20) {
			System.out.println("입력하신 나이 " + year + "은 7'20' 대 입니다.");
		} else if (age < 40 &&  age >= 30) {
			System.out.println("입력하신 나이 " + year + "은 '30' 대 입니다.");
		} else if (age < 50 &&  age >= 40) {
			System.out.println("입력하신 나이 " + year + "은 '40' 대 입니다.");
		} else if (age < 60 &&  age >= 50) {
			System.out.println("입력하신 나이 " + year + "은 '50' 대 입니다.");
		}else if (age < 70 &&  age >= 60) {
			System.out.println("입력하신 나이 " + year + "은 '60' 대 입니다.");
		} 
		*/	
	}


}
