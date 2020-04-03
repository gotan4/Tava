package day19.etc;

import java.io.FileInputStream;

public class Test02 {

	public Test02() {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day19/etc/sample.txt");
			/*
			// 1. 한글자만 읽어보자.
			int ch = fin. read();
			System.out.println("읽은 문자 : " + (char)ch);
			*/
			
			// 2. 여러글자를 읽어보자.
			// 이 스트림은 바이트 기반의 스트림이고 데이터처리를 바이트로 처리한다.
			// 따라서 한문자는바이트데이터 한개이고 여러문자는 바이트데이터 여러개가 될것이다.
			// 이것을 하나의 변수에서 관리를 하려면 바이트 배열이 필요하겠다.
			/*
			byte[] buff = new byte[1024];
			int len = fin.read(buff);
			// 문자열로 변환하고
			String str = new String(buff, 0, len);
			// 문자열을 출력한다.
			System.out.println("# # # # # 읽 은 결 과 # # # # #");
			System.out.println(str);
			*/
			
			// 3. 문서 전체를 읽어보자.
			while (true) {
				byte[] buff = new byte[1024];
				int len = fin.read(buff);
				if(len == -1)	{
					// 더이상 읽은 데이터가 없으면 반복을 중지한다.
					// 이때 read() 는 읽은 데이터가 없으면 -1을 반환해준다.
					
					break;
				}
				String str = new String(buff, 0, len);
				System.out.println(str);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		new Test02();
	}

}
