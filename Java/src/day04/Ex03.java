package day04;

public class Ex03 {
/*
 	���� 3]
 		2X + 4Y = 10�� �������� ����� ����ϼ���.
 		��, X, Y�� ��� 0���� 10������ �����̴�.
 */
	public static void main(String[] args) {
		System.out.println("2X + 4Y = 10");
		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				int bang = (2*x)+(4*y);
				if (bang == 10) {
					
					System.out.println("X = " + x + " Y = " + y );
					
				}
				
			}
			
		}
		
	}

}
