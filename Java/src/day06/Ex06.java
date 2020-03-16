package day06;

public class Ex06 {

	public static void main(String[] args) {
		int[] fac = new int[10];
		//fac 10칸 배열 생성
		

		for (int i = 0; i < 10; i++) {
			int result = 1;
			// 만들어진 숫자까지 곱한 결과를 만들어주는 반복문
			for (int j = 1; j <= i; j++) {
				result = result * j;
				fac[i] = result;
			}

			System.out.print(fac[i] + ", ");
		}
	}
}
