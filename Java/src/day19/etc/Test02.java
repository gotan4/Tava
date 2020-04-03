package day19.etc;

import java.io.FileInputStream;

public class Test02 {

	public Test02() {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day19/etc/sample.txt");
			/*
			// 1. �ѱ��ڸ� �о��.
			int ch = fin. read();
			System.out.println("���� ���� : " + (char)ch);
			*/
			
			// 2. �������ڸ� �о��.
			// �� ��Ʈ���� ����Ʈ ����� ��Ʈ���̰� ������ó���� ����Ʈ�� ó���Ѵ�.
			// ���� �ѹ��ڴ¹���Ʈ������ �Ѱ��̰� �������ڴ� ����Ʈ������ �������� �ɰ��̴�.
			// �̰��� �ϳ��� �������� ������ �Ϸ��� ����Ʈ �迭�� �ʿ��ϰڴ�.
			/*
			byte[] buff = new byte[1024];
			int len = fin.read(buff);
			// ���ڿ��� ��ȯ�ϰ�
			String str = new String(buff, 0, len);
			// ���ڿ��� ����Ѵ�.
			System.out.println("# # # # # �� �� �� �� # # # # #");
			System.out.println(str);
			*/
			
			// 3. ���� ��ü�� �о��.
			while (true) {
				byte[] buff = new byte[1024];
				int len = fin.read(buff);
				if(len == -1)	{
					// ���̻� ���� �����Ͱ� ������ �ݺ��� �����Ѵ�.
					// �̶� read() �� ���� �����Ͱ� ������ -1�� ��ȯ���ش�.
					
					break;
				}
				String str = new String(buff, 0, len);
				System.out.println(str);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		new Test02();
	}

}
