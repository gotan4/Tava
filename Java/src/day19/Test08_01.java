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
			// 주의 할 점은 파일을 저장할 때 이름, 나이, 신장, 성별, 전화, 메일의 순서로 저장을 했기 때문에 읽을 때도 이 순서대로 읽어야 한다.
			String name = din.readUTF();
			int age = din.readInt();
			float height = din.readFloat();
			char gen = din.readChar();
			String tel = din.readUTF();
			String mail = din.readUTF();

			String msg = "이름 : " + name + "\n나이 : " + age + "\n신장 : " + height + " cm\n 성별 : " + gen + "\n전화 : " + tel
					+ "\n메일" + mail;
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
