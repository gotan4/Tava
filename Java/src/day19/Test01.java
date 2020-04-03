package day19;

import java.util.Arrays;

/*
 	예제 1]
 		키보드를 이용해서 문자를 입력 받아보자.
 */
public class Test01 {
/*
 	참고 ]
 		키보드 역시 외부 장치이다.
 		자주 쓰이는 외부장치이기 때문에
 		이미 스트림으로 준비한 변수가 존재한다.
 		
 		System.in
 */
	public Test01() {
		System.out.println("한 글자를 입력해 주세요! : ");
		// 변수 선언
		int ch = 0;
		
		try {
			/*
			//1.
			ch = System.in.read();
			System.out.println("입력한 문자 : " + (char) ch);
			 */
			/*
			// 2. ***
			byte[] buff = new byte[256];
			// 256의 숫자에 따라서 한번에 읽는 데이터의 양이 정해진다.
			int len = System.in.read(buff);
			// 읽은 결과를 문자로 변환해서 출력하자.
			String str = new String(buff, 0, len);
			System.out.println("읽은 문자 : " + str);
			*/
			
			//3. 주로 네트워크 처리를 할때 많이 사용하는 방법
			byte[] buff = new byte[256];
			Arrays.fill(buff, (byte) 'A'); //  배열의 모든 데이터를 'A'로 채워준다.
//			System.out.println(Arrays.toString(buff));
			int len = System.in.read(buff, 10, 100);
			// 준비된 배열 buff에 10번 방부터 읽은 내용을 기억하세요...
			// 최대 100까지만 읽으세요...( ==> 100글자만 입력받을 수 있다.)
			String str = new String(buff, 0, len + 20);
			// \n을 지워보자.
			str = str.replaceAll("\r\n", "*");
			System.out.println("입력한 문자열 : " + str);
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
