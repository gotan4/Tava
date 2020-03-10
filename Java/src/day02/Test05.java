package day02;

/**
 * 	이 클래스는 삼항 조건연산자 연습용 클래스
 * @author	전은석
 * @since	2020.03.10
 * @version	v.1.0
 * @see
 * 
 * 			변경이력
 * 				2020.03.10 - 클래스 제작 - 담당자 : 전은석
 *
 */
public class Test05 {
/*
	랜덤한 수 발생 시키는 방법
	
		Math 클래스 random() 함수는 0보다 크거나 같고 1보다 작은 실수를 반환해주는 함수.
		
		이때 범위에 해당하는 랜덤한 정수를 발생 시키는 방법은
		
		(int)((Math.random() * (최대값 - 최소값 + 1)) + (최소값);
		
 */
	
	public Test05() {
		test1();
	}
	
	public void test1() {
		// 1 ~ 10 까지의 랜덤한 숫자를 발생시켜서 그 숫자가 짝수인지 홀수인지 판별하세요.
		// 짝수의 정의 : 수를 2로 나눠서 나머지가 0인 수
		
		// 1. 랜덤한 정수를 만든다.
		int num = (int)(Math.random()*(10 - 1 + 1)) + 1;
		// 2. 삼항 연산자로 조건을 정의 한다.
		// 2-1. 참일때 반환값을 정의 한다.
		// 2-2. 거짓일때 반환값을 정의 한다.
		String msg = (num % 2 == 0) ?
					("[ " + num + " ] 은"
							+ " 짝수입니다.") :
						("[ " + num + " ] 은 홀수 입니다.");
		// 출력한다.
		System.out.println(msg);
		
	}
	
	public static void main(String[] args) {
		new Test05();
	}

}
