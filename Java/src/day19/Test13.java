package day19;
/*
 	day19/etc/poem.txt
 	파일을 읽어보자.
 	
 	FileInputStream 으로 읽고
 	BufferedReader를 연결해 보자
 	
 	이렇게 크기가 다른 스트림을 연결해주는 보조 스트림이
 	InputStreamReader/OutputStreamWriter
 	가 있다.
 	
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Test13 {

	public Test13() {
		// 타겟스트림 준비하고
		FileInputStream fin = null;
		// 보조 스트림 준비하고 -1
		InputStreamReader ir = null;
		// 보조 스트림 준비하고 -2
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
