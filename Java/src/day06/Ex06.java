package day06;

public class Ex06 {

	public static void main(String[] args) {
		int[] fac = new int[10];
		//fac 10ĭ �迭 ����
		

		for (int i = 0; i < 10; i++) {
			int result = 1;
			// ������� ���ڱ��� ���� ����� ������ִ� �ݺ���
			for (int j = 1; j <= i; j++) {
				result = result * j;
				fac[i] = result;
			}

			System.out.print(fac[i] + ", ");
		}
	}
}
