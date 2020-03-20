package day08;

import java.util.Arrays;

/*
 	배열을 만들려고 한다.
 	배열의 형태는 2차 배열이고
 	데이터는 아래 형태로 입력하려고 한다.
 	
 	[ [1,1,1,1,1], [2,2,2,2,2], [3,3,3,3,3] ]
 */
public class Test01 {

	public static void main(String[] args) {
		
		int[][] num = new int[3][5];
		
		// 1차배열을 초기화 한다.
		// 먼저 2차 배열에 들어있는 배열을 먼저 순차적으로 꺼낸다.
		for(int i = 0; i< num.length; i++) {
			//2차 배열의 각 방에 들어있는 배열을 다시 꺼낸다.
			int[] arr1 = num[i];
			for (int j = 0; j < arr1.length; j++) {
				// 1차 배열의 각 방의 데이터를 초기화 한다.
				num[i][j] = i + 1;		
			}
		}
	System.out.println(Arrays.deepToString(num));
	}
	

}
