package day04;
/*
	(��ø�� �ݺ������� ó��
  	2~100 ������ ���� �Ҽ��� ������ִ� ���α׷��� �ۼ��ϼ���.
  	
 */
public class Hw03 {
	
	public static void main(String[] args) {
		int ge = 0;
		loop:
		for (int i = 2; i < 100; i++) {
			for (int j = 2; j < i; j++) {
				
				if (i%j == 0) {
				
					continue loop;
					
				}
				
			}
			/*
			 	 ���� �ݺ����� ���������� ������ �ݺ�ó���� ��ٸ� �� ���� ������ ���̰�
			 	 �� ���� ������ �ִ� ���� ���ٴ� ���̹Ƿ�
			 	 �� ��(i)�� �Ҽ��� ���̴�.
			 	 
			 	 �׷��� �Ҽ��� ��¸� �ϸ� �� ���̴�.
			 */
			System.out.println(i + ",");
			ge++;
		}
		System.out.println(ge);
	}
}