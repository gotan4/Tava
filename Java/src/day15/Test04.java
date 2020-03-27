package day15;

import java.util.Arrays;

public class Test04 {

	public static void main(String[] args) {
		int[] arr = {10, 5, 7, 15, 8};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		Arrays.fill(arr, 11);
		System.out.println(Arrays.toString(arr));
	}

}
