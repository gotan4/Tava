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
//		System.out.print("������ 10�� �Է��ϼ��� : ");
//		t = sc.nextInt();
//
//	}
	public static void toPrint() {
		System.out.println("�հ� : " + sum + " ��� : " + (float)avg);
	}

}
