package day15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

/*
 	����1]
 		
 		�̸����� �Է¹޾Ƽ� 
 		�Է¹��� ���ڿ��� �̸��� ���Ŀ� �´��� �ƴ��� �˻��ϼ���.
 		�̸��� ������ 
 			���ĺ��� ���ڷ� 8�����̻����� �ϰ� @ �������ּ�
 			
 		�� ó���ϼ���.
 			
 			����]
 				�ѱ� ó�� : [��-�R] - �ѱ��� ���̵� ����������.
 				
 				
 */
public class Ex01 {
	public Ex01() {
		String email = JOptionPane.showInputDialog("�̸��� �ּҸ� �Է��ϼ���");
		
		Pattern pattern = Pattern.compile("^[a-z0-9]{+8}*@[a-z0-9]{5}+\\.[a-z0-9]{3}$ ") ;//�̸��� ���Խ�
		
		Matcher match = pattern.matcher(email);
		
		if(match.matches()) {
			JOptionPane.showMessageDialog(null, "�ùٸ� �̸����Դϴ�.");
		} else {
			JOptionPane.showMessageDialog(null, "�߸��� �̸����Դϴ�.");
		}

	}

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		new Ex01();

	}

}
