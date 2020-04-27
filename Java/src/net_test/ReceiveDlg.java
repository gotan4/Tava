package net_test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReceiveDlg {
	Jjokji main;
	JTextField field;
	JTextArea area;
	JButton reB, closeB;
	JFrame frame;
	
	public ReceiveDlg() {}
	public ReceiveDlg(Jjokji main) {
		this.main = main;
		frame = new JFrame("받은쪽지");
		field = new JTextField();
		area = new JTextArea();
		JScrollPane sp = new JScrollPane(area);
		reB = new JButton("답장");
		closeB = new JButton("닫기");
		// 이벤트 추가하고
		BtnEvt evt = new BtnEvt();
		reB.addActionListener(evt);
		closeB.addActionListener(evt);
		
		
		JLabel label = new JLabel("보낸사람");
		JPanel p1 = new JPanel(new BorderLayout());
		p1.add("West", label);
		p1.add("Center", field);
		
		JPanel p2 = new JPanel();
		p2.add(reB);
		p2.add(closeB);
		
		frame.add("North", p1);
		frame.add("Center", sp);
		frame.add("South", p2);
		
		frame.setSize(400, 300);
	}
	
	class BtnEvt implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String str = e.getActionCommand();
			
			if(str.equals("답장")){
				String name = field.getText();
				SendDlg dlg = new SendDlg(main);
				dlg.field.setText(name);
				dlg.frame.setVisible(true);
			}
			frame.setVisible(false);
			frame.dispose();
		}
	}
}
