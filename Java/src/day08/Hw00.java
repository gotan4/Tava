package day08;

import java.util.Arrays;

public class Hw00 {

	public static void main(String[] args) {
		int[] dan = new int[8];
		for (int i = 0; i < dan.length; i++) {
			dan[i] = i + 2;
		}
//		System.out.println(Arrays.toString(dan));
		int[] gop = new int[8];
		for (int i = 0; i < gop.length; i++) {
			gop[i] = i + 2;
		}
		int[][] gugudan = new int[8][8];
		for (int i = 0; i < gugudan.length; i++) {
			
			for (int j = 0; j < gugudan.length; j++) {
			
				gugudan[i][j] = dan[i] * gop[j];
				
				System.out.println((i+2) + " X " + (j+2)+" = " + gugudan[i][j]);
				
			}System.out.println("-------------------------");
		
		}
	}
}
