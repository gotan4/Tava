package day07;

import java.util.Arrays;

/*
 문제1]
	알파벳 10개를 저장할 배열을 만들고
	대문자 10개를 랜덤하게 추출해서 배열에 저장하고
	저장된 배열을 얕은 복사로 복사해서
	출력하고, 
	원래 배열을 소문자로 변경한 후
	두배열을 출력하세요.
 */
public class solv01 {

	public static void main(String[] args) {
		// 알파벳 10개를 저장하는 배열
		char[] alp = new char[10];
		//알파뱃 10개를 alp 배열 갯수만큼(10개)를 알파벳 대문자에서 10개 추출해서
		
		for (char i = 0; i < alp.length; i++) {
			char alpa = (char)(Math.random()*('Z'-'A' +1) + 'A');
		//추출된 alpa를 for문을 이용하여 alp배열에 채운다
			alp[i] =alpa;
		
		}//대문자 알파벳을 출력하고
		System.out.println(Arrays.toString(alp));
		//소문자를 담을 alp1 배열을 생성한다.
		char[] alp1; 
		//얕은 복사
		alp1 = alp;
		
		for (int i = 0; i < alp1.length; i++) {
			alp1[i] = (char)(('a' -'A')+(alp[i]));
		//소문자로 변환해서 담아서
		}
	
		//출력
		System.out.println(Arrays.toString(alp1));
		

	}

}
