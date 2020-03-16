package day06;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요.");
		String text = sc.nextLine();
		sc.close();
		char[] text1 = new char[text.length()];
		System.out.print("| ");
		for (int i = 0; i < text1.length; i++) {
			text1[i] = (text.charAt(i));
			System.out.print(text1[i]+" | ");
		}		
		
	} 

}
