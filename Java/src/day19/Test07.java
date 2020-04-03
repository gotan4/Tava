package day19;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

import javax.swing.JOptionPane;

public class Test07 {
		
	public Test07() {
		FileOutputStream fout = null;
		BufferedOutputStream bout = null;
		try {
			fout = new FileOutputStream("src/day19/etc/buffer_Test.txt");
			bout = new BufferedOutputStream(fout);
			
			String str = "동물은 이제 그만 ....! ";
			byte[] buff = str.getBytes();
			
			bout.write(buff);
			
			bout.flush();
			
			
			// 이제 버퍼에 쓰면 파일까지 데이터가 넘어갈 것이다.
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		}finally {
			try {
				bout.close();
				fout.close();
			} catch (Exception e) {}
		}
		
	}
	public static void main(String[] args) {		
		new Test07();
	}
}
