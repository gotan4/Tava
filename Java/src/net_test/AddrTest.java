package net_test;

import java.net.*;
public class AddrTest {
/*
	자바에서는 IP 주소의 정보를 관리하는 클래스를 제공하고 있다.
	==> InetAddress
	
	문제 ]
		1. 내 컴퓨터의 IP를 알아보자.
			InetAddress는 new 시킬 수 없다.
			==> 함수중 속성이 static 이면서 반환값이 자기자신인 함수를 찾아본다.
			
		2. naver 서버의 주소를 알아보자.
	
 */
	
	public AddrTest() {
		InetAddress inet = null;
		InetAddress naver = null;
		
		try {
			inet = InetAddress.getLocalHost();
			naver = InetAddress.getByName("www.naver.com");
			
			/*
				InetAddress 클래스는 정보를 관리하는 클래스 이므로
				정보를 꺼내는 함수가 중요함수다.
					
					1. IP주소
						getHostAddress()
					2. 도메인 주소( 장비에 부여된 이름 )
						getHostName()
					
			 */
			
			String ip = inet.getHostAddress();
			String name = inet.getHostName();
			
			System.out.println("내 컴퓨터 IP : " + ip);
			System.out.println("내 컴퓨터 이름 : " + name);
			System.out.println();
			
			String ip1 = naver.getHostAddress();
			String name1 = naver.getHostName();
			
			System.out.println("naver IP : " + ip1);
			System.out.println("naver 이름 : " + name1);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AddrTest();
	}

}
