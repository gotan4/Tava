package MyProj.controller;

import javax.swing.*;

import MyProj.VO.*;
import MyProj.DAO.*;

public class Member {
	MemberDAO mDAO;
	public Member() {
		mDAO = new MemberDAO();
		
		// ȸ����ȣ�� ������ȸ
		getMemb();
	}
	
	// ��� ȸ�� ���� �������� �Լ�
	public void getMembAll() {
		// ���Լ��� Member���̺��� ��� ȸ���� ���� ������ �����ִ� �Լ��̴�.
		// �� �κ��� ���� �ذ��غ����� �ϼ���!
	}
	
	// ȸ�� ���� ��ȸ ó�� �Լ�
	public void getMemb() {
		int mno = 0;
		while(true) {
			String sno = JOptionPane.showInputDialog("��ȸ�� ȸ���� ��ȣ�� �Է��ϼ���!\n����� q�� �Է��ϼ���!");
			// "q" �� �ԷµǸ� ���� ó��
			if(sno.equals("q")) break;
			
			try {
				mno = Integer.parseInt(sno);
				MemberVO mVO = mDAO.getMembInfo(mno);
				
				String name = mVO.getName();
				String mid = mVO.getId();
				String mail = mVO.getMail();
				String gen = mVO.getGen().equals("F") ? "����" : "����";
				String tel = mVO.getTel();
				int ano = mVO.getAno();
				String sDate = mVO.getsDate();
				
				// �����ְ�
				JOptionPane.showMessageDialog(null, "<html><b style=\"color: blue;\">###  &nbsp;&nbsp;" + 
														name + " "+ getHoching(name) + " ���� &nbsp;&nbsp;###</b></html>" + 
						"\nȸ����ȣ : " + mno + "\nȸ��I D : " + mid + "\nȸ������ : " + mail + 
						"\nȸ������ : " + gen + "\nȸ����ȭ : " + tel + "\n�ƹ�Ÿ��ȣ : " + ano +
						"\n�� �� �� : " + sDate
						);
			} catch(Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "�߸��� ȸ����ȣ �Դϴ�.");
				continue;
			}
		}
	}
	
	// ȣĪ ó�� ���� �Լ�
	public String getHoching(String name) {
		String hoching = "";
		switch(name) {
		case "������":
			hoching = "������";
			break;
		case "�����":
			hoching = "ȸ���";
			break;
		case "��ҿ�":
			hoching = "ū��";
			break;
		case "�ֵο�":
			hoching = "�����";
			break;
		case "������":
			hoching = "�븮";
			break;
		default:
			hoching = "��";
		}
		
		return hoching;
	}
	
	public static void main(String[] args) {
		new Member();
	}

}
