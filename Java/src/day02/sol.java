package day02;

import java.util.*;

public class sol {
	/*
 	1. 5, 10, 20 �� ������ �����ϳ��� �����ϰ� (���, ���� ���)
 	�̰��� 2������ �ٲ㺸��
 	�������α׷��� ����� ��ġ�ϴ��� Ȯ���ϼ���.
 --------------------------------------------------------
 
 	2. �������� 7�� ���� ����, �ѷ��� ����ؼ� ����ϼ���.
 		���� �ѷ� : 2*������ * 3.14
 		���� ���� : ������ * ������* 3.14
 		��, ������, �ѷ�, ���̴� ������ ���� ó���� �ϼ���
 		�ѷ��� flot Ÿ���� ������ ���弼��
 		
 	3. �ΰ��� ����(����) ������ ���
 		�μ��� ����, ���η� �ϴ� �簢���� ���̸� ���ϼ���.
 	4. 3�������� �μ��� �غ��� ���̷� ������ �ﰢ���� ���̸� ���ϼ���
 	5. 54232���� �����ؾ��Ѵ�.
 		�츮���� ȭ��� �� ������ ��� �ʿ����� ����ؼ� ����ϼ���.
 ����] 1���� 365.2426���̴�.
 		�� ��¥�� ���� ���� ��ð�, ���, �������� ����ؼ� ����ϼ���.
 		 */
	public static void main(String[] args) {
		/*double data = 365.2426;
		int day = (int)data;
		int sec = (int)((data % 1) * 24 * 60 * 60);
		//0.2426��  ==> 0.2426 * 24(�ð�)
		//			==> 0.2426 * 24 * 60(��)
		//			==> 0.2426 * 24 * 60 * 60(��)
		
		int hour = sec / 3600;
		
		sec %= 3600;
		
		int min = sec / 60;
		
		sec %= 60;
		
		System.out.println("�ϳ��� " +  day + "��, " + hour + "�ð�, " + min + "��, " +  sec +" �� �Դϴ�. ");
		*/
		double pi = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �Է��ϼ��� :  ");
		int ban =  sc.nextInt();

		double dul = ban *2 * pi;
		double nul = Math.pow(ban, 2) *3.14;
		System.out.println("���� �ѷ��� : " + dul );
		System.out.println("���� ���̴� : " + nul );
		

		System.out.print("���θ� �Է��ϼ��� : " );
		int garo = sc.nextInt();
				
	
		System.out.print("���θ� �Է��ϼ��� : " );
		int sero = sc.nextInt();
		sc.close();
		
		int sagak = garo * sero;
		double samgak = garo * sero *0.5;
		
		System.out.println("�簢���� ���̴� : " + sagak);
		System.out.println("�ﰢ���� ���̴� : " + samgak);
		
		
	}

}
