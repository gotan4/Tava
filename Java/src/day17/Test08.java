package day17;

import java.util.*;

import javax.swing.JOptionPane;
public class Test08 {

	public Test08() {
		Hashtable<String, String> table =  new Hashtable<String, String>();
		table.put("�̸�", "ū��");
		table.put("��ȣ", "010-9999-9999");
		table.put("���", "�ǹ���");
		table.put("�ξ�", "���");
		
		/*
		for(;;) {
			
			// ������ ������
			String key = JOptionPane.showInputDialog("�˰���� ������ �Է��ϼ���!");
			//���� Ű�� �����
			if (key.equals("q")) break;
			
			
			//������ ������ �����ְ�
			JOptionPane.showMessageDialog(null, table.get(key));
			
			
		}
		// Map �迭�� Ű���� �˾ƾ� �����͸� ������ �ִ�.
		
		*/
		
		Collection<String> con = table.values();
		
		Iterator<String> itor = con.iterator();
		
		while(itor.hasNext()) {
			System.out.print(itor.next() + " | ");
			
		}
		System.out.println();
		
		// Ű���� �̾ƺ���. �Լ��� keys() / keySet()
		Enumeration<String> en = table.keys();
		
		while(en.hasMoreElements()) {
			// ���ڿ� ������ ���
			String key = en.nextElement();
			System.out.print(key + " | " + "\n\t");
			// Enumeration�� ���ۿ� ����Ǵ� �������̹Ƿ� ������ ���� ������� �����ʹ�.
			// ���� ������ ��� ����ϴ��� ���� �����ϴ��� �ؾ� �Ѵ�. 
			System.out.println(key + " : " + table.get(key) );
		}
		System.out.println();
		
		while(en.hasMoreElements()) {
			String key = en.nextElement();
		}
		System.out.println("*****************************************");
		
	}

	public static void main(String[] args) {
		new Test08();
	}

}
