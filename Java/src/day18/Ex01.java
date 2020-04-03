package day18;

import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import javax.swing.*;

/*
    ���� 1]
       1. Ex01.txt �� ����� �����͸� Properties�� ���
       2. Ű���� ��� ������ 
       3. �����͸� �����ϰ�
       4. ������ �����ּ���.
       5. �޼���â�� ����� ������ ������ּ���.
 */
public class Ex01 {

	public Ex01() {
		Properties prop = new Properties();
		FileInputStream fin = null;

		try {
			fin = new FileInputStream("src/day18/Ex01.txt");
			prop.load(fin);
		} catch (Exception e) {
			e.printStackTrace();
		}
//      Set set = prop.keySet();
//      
//      System.out.println(set);

//      ArrayList<String> list = new ArrayList<String>(set);

//      for(String k : list) {
//         JOptionPane.showMessageDialog(null, k + " : " + prop.get(k));
//      }

		Set<Map.Entry<Object, Object>> set1 = prop.entrySet();
		//
		Iterator<Map.Entry<Object, Object>> itor = set1.iterator();
		int num = 0;
		String msg = "*** ���� ��� ***";
		while (itor.hasNext()) {
			Map.Entry<Object, Object> ent = itor.next();
			String y = (String) ent.getKey();
			String val = (String) ent.getValue();

			msg += "\n" + y + " : " + val;
//         JOptionPane.showMessageDialog(null, y + " : " + val);

			int no = Integer.parseInt(val);
			num += no;

		}

		msg += "\n���� : " + num;
		JOptionPane.showMessageDialog(null, msg);
//      JOptionPane.showMessageDialog(null, "������ : " + num);

	}

	public void toFile(Properties prop, int sum) {
		prop.put("total", sum + "");

		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day18/Ex01.txt");
			prop.store(fout, "# Edit Complete");
			JOptionPane.showMessageDialog(null, "�������� �Ϸ�");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "�������� �Ϸ�");
		} finally {
			try {
				fout.close();
			} catch (Exception e) {
			}

		}
	}

	

	public static void main(String[] args) {
		new Ex01();
	}

}