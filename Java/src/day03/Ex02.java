package day03;

public class Ex02 {
/*
 	���� 1]
 		�Խ��ǿ� ���� ���������� 15�� ǥ���Ҽ��ִ�.
 		�Խù��� ������ �����ϰ� (0 ~ 100) �߻��� ��
 		�ʿ��� ������ ���� ����ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
 		��, �Խù� ���� 0 �� ���� 1�������� �ʿ��Ѱ����� �Ѵ�.
 */
	public Ex02() {
		//int gel = (int)(Math.random()*100);
		int gel = 0;
		int sol = gel /15;
		int page = 0;
		
		if (gel == 0) {
			
			page = 1;
		}else if (gel %15 == 0) {
			page = sol;
			
		} else {
			page = sol +1;
			

		}
		System.out.println("�Խñ� �� : " + gel);
		System.out.println("�ʿ��� ������ ���� " + page);
	}
	

	public static void main(String[] args) {
		new Ex02();
	}

}
