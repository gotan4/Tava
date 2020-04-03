package day19;

import java.io.PrintStream;

import javax.swing.JOptionPane;

/*
 		김소월의 진달래 꽃을 저장해보자
 */


public class Test09 {

	public Test09() {
		// 스트림을 준비한다.
		PrintStream ps = null;
		try {
			// 스트림 초기화 하고
			ps = new PrintStream("src/day19/etc/poem.txt");
			// 참고 ] 이 스트림은 보조스트림이다. 하지만 직접 장치에 연결이 된다.
			// 			마치 기본스트림 없이 작동하는 것 처럼 보이지만 내부적으로 타겟스트림을 만들어서
			//			그 타겟스트림에 연결해서 사용하는 보조스트림이다.
			
			// 시를 써보자.
			ps.println(" * * * 진달래 꽃 * * * ");
			ps.println("                        김 소 월");
			ps.println("나보기가 역겨워");
			ps.println("가실 때에는 ");
			ps.println("말없이 고이 보내 드리우리다");
			ps.println(" ");
			ps.println("영변에 약산");
			ps.println("진달래꽃");
			ps.println("아름 따다 가실 길에 뿌리우리다");
			ps.println(" ");
			ps.println("가시는 걸음걸음");
			ps.println("놓인 그꽃을");
			ps.println("사뿐이 즈려밟고 가시 옶소서");
			ps.println(" ");
			ps.println("나 보기가 역겨워");
			ps.println("가실 때에는");
			ps.println("죽어도 아니 눈물 흘리우리다");
			
			ps.flush();
			
			JOptionPane.showMessageDialog(null, "### 저장 완료 ###");
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		} finally {
			try {
				ps.close();
				// close() 함수는 내부적으로 flush() 기능을 포함하고 있다.
				// 따라서 close() 호출되면 자동적으로 flush() 도 호출이 된다.
				
				} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		new Test09();

	}

}
