package day19;
/*
 	
 */

import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class Test12 {

	public Test12() {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("src/day19/Test11.java");
			br = new BufferedReader(fr);
			//����� �о�� ���� �𸣹Ƿ� �ݺ��ؼ� ó���Ѵ�.
			String msg = "";
			while (true) {
				String str = br.readLine();
				if(str == null) {
					break;
				}
			
				msg += str +"\n";
			}
			JOptionPane.showMessageDialog(null, msg);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e) {
			}
		}
		

	}

	public static void main(String[] args) {
		new Test12();
	}

}
