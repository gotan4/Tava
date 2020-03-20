package day10;

import java.util.Arrays;

public class Dessert_P {

	public static void main(String[] args) {
		int[][] gion = new int[5][2];
		for (int i = 0; i < gion.length; i++) {
				gion[i][0] = (int) (Math.random() * 61 - 20);
				
			}
		for (int i = 0; i < 5;) {
			gion[i++][1] = i;
		}
		for(int[] g : gion) {
			
			System.out.println(Arrays.toString(g));
		}
		for (int i = 0; i < gion.length-1; i++) {
			for (int j = 0; j < gion.length; j++) {
				if(gion[i][0] < gion[j][0]) {
					
				}
			}
		}
		}
		
	

}
