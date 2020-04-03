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
			
			String str = "������ ���� �׸� ....! ";
			byte[] buff = str.getBytes();
			
			bout.write(buff);
			
			bout.flush();
			
			
			// ���� ���ۿ� ���� ���ϱ��� �����Ͱ� �Ѿ ���̴�.
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
