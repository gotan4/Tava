package day01;

public class Ex01 {
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
		System.out.println("2 : " + Integer.toBinaryString(2));
		System.out.println("3 : " + Integer.toBinaryString(3));
		System.out.println("6 : " + Integer.toBinaryString(6));
		System.out.println("11 : " + Integer.toBinaryString(11));
		System.out.println("21 : " + Integer.toBinaryString(21));
		
		int rad = 7;
		double pi = 3.14;
		System.out.println("���� ���̴� : " + 2*rad*pi);
		System.out.println("���� �ѷ��� : " + (float)(rad*rad*pi));
		
		int garo = 3;
		int sero = 4;
		System.out.println("�簢���� ���̴� : " + garo*sero);
		System.out.println("�ﰢ���� ���̴� : " + garo*sero/2); 
		
		int don = 54232;
		int man = 10000;
		int chen = 1000;
		int bek = 100;
		int sip = 10;
		int ill = 1;
		System.out.println("������ : " + don/man);
		System.out.println( don );
		
	}

}
