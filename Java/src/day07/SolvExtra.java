package day07;

/*
	extra ]
		영문 문자열을 입력받아서
		해당 알파벳이 출현하는 빈도를 저장하고
		빈도를 * 로 표현하세요.
		
		
		"We are the World!"
		==> [W|e| |a|r|t|h|o|l|d|!]
		==> [2|3|3|1|2|1|1|1|1|1|1]
 */

import javax.swing.*;
public class SolvExtra {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("영문을 입력하세요!");
		
		// 할일
		// 0. 문자열에 포함된 문자로 이루어진 문자열을 만든다.
		String tmp = str.charAt(0) + "";
		
		loop:
		for(int i = 0 ; i < str.length(); i++ ) {
			// tmp에 같은 문자가 있는지 검사하고 없으면 더해준다.
			for(int j = 0 ; j < tmp.length(); j++ ) {
				if(str.charAt(i) == tmp.charAt(j)) {
					continue loop;
				}
			}
			tmp += 1;
		}
		
		// 1. 포함되어 있는 문자의 가지수를 구한다.
		int cnt = tmp.length() ; 
		/*
		loop:
		for(int i = 0 ; i < str.length(); i++ ) {
			for(int j = 0 ; j < i; j++ ) {
				if(str.charAt(j) == str.charAt(i)) {
					continue loop;
				}
			}
			++cnt;
		}
		*/
		// 2. 포함된 문자의배열을 만들 수 있게 되었으므로 문자배열과 카운트 배열을 만든다.
		char[] ch = tmp.toCharArray();	// 포함된 문자를 저장할 배열
		// 문자배열을 문자의 아스키코드가 작은 순으로 정렬하고
		
		for(int i = 0 ; i < ch.length - 1;i++ ) {
			for(int j = i+1; j < ch.length; j++ ) {
				if(ch[i] > ch[j]) {
					char c = ch[i];
					ch[i] = ch[j];
					ch[j] = c;
				}
			}
		}
		
		int[] count = new int[cnt];	// 포함된 문자의 출현빈도를 기억할 배열
		// 2. 문자마다 출현하는 카운트를 구해준다.
		for(int i = 0 ; i < ch.length; i++ ) {
				for(int j = 0 ; j < str.length(); j++ ) {
				if(ch[i] == str.charAt(j)) {
					count[i] += 1;
				}
			}
		}
		
		// 3. 출력한다.
		StringBuffer buff = new StringBuffer();
		for(int i = 0 ; i < ch.length ; i++ ) {
			buff.append("  ");
			buff.append(ch[i]);
			buff.append(" ");
			buff.append("   :   ");
			for(int j = 0 ; j < count[i] ; j++ ) {
				buff.append("*");
			}
			buff.append("\n");
		}
		
		JOptionPane.showMessageDialog(null, buff.toString());
		
	}

}
