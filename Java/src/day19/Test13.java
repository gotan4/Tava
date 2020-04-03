package day19;
/*
 	day19/etc/poem.txt
 	������ �о��.
 	
 	FileInputStream ���� �а�
 	BufferedReader�� ������ ����
 	
 	�̷��� ũ�Ⱑ �ٸ� ��Ʈ���� �������ִ� ���� ��Ʈ����
 	InputStreamReader/OutputStreamWriter
 	�� �ִ�.
 	
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Test13 {

	public Test13() {
		// Ÿ�ٽ�Ʈ�� �غ��ϰ�
		FileInputStream fin = null;
		// ���� ��Ʈ�� �غ��ϰ� -1
		InputStreamReader ir = null;
		// ���� ��Ʈ�� �غ��ϰ� -2
		BufferedReader br = null;
		
		try {
			fin = new FileInputStream("src/day19/etc/poem.txt");
			ir = new InputStreamReader(fin);
			br = new BufferedReader(ir);
			StringBuffer buff = new StringBuffer();
			while (true) {
				String str = br.readLine();
				if(str == null) break;
				
				buff.append(str + "\n");
			}
			JOptionPane.showMessageDialog(null, buff.toString());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		}finally {
			try {
				br.close();
				ir.close();
				fin.close();
			} catch (Exception e2) {
			}
		}
		
		
	}

	public static void main(String[] args) {
		new Test13();
	}

}
