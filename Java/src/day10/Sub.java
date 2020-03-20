package day10;

import java.util.Arrays;
import java.util.Scanner;

public class Sub {
	int point;
	static int sum;
	static int avg;
	


	public void setVal(int p) {
		point = p;
		sum += p;
		avg = sum/10; 
		
	}
//	public void toInput(int t) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를 10개 입력하세요 : ");
//		t = sc.nextInt();
//
//	}
	public static void toPrint() {
		System.out.println("합계 : " + sum + " 평균 : " + (float)avg);
	}

}
