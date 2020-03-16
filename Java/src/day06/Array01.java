package day06;

/*
	1 부터 5까지 기억할 배열을 만들고 내용을 출력하세요.
 */

import java.util.*;
public class Array01 {

	public static void main(String[] args) {
		// 변수를 선언한다.
		int[] num;
		// 변수에 배열을 만들고 기억시킨다.
		num = new int[]{1, 2, 3, 4, 5};
		
		int[] num2 = {1, 2, 3, 4, 5};
		
		for(int i = 0 ; i < num.length ; i++ ) {
			int no = num[i];
			// 배열의 각 방에 기억된 데이터를 꺼내는 방법은 "배열변수[위치]"
			System.out.print(no + ", ");
		}
		System.out.println();
		String str = Arrays.toString(num);
		System.out.println("Arrays.toString() : " + str);
	}

}
