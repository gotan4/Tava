package day06;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex07 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);//��ĳ�� ����
//		System.out.println("���ڿ��� �Է��ϼ���.");//���ڿ� �Է�
//		String text = sc.nextLine();//�Է¹���
//		sc.close();//��ĳ�� ����
		String text = JOptionPane.showInputDialog("���ڿ� �ƹ��ų� �־��ּ���!");
		char[] text1 = new char[text.length()];//text�� ���ڿ� ���̸� ��ȯ�Ͽ� text1�� �־
		System.out.print("| ");
		for (int i = 0; i < text1.length; i++) {
			text1[i] = (text.charAt(i));//text1�� ��ġ���� �´� ���ڸ� ����
//			System.out.print(text1[i]+" | ");
			
		}		
//		
////		String msg = "���ڿ� : " + str
//		JOptionPane.showMessageDialog(null, msg);
	} 

}
