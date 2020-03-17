package day07;

import java.util.Arrays;

/*
 문제2]
	정수10개를 저장할 배열을 만들고
	랜덤하게 1~ 50까지 수중 발생시켜서
	배열에 담고
	배열의 5번째까지의 데이터를 깊은 복사로 복사하세요.
 */
public class solv2 {

	public static void main(String[] args) {
		//no 배열을 생성 10개짜리
		int[] no = new int[10];
		//solv 배열을 생성 5개짜리
		int[] solv = new int[5];
		//for문을 돌려서
		for (int i = 0; i < no.length; i++) {
			//no1에 랜덤한숫자 10개를 넣어둔다
			int no1 = (int)(Math.random()*(50));
			no[i] = no1;
		}
		System.out.println(Arrays.toString(no));//no 배열 10개 짜리 출력
		System.arraycopy(no, 0, solv, 0, 5); // 깊은복사로 5개까지 출력
		System.out.println(Arrays.toString(solv));// 깊은복사한거 출력
	}

}
