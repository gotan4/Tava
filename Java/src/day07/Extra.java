package day07;

import javax.swing.*;
public class Extra {

	public static void main(String[] args) {
		// ProTip! Updating your profile with your name, location, and a profile picture helps other GitHub users get to know you.
		//입력
		String source = JOptionPane.showInputDialog("영문을 입력하세요!");
		//tmp 에 source 0번째 값을 반환받고
		String tmp = source.charAt(0) + "";
		loop:
		for (int i = 0; i < source.length(); i++) {
			for (int j = 0; j < tmp.length(); j++) {
				if(source.charAt(i) == tmp.charAt(j)) {
					continue loop;
				}
			}tmp += source.charAt(i);
	
			
		}
		
	}
}
