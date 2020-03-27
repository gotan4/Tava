package day14;
import java.util.*;
import javax.swing.*;

public class Tri_Main {
	
	public Tri_Main() {
		
		// ���� Ŭ���� ��ü �ΰ��� ���� �迭
		ArrayList<Tri> list = new ArrayList<Tri>();
		
		// �غ��� ���̸� ���� ����Ʈ...
		ArrayList<Integer> iList = null;
		for(int i = 0 ; i < 2; i++ ) {
			iList = new ArrayList<Integer>();
			loop:
			for(int j = 0 ; j < 2; j++) {
				String str = (j == 0)? "�غ�" : "����";
				String tmp = JOptionPane.showInputDialog((i+1) + " ] ��° �ﰢ���� " + str + "�� �Է��ϼ���!");
				if(tmp == null || tmp.equals("")) {
					int code = JOptionPane.showConfirmDialog(null, "<html><h3>���α׷��� �����Ͻðڽ��ϱ�?</h3></html>", "### ���α׷� ���� ###", JOptionPane.YES_NO_OPTION);
					
					switch(code) {
					case JOptionPane.YES_OPTION:
//						System.out.println("********* " + JOptionPane.YES_OPTION);
						return;
					case JOptionPane.NO_OPTION:
//						System.out.println("######### " + JOptionPane.NO_OPTION);
						j--;
						continue loop;
					}
					/*
					// if else �������� ó��
					if(code == JOptionPane.YES_OPTION) {
//						System.out.println("********* " + JOptionPane.YES_OPTION);
						return;
					} else {
//						System.out.println("######### " + JOptionPane.NO_OPTION);
						j--;
						continue;
					}
					
					*/
				}
				int val = 0;
				try {
					val = Integer.parseInt(tmp);
					if(val < 0) throw new MinusException();
				} catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "### ���������� �ƴ� ���ڿ��� �ԷµǾ����ϴ�. ###");
					j--;
					continue;
				} catch(MinusException e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, "### ������ �ԷµǾ����ϴ�. ###");
					j--;
					continue;
				}
				iList.add(val);
			}
			list.add(new Tri(iList.get(0), iList.get(1)));
		}
		
		Tri s1 = list.get(0);
		Tri s2 = list.get(1);
		
		String info = "*** ù ��° �ﰢ�� ***\n" + s1.toString() + "\n*** �� ��° �ﰢ�� ***\n" + s2.toString();
		JOptionPane.showMessageDialog(null, info);
		
		String msg = s1.equals(s2) ? "����":"�ٸ�";
		JOptionPane.showMessageDialog(null, "�� �ﰢ���� ���� " + msg + " �ﰢ���Դϴ�.");
	}
	public static void main(String[] args) {
		new Tri_Main();
	}

}
