package day18;
import java.io.*;
import java.util.*;
import javax.swing.*;
public class Test03 {

	public Test03() {
		// Properties �غ��ϰ�
		Properties prop = new Properties();
		// �����͸� ä���
		prop.put("name", "��ҿ�");	
		prop.put("tel", "010-8888-8888");	
		prop.put("age", "30");	
		prop.put("addr", "����� �Ÿ���");	
		
		//���Ϸ� �����͸� ��������.
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day18/Pengsoon.txt");
			
			prop.store(fout, "### ����� ���� ���� ###");
			JOptionPane.showMessageDialog(null, "*** ���������Ϸ� ***");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
//			e.printStackTrace();
			
		}
		
	}

	public static void main(String[] args) {
		new Test03();
		
	}

}
