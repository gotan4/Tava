package net_test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;
import java.io.*;
public class Jjokji {
	// 이름을 알려주면 주소를 찾아내는 맵
	// 주소를 알려주면 이름을 찾아내는 맵
	Properties nameToIp, ipToName;
	JList list;
	JButton sendB;
	JFrame frame;
	
	DatagramSocket sSocket, rSocket;
	/*
		소켓은 하나만 가지고도 보내기와 받기를 할 수 있다.
		그런데 문제는 보내는 경우에는 보내는 도중에 받기는 못한다.
		따라서 안전한 통신을 위해서
		보내는 소켓과 받는 소켓을 구분해서 처리하는 것이 좋다.
	 */
	
	public Jjokji() {
		setMap();
		// 창부터 만들고
		frame = new JFrame("쪽지 프로그램");
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				close();
			}
		});
		
		Set tmp = nameToIp.keySet();
		Vector v = new Vector(tmp);
		list = new JList(v);
		JScrollPane sp = new JScrollPane(list);
		sendB = new JButton("쪽지쓰기");
		// 이벤트 추가하고
		sendB.addActionListener(new ButtonEvent());
		
		frame.add("Center", sp);
		frame.add("South", sendB);
		
		frame.setSize(200, 300);
		frame.setVisible(true);
		
		/*------------------------------ 폼 만드는 코드 -------------------------------	*/
		/*------------------------------ 네트워크 구성 시작 ---------------------------	*/
		// UDP 통신 이므로 DatagramSocket 을 이용한다.
		
		try {
			sSocket = new DatagramSocket();
			rSocket = new DatagramSocket(9999);
			// 네트워크 회선에만 접속을 한 상태가 된다.
			// 즉, 네트워크가 가능하도록만 해준 상태....
			
			// 이제 네트워크 구성이 완료되었으므로
			// 쪽지를 보내고 받을 수 있다.
			// 쪽지가 오는 것은 언제 올지 모르므로 받는 프로그램을 시작해준다.
			ReceiveThread t = new ReceiveThread(this);
			t.start();
		} catch(Exception e) {
			// 이 프로그램은 통신을 하려면 반드시 소켓이 필요하고
			// 소켓을 만드는 과정에서 에러가 발생하면 더이상 이 프로그램은 
			// 실행시키는 의미가 없어진다.
			// 따라서 프로그램을 종료해준다.
			close();
		}
	}
	
	class ButtonEvent implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String name = (String) list.getSelectedValue();
			if(name == null || name.length() == 0) {
				return;
			}
			// 보내기 위한 대화상자를 new 시킨다.
			SendDlg dlg = new SendDlg(Jjokji.this);
			// 텍스트 필드에 받는 사람의 이름을 써주고
			dlg.field.setText(name);
			// 화면에 보이게 하고
			dlg.frame.setVisible(true);
			
		}
	}
	// socket 닫아주는 함수
	public void close() {
		/*
		try {
			sSocket.close();
			rSocket.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		*/
		System.exit(0);
	}
	
	public void toTest() {
		System.out.println("우현우 IP : " + nameToIp.get("우현우"));
		System.out.println("이진수 IP : " + nameToIp.get("이진수"));
	}
	
	public void setMap() {
		nameToIp = new Properties();
		ipToName = new Properties();
		// 우리는 데이터를 파일에 저장을 했고
		// 파일은 외부 장치이니 스트림이 필요하겠다.
		FileInputStream fin1 = null;
		FileInputStream fin2 = null;
		try {
			fin1 = new FileInputStream("src/net_test/ip_ko.properties");
			fin2 = new FileInputStream("src/net_test/name_ko.properties");
			
			nameToIp.load(fin1);
			ipToName.load(fin2);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin1.close();
				fin2.close();
			} catch (IOException e) {}
		}
	}
	
	public static void main(String[] args) {
		new Jjokji();
	}

}
