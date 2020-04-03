package day19;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import javax.swing.JOptionPane;

/*
 	fr01.txt ������ �о��.
 	�� ������ ObjectOutputStream���� ������ �����̹Ƿ�
 	�ݵ�� ������ �� ����� Ŭ������ �д� �ʿ��� ��Ű���� �����̸����� �Ȱ��ƾ� �Ѵ�.
 	�ݵ�� ObjectInputStream �� ����ؼ� �о�� �Ѵ�.
 	
 */
public class Test14_01 {

	public Test14_01() {
		FileInputStream fin = null;
		//���� ��Ʈ�� �غ�
		ObjectInputStream oin = null;
		
		try {
			fin = new FileInputStream("src/day19/etc/fr01.txt");
			oin = new ObjectInputStream(fin);
			
			// ������ �� Ŭ������ ������ ������ 
			// ���� ���� Ŭ������ ����.
			Friend fr = (Friend)oin.readObject();
			JOptionPane.showMessageDialog(null, fr.getName() + "\n" + fr.getTel()+ "\n" + fr.getMail() + "\n" + fr.getAge() + "\n" + fr.getHeight() + "\n" + fr.getGen());
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		}finally {
			try {
				oin.close();
				fin.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

	public static void main(String[] args) {
		new Test14_01();
	}

}
