package day03;

import java.util.*;


public class Hw01 {
	public Hw01(){
		Scanner sca = new Scanner(System.in);
		System.out.print("��� ������ Ǫ�ðڽ��ϱ�? : ");
		int hw = sca.nextInt();
		switch(hw){
		case 1:
			System.out.println();
			int sejari = (int)(Math.random()*(999-100+1))+100;
			System.out.println("���� 1 : " + sejari);
			break;
		case 2:
			int asc = (int)(Math.random()*(255));
			System.out.println("���� 2 : " + asc +" "+ (('A' <= asc &&  asc <= 'Z') ? ("������") :('a' <= asc &&  asc <='z') ? ("������") : ("�����ھƴ�")));
			break;
		case 3:
			double fa = (100 - 32 / 1.8);
			System.out.println("���� 3 : "+ fa);
			break;
		case 4:
			System.out.println("���� 4");
			Scanner sc = new Scanner(System.in);
			
			System.out.print("�Ҽ��� ���Ե� ���� �Է��ϼ��� : ");
			double ban = sc.nextDouble();
			//sc.close();
			double result1 = (int)((ban + 0.005) * 100);
			double result2 = result1 /100;

			System.out.println("�Ҽ��� ���� ��°�ڸ����� �ݿø��� ��� : " + result2);
			break;
		case 5:
			int su = (int)(Math.random()*(99-10+1)+10);
			int su1 = su/10*10;
			int besucha = su - su1;
			
			System.out.println("���� 5 : " + su +" �� "+ su1+" �� ���� "  + besucha + " �̴�");
			break;
		case 6:
			System.out.println("���� 6");
			Scanner sc1 = new Scanner(System.in);
			System.out.print("������ �Է��ϼ��� : ");
			int year = sc1.nextInt();
			sca.close();
			String str = (year % 4 == 0)? ((year % 100 == 0) ?  ((year % 400 == 0) ? "����" :"���") : "���") : "���";
			System.out.println(str);
		default:
			System.out.println("������ Ǳ�ô�.");
		}
	}

		
	public static void main(String[] args) {
		new Hw01();
		

	
	}
}
