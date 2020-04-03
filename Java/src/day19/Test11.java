package day19;

import java.io.FileReader;

import javax.swing.JOptionPane;

/*
 	Test10 에서 만든 문서를 읽어보자.
 	
 */
public class Test11 {

	public Test11() {
		// 스트림 준비
		FileReader fr = null;
		try {
			fr = new FileReader("src/day19/etc/FileWriter_test.txt");
			/*
			int ch = fr.read();
			JOptionPane.showMessageDialog(null, "읽은 데이터 : " + (char)ch);
			*/
			
			char[] buff = new char[1024];
			int len = fr.read(buff);
			// 문자 배열을 문자열로 변환
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
