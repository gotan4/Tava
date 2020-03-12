package day03;

import java.util.Scanner;

public class Ex03 {
/*
 	문제 2]
 		전기요금을 계산하는 프로그램을 작성하세요
 				코드	기본요금	사용요금
 		가정용	(1)		  3800		   245
 		산업용	(2)		  2400		   157
 		교육용	(3)		  2900		   169
 		상업용	(4)		  3200		   174
 		
 		전기요금 = 기본요금 + 사용량 * 사용요금
 		
 		사용자코드와 사용량을 입력받아서
 		전기요금을 계산해주는 프로그램을 작성하세요.
 */
	public Ex03() {
		Scanner sc = new Scanner(System.in);
		System.out.println("		코드	기본요금	사용요금\r\n" + 
				" 		  가정용	(1)		  3800		   245\r\n" + 
				" 		  산업용	(2)		  2400		   157\r\n" + 
				" 		  교육용	(3)		  2900		   169\r\n" + 
				" 		  상업용	(4)		  3200		   174\r\n" + 
				" 		  \r\n" + 
				" 		  전기요금 = 기본요금 + 사용량 * 사용요금");
		
		System.out.println("코드를 입력하세요.");
		int code = sc.nextInt();
		
		if(!(code >= 1 && code <= 4)) {
			System.out.println("코드를 잘못 입력 하였습니다.");
			return;
		}
		
		System.out.println("사용량을 입력하세요.");
		int sa = sc.nextInt();
		
		int gap = 0 ;
		String yongdo = "가정용";
		
		int gibon = 3800; // 기본요금 - 가정용 기본요금으로 초기화 
		int yogm = 245;
		
		
		if (code == 1) {
			// 여기는 가정용 ==> 용도는 기본값이 가정용으로 초기화가 되어있으므로 수정하지않는다.

			gap = sa + 3800 * 245;			
		} else if (code == 2) {
			yongdo = "산업용";
			gap = sa + 2400 * 157;
		}else if (code == 3) {
			yongdo = "교육용";
			gap = sa + 2900 * 169;
		}else if (code == 4) {
			yongdo = "상업용";
			gap = sa + 3200 * 174;
		}

		
		
		System.out.println(" 사용자코드 : " + code +
							"\n 용도 : " + yongdo + 
							"\n 사용량 : " + sa +
							"\n 전기요금 : " + gap);
		
		
		
		
	}
	
	

	public static void main(String[] args) {

		new Ex03();
	}

}
