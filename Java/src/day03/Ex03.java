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
		
		System.out.println("사용량을 입력하세요.");
		int sa = sc.nextInt();
		int gap = 0 ;
		
		if (code == 1) {
			gap = sa + 3800 * 245;			
		} else if (code == 2) {
			gap = sa + 2400 * 157;
		}else if (code == 3) {
			gap = sa + 2900 * 169;
		}else if (code == 4) {
			gap = sa + 3200 * 174;
		}

		
		
		System.out.println(" 전기요금 : " + gap);
		
		
		
		
	}
	
	

	public static void main(String[] args) {

		new Ex03();
	}

}
