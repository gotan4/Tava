package day03;

import java.util.*;


public class Hw01 {
	public Hw01(){
		Scanner sca = new Scanner(System.in);
		System.out.print("몇번 문제를 푸시겠습니까? : ");
		int hw = sca.nextInt();
		switch(hw){
		case 1:
			System.out.println();
			int sejari = (int)(Math.random()*(999-100+1))+100;
			System.out.println("문제 1 : " + sejari);
			break;
		case 2:
			int asc = (int)(Math.random()*(255));
			System.out.println("문제 2 : " + asc +" "+ (('A' <= asc &&  asc <= 'Z') ? ("영문자") :('a' <= asc &&  asc <='z') ? ("영문자") : ("영문자아님")));
			break;
		case 3:
			double fa = (100 - 32 / 1.8);
			System.out.println("문제 3 : "+ fa);
			break;
		case 4:
			System.out.println("문제 4");
			Scanner sc = new Scanner(System.in);
			
			System.out.print("소수가 포함된 값을 입력하세요 : ");
			double ban = sc.nextDouble();
			//sc.close();
			double result1 = (int)((ban + 0.005) * 100);
			double result2 = result1 /100;

			System.out.println("소수점 이하 세째자리에서 반올림한 결과 : " + result2);
			break;
		case 5:
			int su = (int)(Math.random()*(99-10+1)+10);
			int su1 = su/10*10;
			int besucha = su - su1;
			
			System.out.println("문제 5 : " + su +" 은 "+ su1+" 과 차가 "  + besucha + " 이다");
			break;
		case 6:
			System.out.println("문제 6");
			Scanner sc1 = new Scanner(System.in);
			System.out.print("연도를 입력하세요 : ");
			int year = sc1.nextInt();
			sca.close();
			String str = (year % 4 == 0)? ((year % 100 == 0) ?  ((year % 400 == 0) ? "윤년" :"평년") : "평년") : "평년";
			System.out.println(str);
		default:
			System.out.println("문제를 풉시다.");
		}
	}

		
	public static void main(String[] args) {
		new Hw01();
		

	
	}
}
