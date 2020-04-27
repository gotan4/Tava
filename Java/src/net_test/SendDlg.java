package net_test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;

public class SendDlg {
	Jjokji main;
	JTextField field;
	JTextArea area;
	JButton sendB, resetB, closeB;
	JFrame frame;
	
	public SendDlg() {}
	public SendDlg(Jjokji main) {
		this.main = main;
		frame = new JFrame("쪽지쓰기");
		field = new JTextField();
		area = new JTextArea();
		JScrollPane sp = new JScrollPane(area);
		sendB = new JButton("SEND");
		resetB = new JButton("reset");
		closeB = new JButton("close");
		// 버튼 이벤트 추가
		ButtonEvent evt = new ButtonEvent();
		sendB.addActionListener(evt);
		resetB.addActionListener(evt);
		closeB.addActionListener(evt);
		
		
		JLabel label = new JLabel("받는 사람");
		JPanel p1 = new JPanel(new BorderLayout());
		p1.add("West", label);
		p1.add("Center", field);
		
		JPanel p2 = new JPanel();
		p2.add(sendB);
		p2.add(resetB);
		p2.add(closeB);
		
		frame.add("North", p1);
		frame.add("Center", sp);
		frame.add("South", p2);
		frame.setSize(400, 300);
	}
	
	// 쪽지 보내기 함수
	public void sendProc() {
		// 보낼 내용을 알아내고
		String msg = area.getText();
		byte[] buff = msg.getBytes();
		// 상대방 주소를 알아내고
		// ==> 이름을 알면 주소를 얻을 수 있도록 Map을 준비해 놓았다.
		// 이름 알아내고
		String name = field.getText();
		// ip 알아내고
		String ip = (String) main.nameToIp.get(name);
		InetAddress inet = null;
		try {
			inet = InetAddress.getByName(ip);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// 이것을 패킷으로 포장한 후
		DatagramPacket pack = null;
		try {
			pack = new DatagramPacket(buff, buff.length, inet, 9999);
			// 네트워크에 흘려보낸다.
			main.sSocket.send(pack);
		} catch(Exception e) {
			e.printStackTrace();
		}
		// 보내기가 완료되면 쓰기창을 닫아준다.
		frame.setVisible(false);
		frame.dispose();
	}
	
	class ButtonEvent implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton target = (JButton) e.getSource();
			if(target == sendB) {
				sendProc();
			} else if(target == resetB) {
				area.setText("");
			} else {
				frame.setVisible(false);
				frame.dispose();
				// 이 함수는 메모리에서도 지워달라는 명령....
			}
		}
	}
	class BtnEvt implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String comm = e.getActionCommand();
			System.out.println(comm);
		}
	}
}
