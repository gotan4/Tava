package day08;

import java.util.Arrays;

/*
 ���� 2]

	����, ����, ����, ����, ���� ������ �����Ϸ��� �Ѵ�.
	(������ �����ϰ� �����ϼ���.)
	�л��� ���� 5���̰� 
	2���� �迭�� ����
	5���� ������ ������ �迭�� ���弼��.
 */
public class Hw02 {

	public static void main(String[] args) {
		// ���� �迭 ����
		String[] name = {"��", "��", "��", "��", "��"};
		int[][] sub = new int[5][5];
		System.out.println("�̸� ���� ���� ���� ���� ����");
		
		for (int i = 0; i < sub[0].length; i++) {
			System.out.print(name[0+i] + "    ");
			for (int j = 0; j < sub[1].length; j++) {
				sub[i][j] = (int)(Math.random()*100)+1;
				
				System.out.print( (sub[i][j])+"   ");
			}	System.out.println();
			
//		}System.out.println(Arrays.deepToString(sub));	
		}	
		
	}
}
