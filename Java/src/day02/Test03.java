package day02;

public class Test03 {
	public Test03() {
		int sum = addNums(10, 50);
		System.out.println("10과 50의 합은 " + sum + "입니다. ");
	}

	public static void main(String[] args) {
		new Test03();
		System.out.println();
	}
	/*
	 	함수 : 프로그램에서 기능을 가진 최소단위
	 		형식]
	 			[접근지정자] [속성] 반환값타입 함수이름(매개변수리스트){
	 				함수내용...
	 				
	 				return [ 반환값] ;
	 			}
	 			참고]
	 				반환값 반환하기
	 				
	 				return 반환값;
	 				
	 				의미]
	 					돌려줄 값이 있으면 돌려주고 함수를 종료하세요.
	 					
	 					반환값이 없는 경우는 반환값을 기술하지 않고
	 					return 명령의 의미는 이 함수를 즉시 종료하세요..
	 				반환값 타입]
	 				
	 		예]
	 			두수를 입력하면 두수(정수)를 더한 값을 반환해주는 기능을 가진함수
	 			public int addNums(int no1, int no2){	
	 			 	int sum = no1 + no2;
	 			 	
	 			 	return sum;
	 			 	
	 			
	 			}
	 */
	public int addNums(int no1, int no2) {
		int sum = no1 + no2;
		
		return sum;
	}

}
