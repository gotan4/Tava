package day12.sub;

import day12.*;

public class Test04_01 extends Test04 {
	public Test04_01() {
		Test04 t1 = new Test04();
//		t1.no1 = 10;
//		t1.no2 = 20;
		super.no3 = 30; // 상위클래스의 no3의 데이터를 30으로 바꾼다.
		t1.no4 = 40;

	}

	public static void main(String[] args) {

	}
}
