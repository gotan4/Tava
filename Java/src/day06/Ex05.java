package day06;
// �Ǻ���ġ
public class Ex05 {

	public static void main(String[] args) {
		int[] pivo = new int[10];//�迭 �Ǻ���ġ 10��
		int no1 = 1;
		int no2 = 1;
		
		System.out.println(no1);
		System.out.println(no2);
		for (int i = 0; i < 10; i++) {
			int result = no1+no2;
			no1 = no2;
			no2 = result;
			pivo[i] = result;
			
			System.out.println(result);
		}
		
	}

}
