package net_test;

/*
	이 클래스는 쪽지를 받기 위한 클래스이다.
	쪽지는 언제 도착할지 모르는 상태이다.
	따라서 독립적으로 쪽지를 받기 위한 프로그램을 따로 만들어서 처리를 해야 한다.
 */
import java.net.*;
public class ReceiveThread extends Thread {
	Jjokji main;
	public ReceiveThread(Jjokji main) {
		this.main = main;
	}
	
	public void receiveProc(DatagramPacket pack) {
		byte[] buff = pack.getData(); // byte[] 데이터
		String msg = new String(buff, 0, buff.length);// 문자열로 변환된 데이터
		InetAddress addr = pack.getAddress();
		String ip = addr.getHostAddress();
		
		// 보낸 사람 이름 출력
		String name = (String) main.ipToName.get(ip);
		ReceiveDlg dlg = new ReceiveDlg(main);
		dlg.field.setText(name);
		dlg.area.setText(msg);
		
		// 출력창 띄워주고
		dlg.frame.setVisible(true);
	}
	
	public void run() {
		try {
			// 쪽지를 받아야 한다.
			// 도착한 쪽지는 패킷으로 도착한다.
			// 반드시 패킷을 준비해서 받아야 한다.
			
			while(true) {
				byte[] buff = new byte[10240];
				DatagramPacket pack = new DatagramPacket(buff, 10240);
				main.rSocket.receive(pack);
				// 이 함수는 블로킹 함수이다.
				// 그말은 패킷이 도착하면 실행되는 함수이다.
				// 도착한 패킷을 대화상자를 이용해서 출력한다.
				receiveProc(pack);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}

}
