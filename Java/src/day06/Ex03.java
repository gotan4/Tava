package day06;

import java.util.Arrays;

/*
 ���� 3]
	
	int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
	�̶�� �迭�� �غ��ϰ�
	
	79456���� �غ�� ȭ������� ����� �� ������ ȭ������� ��� �ʿ�����
	������ ������ �迭�� �����
	����ϴ� ���α׷��� �ۼ��ϼ���.
	
 */
public class Ex03 {

	public static void main(String[] args) {
		int[] coin = { 10000, 5000, 1000, 500, 100, 50, 10, 1 };
		int pri = 79456;
		int na[] = new int[coin.length];
		
		for (int i = 0; i < coin.length; i++) {
			if (coin[i] <= pri) {
				na[i] = pri/coin[i];
				pri = pri%coin[i];
			}
			
			System.out.println(coin[i] + "�� " + na[i] + "�� �����ݾ�" + pri);

		}

	}

}
