package day07;

/*
	extra ]
		���� ���ڿ��� �Է¹޾Ƽ�
		�ش� ���ĺ��� �����ϴ� �󵵸� �����ϰ�
		�󵵸� * �� ǥ���ϼ���.
		
		
		"We are the World!"
		==> [W|e| |a|r|t|h|o|l|d|!]
		==> [2|3|3|1|2|1|1|1|1|1|1]
 */

import javax.swing.*;
public class SolvExtra {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("������ �Է��ϼ���!");
		
		// ����
		// 0. ���ڿ��� ���Ե� ���ڷ� �̷���� ���ڿ��� �����.
		String tmp = str.charAt(0) + "";
		
		loop:
		for(int i = 0 ; i < str.length(); i++ ) {
			// tmp�� ���� ���ڰ� �ִ��� �˻��ϰ� ������ �����ش�.
			for(int j = 0 ; j < tmp.length(); j++ ) {
				if(str.charAt(i) == tmp.charAt(j)) {
					continue loop;
				}
			}
			tmp += 1;
		}
		
		// 1. ���ԵǾ� �ִ� ������ �������� ���Ѵ�.
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
		// 2. ���Ե� �����ǹ迭�� ���� �� �ְ� �Ǿ����Ƿ� ���ڹ迭�� ī��Ʈ �迭�� �����.
		char[] ch = tmp.toCharArray();	// ���Ե� ���ڸ� ������ �迭
		// ���ڹ迭�� ������ �ƽ�Ű�ڵ尡 ���� ������ �����ϰ�
		
		for(int i = 0 ; i < ch.length - 1;i++ ) {
			for(int j = i+1; j < ch.length; j++ ) {
				if(ch[i] > ch[j]) {
					char c = ch[i];
					ch[i] = ch[j];
					ch[j] = c;
				}
			}
		}
		
		int[] count = new int[cnt];	// ���Ե� ������ �����󵵸� ����� �迭
		// 2. ���ڸ��� �����ϴ� ī��Ʈ�� �����ش�.
		for(int i = 0 ; i < ch.length; i++ ) {
				for(int j = 0 ; j < str.length(); j++ ) {
				if(ch[i] == str.charAt(j)) {
					count[i] += 1;
				}
			}
		}
		
		// 3. ����Ѵ�.
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
