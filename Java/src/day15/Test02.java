package day15;

import java.util.*;

public class Test02 {

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3, 4, 5}, {2, 3, 4, 5, 6}};
		
		List<int[]> list = Arrays.asList(arr);
		
		for(int[] a : list) {
				for(int no : a) {
					System.out.print(no + ", ");
				}
			System.out.println();
		}
	}

}
