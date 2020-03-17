package day06;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex07 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);//스캐너 선언
//		System.out.println("문자열을 입력하세요.");//문자열 입력
//		String text = sc.nextLine();//입력받음
//		sc.close();//스캐너 닫음
		String text = JOptionPane.showInputDialog("문자열 아무거나 넣어주세요!");
		char[] text1 = new char[text.length()];//text의 문자열 길이를 반환하여 text1에 넣어서
		System.out.print("| ");
		for (int i = 0; i < text1.length; i++) {
			text1[i] = (text.charAt(i));//text1의 위치값에 맞는 문자를 추출
//			System.out.print(text1[i]+" | ");
			
		}		
//		
////		String msg = "문자열 : " + str
//		JOptionPane.showMessageDialog(null, msg);
	} 

}
