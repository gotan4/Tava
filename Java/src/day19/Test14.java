package day19;

/*
	Friend 에 데이터를 채워서 파일에 그대로 저장해 보자.
 */

import java.io.*;
import javax.swing.*;
public class Test14 {

	public Test14() {
		// 타겟스트림 준비하고
		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		
		try {
			// 스트림 만들고
			fout = new FileOutputStream("src/day19/etc/fr01.txt");
			oout = new ObjectOutputStream(fout);
			
			// Friend를 만들고 데이터를 채워준다.
			Friend f1 = new Friend("쵸파", "010-1111-1111", "choppa@increpas.com", 25, 90.0f,'M');
			
			// 데이터 넘기고
			oout.writeObject(f1);
			
			JOptionPane.showMessageDialog(null, "### Mission Complete! ###");
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {
			try {
				oout.close();
				fout.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test14();
	}

}
