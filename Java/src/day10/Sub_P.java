package day10;

import java.util.Scanner;

public class Sub_P {
	Sub[] sub;
	
	public void setSub() {
		sub = new Sub[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("������ 10�� �Է��ϼ��� : ");
		
		for (int i = 0; i < sub.length; i++) {
			sub[i] = new Sub();
			int p = sc.nextInt();
			sub[i].setVal(p);
			System.out.print(", ");
			
		}
		
	}
	public static void main(String[] args) {
		Sub_P s = new Sub_P();
		
		s.setSub();
		
		System.out.println("###########");
		Sub.toPrint();
		System.out.println("###########");
	}

}
