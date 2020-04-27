package MyProj.view;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class MembInfo {
	public JFrame frame;
	public JPanel cont;
	public JButton btn1, btn2, btn3;
	public MembInfo() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		btn1 = new JButton("회원 추가");
//		btn2 = new JButton("회원 조회");
//		btn3 = new JButton("회원 정보 조회");
//		btn1.setPreferredSize(new Dimension(120, 35));
//		btn2.setPreferredSize(new Dimension(120, 35));
//		btn3.setPreferredSize(new Dimension(120, 35));
		
		JTabbedPane tab = new JTabbedPane();
		tab.add(new MemberList(), "회원리스트");
		tab.add(new MemberDetail(), "회원정보조회");
		tab.add(new JoinMember(this), "회원 가입");
		
		cont = new JPanel();
		cont.setLayout(new BorderLayout());
		cont.setBackground(Color.BLUE);
		frame.add(tab, BorderLayout.CENTER);
		
		frame.setSize(500, 520);
		frame.setResizable(false);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MembInfo();
	}

}
