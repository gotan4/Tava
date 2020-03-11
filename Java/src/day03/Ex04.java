package day03;

import java.util.Scanner;

public class Ex04 {
	/*
	 	문제3]
	 		부서번호를 입력하면
	 		부서이름을 출력해주는 프로그램을 작성하세요
	 		
	 			10 - 총무부
	 			20 - 회계부
	 			30 - 영업부
	 			40 - 기술부
	 			나머지 - 다음기회에...
	 			
	 */
	
	public Ex04() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("부서번호 : 10, 20, 30, 40");
		System.out.println("부서번호를 입력하세요. : ");
		
		int bu = sc.nextInt();
		sc.close();
		
		if (bu == 10) {
			System.out.println("총무부");
			
		} else if (bu == 20) {
			System.out.println("회계부");
			
		} else if (bu == 30) {
			System.out.println("영업부");
			
		} else if (bu == 40) {
			System.out.println("기술부");
			
		}else {
			System.out.println("다음기회에 ....");
		}
		
		
	}

	public static void main(String[] args) {
		new Ex04();
	}

}
