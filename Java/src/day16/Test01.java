package day16;

// DecimalFormat

import java.text.*;
public class Test01 {

	public Test01() {
		// 실수를 형식을 만들어서 출력해보자.
		double num = 34256.3545;
		// 위의 실수가 최종 결과라고 가정하고
		// 정수부 3자리마다 , 를 찍어주고 
		// 소수이하는 3자리만 출력하고자 한다.
		DecimalFormat pattern = new DecimalFormat("0,000,000.000");
		String str = pattern.format(num);
		System.out.println(num + "\n" + str);
		System.out.println();
		
		DecimalFormat pattern1 = new DecimalFormat("#,###,###.###");
		str = pattern1.format(num);
		System.out.println(num + "\n" + str);
	}

	public static void main(String[] args) {
		new Test01();
	}

}
