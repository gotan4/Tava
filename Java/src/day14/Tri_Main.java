package day14;

import javax.swing.JOptionPane;

public class Tri_Main {

	public Tri_Main() {
		String t1 = JOptionPane.showInputDialog("�غ��� �Է��ϼ���");
		String t2 = JOptionPane.showInputDialog("������ �Է��ϼ���");

		int mit1 = Integer.parseInt(t1);
		int mit2 = Integer.parseInt(t2);
		JOptionPane.showMessageDialog(null, "t1�� t2�� " + ((t1.equals(t2))?("�����ﰢ�� �Դϴ�."):("�ٸ��ﰢ�� �Դϴ�.")));
	
	}
	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		new Tri_Main();
	}

}
