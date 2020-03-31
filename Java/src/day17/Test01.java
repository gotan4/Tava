package day17;

import java.util.ArrayList;
import java.util.Collections;


public class Test01 {

	public Test01() {
		// TODO 자동 생성된 생성자 스텁
		ArrayList<Sagak> list = new ArrayList<Sagak>();
		for (int i = 0; i < 10; i++) {
			int no1 = (int)(Math.random()* 16 + 5);
			int no2 = (int)(Math.random()* 16 + 5);
			list.add(new Sagak(no1,no2)	);
		}
		for(Sagak s: list) {
			System.out.print(s.getArea()+ " | ");
		}
		System.out.println();
		// 이제 이 ArrayList를 정렬해 보자.
		// 정렬하는 방법은 Collections 클래스에 소속된 sort() 함수를 호출하면 오름차순 정렬이 될 것이다.
		Collections.sort(list);
		for(Sagak s: list) {
			System.out.print(s.getArea()+ " | ");
		}
		System.out.println();
		Collections.sort(list, new HwSort());
		for(Sagak s: list) {
			System.out.print(s.getArea()+ " | ");
		}
		}

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		new Test01();
	}

}
