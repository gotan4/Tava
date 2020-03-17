package day07;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 문제3]
	
	회원의 이름, 전화번호, 이메일을 저장할 배열을 만들고 - 문자열 배열3개
	데이터를 입력해 놓고
	이름을 입력하면
	그사람의 데이터를 모두 저장할 배열을 만들어서
	데이터를 넣고 출력하세요.
 */
public class solv3 {

	public static void main(String[] args) {
		//name 배열 생성
		String[] name = {"김소영", "최두용", "정우승", 
				"유태희", "김종형", "임서진"};
		//tel 배열 생성
		String[] tel = {"010-1111-1111", "010-2222-2222", "010-3333-3333", 
			"010-5555-5555", "010-8888-8888", "010-9999-9999"};
		//mail 배열 생성
		String[] mail = new String[]{"pengsoon@increpas.com", "dDragon@increpas.com", 
						"victory@increpas.com", "nobody@increpas.com",
						"bell@increpas.com", "leem@increpas.com"};
		// sol 배열 생성
		String[] sol = new String[6];
		//for문을 이용해 이름 번호 이메일 을 하나로 만드는 배열을 생성
		for (int i = 0; i < sol.length; i++) {
			sol[i] = name[i] +" "+ tel[i] +" "+ mail[i];
		}
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름을 입력하세요 : ");
//		String nm = sc.nextLine();
//		sc.close();
		// 이름을 입력받아서
		String nm = JOptionPane.showInputDialog("이름을 입력하세요");
		for (int i = 0; i < sol.length; i++) {
			//이름과 이름배열의 i 를 알아낸뒤
			if (nm.equals(name[i]) == true) {
				
//				System.out.println(sol[i] );
				//i번째 sol 을 출력
				JOptionPane.showMessageDialog(null, sol[i]);
			}
			
			
		}
		
		
	}

}
