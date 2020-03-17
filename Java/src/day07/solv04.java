package day07;

import java.util.Arrays;

/*
	전화번호를 입력하면
	'-'를 기준으로 데이터를 분리해서
	저장할 배열을 만들고 분리된 데이터를 순서에 맞게 입력하고 출력하세요.
	indexOf()
	substring()
 */

import javax.swing.*;
public class solv04 {

	public static void main(String[] args) {
		String sTel = JOptionPane.showInputDialog("전화번호를 입력하세요!");
		//전화번호를 입력받음
		int cnt = 0;//이건 카운트같은데 뭘 카운트하느냐
		for(int i = 0 ; i <sTel.length(); i++ ) {
			if(sTel.charAt(i) == '-') {//  - 나오면 cnt에 +1을 해주라고
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
