package day07;

import java.util.Arrays;

/*
	��ȭ��ȣ�� �Է��ϸ�
	'-'�� �������� �����͸� �и��ؼ�
	������ �迭�� ����� �и��� �����͸� ������ �°� �Է��ϰ� ����ϼ���.
	indexOf()
	substring()
 */

import javax.swing.*;
public class solv04 {

	public static void main(String[] args) {
		String sTel = JOptionPane.showInputDialog("��ȭ��ȣ�� �Է��ϼ���!");
		//��ȭ��ȣ�� �Է¹���
		int cnt = 0;//�̰� ī��Ʈ������ �� ī��Ʈ�ϴ���
		for(int i = 0 ; i <sTel.length(); i++ ) {
			if(sTel.charAt(i) == '-') {//  - ������ cnt�� +1�� ���ֶ��
				cnt += 1;
			}
		}
		
		int[] cIdx = new int[cnt];
		int idx2 = 0;
		for(int i = 0 ; i < sTel.length() ; i++ ) {
			if(sTel.charAt(i) == '-') {
				cIdx[idx2++] = i; 
			}
		}
		
		String first = sTel.substring(0, cIdx[0]);
		String second = sTel.substring(cIdx[0] + 1, cIdx[1]);
		String third = sTel.substring(cIdx[1] + 1);
		
		String[] tel = new String[3];
		tel[0] = first;
		tel[1] = second;
		tel[2] = third;
		
		
		
		
		
		String msg = "<html><h1>" + Arrays.toString(tel) + "</h1></html>";
		
		
		
		
		
		
		
		
		JOptionPane.showMessageDialog(null, msg);
	}

}
