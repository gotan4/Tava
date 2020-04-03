package day19;

import java.io.DataInputStream;
import java.io.FileInputStream;

import javax.swing.JOptionPane;

public class Test08_01 {

	public Test08_01() {
		FileInputStream fin = null;
		DataInputStream din = null;

		try {
			fin = new FileInputStream("src/day19/etc/DataStream_Test.txt");
			din = new DataInputStream(fin);
			// ���� �� ���� ������ ������ �� �̸�, ����, ����, ����, ��ȭ, ������ ������ ������ �߱� ������ ���� ���� �� ������� �о�� �Ѵ�.
			String name = din.readUTF();
			int age = din.readInt();
			float height = din.readFloat();
			char gen = din.readChar();
			String tel = din.readUTF();
			String mail = din.readUTF();

			String msg = "�̸� : " + name + "\n���� : " + age + "\n���� : " + height + " cm\n ���� : " + gen + "\n��ȭ : " + tel
					+ "\n����" + mail;
			JOptionPane.showMessageDialog(null, msg);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());

		} finally {
			try {
				din.close();
				fin.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		new Test08_01();
	}

}
