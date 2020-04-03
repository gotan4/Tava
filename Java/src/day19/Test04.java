package day19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Test04 {

	public Test04() {
		// ����
		// ���� ����� ������ ������ ���� ��
		// ���� ������ �ٸ� ���Ͽ� �������� �۾��̴�.
		// ���� ���������� ���� Ÿ�ٽ�Ʈ���� �غ��ϰ�
		// ���� �� ���� ������ byte[] �����صθ� �� ���̴�.
		// ������ Ÿ�ٽ�Ʈ���� ���� �� ���̴�.
		
		// 1. �⺻ ��Ʈ�� �ΰ��� �غ��Ѵ�.
		FileInputStream fin = null;		// ����
		FileOutputStream fout = null;	// ���纻
		
		try {
			// 2. �⺻��Ʈ�� �ΰ��� ����.
			/*
			fin = new FileInputStream("src/day19/Test04.java");
			fout = new FileOutputStream("src/day19/Test04_01.java");
	*/
			fin = new FileInputStream("src/day19/etc/sample.txt");
			fout = new FileOutputStream("src/day19/etc/increpas.whw");
		
			// �� ������ �о �״�� �ٸ� ���� ���� �ȴ�.
			// ��� �о�� ���� �𸣹Ƿ�
			String str = "";
			byte[] buff = new byte[1024];
			while (true) {
				Arrays.fill(buff, (byte)0);
				int len = fin.read(buff);
				if(len == -1) break;
				str += new String(buff, 0, len);
			}
			
			// ���ڿ��� ���Ͽ� ����Ѵ�.
			// ���ڿ��� byte[]�� ������ְ�
			byte[] bstr = str.getBytes();
			fout.write(bstr);
			
			JOptionPane.showMessageDialog(null, "* * * ���� ���� �Ϸ� * * *");
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		} finally {
			try {
				fout.close();
				fin.close();
			}catch (Exception e) {

			}
		}
		
	}
	

	public static void main(String[] args) {
		new Test04();
	}

}
