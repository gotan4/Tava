package day01;
/**
 * 	클래스의 정보를 담는 주석. 이부분에 클래스의 설명을 작성한다.
 * @author 전은석
 * @since 2020.03.09	(작성일을 기입하는 부분)
 * @version v.1.0		(해당 클래스의 버젼을 지정하는 부분)
 * @see					(참고해야할 클래스들을 나열하는 부분)
 *
 *		변경이력
 *		2020.03.09	-	클래스 제작
 *
 */
public class Test04 {

	public static void main(String[] args) {

		/*
		 	java 의 주석처리
		 		1. // 한줄주석
		 		2. /* 한단주석 */ 
		 /*
		  		증감연산자
		  			++,--
		  			: 변수에 붙여지며 붙여진 변수의 값을  또는 -1 더해준다
		  				기호이후에 처음나오는 변수에 한해서 한번만
		  */
			int no1 = 10;
			int no2 = no1++ + ++no1;
			
			System.out.println("no2 :  " + no2);
			
			/*
			 	문자열을 결합해주는 연산자는 + 로 처리를 한다.
			 */
			
			
			int num1 = 10;
			int num2 = ++num1 +15;
			int num3 = num1++ +15;
			System.out.println(num2);
			System.out.println(num3);
	}

}
