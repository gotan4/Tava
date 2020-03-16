package day06;

import java.util.Arrays;

/*
 문제 4]
	
	반지름 5개를 기억할 배열을 만들고
	랜덤하게 5개의 반지름을 만들어서 입력하고
	각각의 반지름을 가진 원의 넓이를 계산해서 저장할 배열을 만들고
	각 원의 둘레를 계산해서 저장할 배열도 만들어서
	
	결과를 출력하는 프로그램을 작성하세요.
	
	단, 출력형태는
		
		예]
			반지름 : 10, 원의 둘레 : 62.8, 원의 넓이 : 314
			
	의 형태로 출력되게 하세요.

 */
public class Ex04 {

	public static void main(String[] args) {
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
			System.out.println("반리름은 " + arr[i] + " 원의 둘레는 " + arr[i] * 3.14 * 2 + " 원의 넓이는 " + arr[i] * arr[i] * 3.14);

		}System.out.println(Arrays.toString(arr));
		System.out.println();
	}

		

}
