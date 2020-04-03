package day18;
import java.io.*;
import java.util.*;
import javax.swing.*;
public class Test03 {

	public Test03() {
		// Properties 준비하고
		Properties prop = new Properties();
		// 데이터를 채우고
		prop.put("name", "김소영");	
		prop.put("tel", "010-8888-8888");	
		prop.put("age", "30");	
		prop.put("addr", "서울시 신림동");	
		
		//파일로 데이터를 보관하자.
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day18/Pengsoon.txt");
			
			prop.store(fout, "### 절대로 영구 보관 ###");
			JOptionPane.showMessageDialog(null, "*** 영구보관완료 ***");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
//			e.printStackTrace();
			
		}
		
	}

	public static void main(String[] args) {
		new Test03();
		
	}

}
