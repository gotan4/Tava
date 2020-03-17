package day07;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Test04 {

	public static void main(String[] args) {

		String str = "나 모르게 하지 마세요! 저도 외롭답니다!";
		
		String str1 = str.substring(6,13);
		JOptionPane.showMessageDialog(null, "***** "+str1+" *****");
	}

}
