package day10;

/*
	*********************************************************************
	*	[ Dessert ]									            		*
	*												            		*
	*	�ֱ� 5�⵿���� ����� �迭�� ��Ƽ� �����Ϸ��� �Ѵ�.			*
	*	int[][] gion = new int[5][2];									*
	*																	*
	*	�� �����														*
	*	ù��° �濡�� ����� -20 ~ 40���� �����ϰ� �Է��ϰ�				*
	*	�ι�° �濡�� ������ 1 ~ 5���� �ε������������� ä����������.	*
	*																	*
	*********************************************************************
 */
public class Dessert {
	public void gion() {
		int[][] gion = new int[5][5];
		for (int i = 0; i < gion.length; i++) {
			for (int j = 0; j < 5; j++) {
				gion[i][j] = (int) (Math.random() * (40 - 20 + 20) - 20);

			}
		}
	}
}