package day04;

/*
	두 수를 입력받은 후
	두 수의 최대공약수를 구해서 출력해주는 프로그램을 작성하세요.
	
	최소공배수구하기
 */

import java.util.*;
public class Hw02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int no1 = sc.nextInt();
		
		System.out.print("두번째 숫자 : ");
		int no2 = sc.nextInt();
//입력		
		if(no2 > no1) {
			int tmp = no1;
			no1 = no2;
			no2 = tmp;
		}
		//큰수
		for(int i = no2 ; i > 0 ; i--) {// 작은수에서 1씩 뺀다
			if(no1 % i == 0 && no2 % i == 0) {//큰수를 뺀 수로 나눴을때 0이나오고 작은수도 나머지가 0이나오는데 두수가 같으면 그게 최대공약수
				
					int sobae = i;
					System.out.println(no1 + " 과 " +no2+ " 의 최소공배수는 " + no1*no2/i + " 입니다.");
				break;
			}
		}
	}

}
