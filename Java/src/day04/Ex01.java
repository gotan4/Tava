package day04;

/*
	4자리 숫자로 된 년도를 입력받아서
	윤년인지 평년인지 판단해서 출력하세요.
	단, switch ~ case 구문으로 처리하세요.
 */

import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
		// 입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			// 메세지출력하고
			System.out.print("4자리 년도 : ");
			// 입력받고
			int year = sc.nextInt();
			// 코드만들고 ( 4로 나눠떨어지는수 - 1, 100으로나눠떨어지는 수 - 2 , 400으로나눠떨어지는 수는 - 3 )
			
			int code = 0;
			if(year % 400 == 0) {
				code = 3;
			} else if( year % 100 == 0) {
				code = 2;
			} else if(year % 4 == 0) {
				code = 1;
			} else if(year == 9) {
				code = 9;
			}
			
			// switch ~ case 조건처리...
			String hae = "평년";
			switch(code) {
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			case 3:
				hae = "윤년";
				break;
			case 2:
				break;
			case 1:
				hae = "윤년";
				break;			
			}
			
			// 출력하고
			System.out.println("입력한 년도 [ " + year + " ] 는 [ " + hae + " ] 입니다.");
		}
	}

}
