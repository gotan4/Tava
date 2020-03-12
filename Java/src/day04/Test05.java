package day04;

/*
	while 명령
		
		for 명령문처럼 반복실행할 수 있는 명령문
		for 명령문과의 차이점은 반복을 할 횟수를 지정하는 카운터 변수가 
		그리고 증감식도
		명령내부에 없는것이 차이점이다.
		
		형식]
			
			(1)
			while(조건식 - (2)){
				- (3)
			}
			- (4)
			
			순서 : 1 -> 2 -> 3 -> 2 -> 3 -> ... 조건식이 true 인 경우에만
					-> (4)
					
					
		do ~ while 명령
			: for와 while 명령은 선조건처리명령이고 조건에 따라서 한번도 실행안될 수 있지만
				do ~ while 명령은 후조건처리명령이고
				조건에 관계없이 무조건 한번이상 실행을 한다.
 */
public class Test05 {

	/*
		구구단을 출력하세요.
	 */
	public static void main(String[] args) {
		int dan = 2;
		
		while(dan < 10) {
			System.out.println("----------");
			
			int gop = 1;
			while(gop < 10) {
				System.out.println(dan + " x " + gop + " = " + (dan * gop));
				gop++;
			}
			dan++;
		}
		System.out.println("----------");
	}

}
