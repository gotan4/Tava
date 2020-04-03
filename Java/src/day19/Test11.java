package day19;

import java.io.FileReader;

import javax.swing.JOptionPane;

/*
 	Test10 ���� ���� ������ �о��.
 	
 */
public class Test11 {

	public Test11() {
		// ��Ʈ�� �غ�
		FileReader fr = null;
		try {
			fr = new FileReader("src/day19/etc/FileWriter_test.txt");
			/*
			int ch = fr.read();
			JOptionPane.showMessageDialog(null, "���� ������ : " + (char)ch);
			*/
			
			char[] buff = new char[1024];
			int len = fr.read(buff);
			// ���� �迭�� ���ڿ��� ��ȯ
			String str = new String(buff, 0, len);
			JOptionPane.showMessageDialog(null, str);
			
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		}finally {
			try {
				fr.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		new Test11();
	}

}
