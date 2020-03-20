package day08;

import java.util.Arrays;

/*
 문제 2]

	국어, 수학, 영어, 물리, 역사 점수를 관리하려고 한다.
	(점수는 랜덤하게 추출하세요.)
	학생의 수는 5명이고 
	2차원 배열로 만들어서
	5명의 점수를 저장할 배열을 만드세요.
 */
public class Hw02 {

	public static void main(String[] args) {
		// 과목 배열 생성
		String[] name = {"김", "이", "박", "최", "구"};
		int[][] sub = new int[5][5];
		System.out.println("이름 국어 수학 영어 물리 역사");
		
		for (int i = 0; i < sub[0].length; i++) {
			System.out.print(name[0+i] + "    ");
			for (int j = 0; j < sub[1].length; j++) {
				sub[i][j] = (int)(Math.random()*100)+1;
				
				System.out.print( (sub[i][j])+"   ");
			}	System.out.println();
			
//		}System.out.println(Arrays.deepToString(sub));	
		}	
		
	}
}
