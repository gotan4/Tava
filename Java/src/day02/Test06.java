package day02;

import java.util.*;
public class Test06 {
/*
	랜덤하게 정수 11 ~ 33까지의 두수를 발생시키고
	숫자를 입력받아서
	입력받는 숫자가 1이면 삼각형의 넓이를
	 			2이면 사각형의 넓이를 구해주는 프로그램을 작성하세요.
 */
	public Test06() {
		// 입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		// 메세지 출력해주고
		System.out.print("삼각형의 넓이는 1, 사각형 넓이는 2 를 입력하세요! : ");
		int code = sc.nextInt();
		
		// 랜덤하게 두수를 발생해서 변수에 담고
		int no1 = (int)(Math.random()*(33 - 11 + 1)) + 11;
		int no2 = (int)(Math.random()*(33 - 11 + 1)) + 11;
		
		System.out.println("no1 : " + no1);
		System.out.println("no2 : " + no2);
		
		// 코드값이 1이면 삼각형넓이를구해서 출력해주고 , 2면 사각형넓이를 출력해주자.
		/*
			사각형과 삼각형의 넓이의 타입이 다르기 때문에 
			한가지 타입으로 통일 시켜줘야겠다.
			여기서는 함수 실행의 결과를 그대로 출력할 용도로만 사용할 것이기 때문에
			문자열로 통일해서 사용하면 될것 같다.
		 */
		
		
		/*
		// 방법 1]
		String result = (code == 1) ? ( "삼각형의 넓이 : " + samgak(no1, no2)) : 
								(
									code == 2 ? ("사각형의 넓이 : " + sagak(no1, no2)) : ("반장님한테 가시오!")	
								);
		*/
		
		// 방법 2]
		double semo = samgak(no1, no2);
		int nemo = sagak(no1, no2);
		
		String result = (code == 1) ? ("삼각형의 넓이는 " + semo) : 
										(
											(code == 2) ? ("사각형의 넓이는 " + nemo) : ("반장님한테 가시오!")	
										) ;
		
		System.out.println(result);
	}
	
	// 삼각형 넓이 구해주는 함수
	public double samgak(int no1, int no2) {
		// 면적을 계산해서 변수에 담고
		double area = no1 * no2 / 2.;
		// 면적을 반환해주고
		return area;
	}
	
	// 사각형 넓이 구해주는 함수
	public int sagak(int no1, int no2) {
		// 면적을 계산해서 변수에 담고
		int area = no1 * no2;
		// 면적을 반환해주고
		return area;
	}
	
	public static void main(String[] args) {
		new Test06();
	}

}
