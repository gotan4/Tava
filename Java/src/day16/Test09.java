package day16;

import java.util.*;
public class Test09 {

	public Test09() {
		/*
		ArrayList list = new ArrayList();
		// list에 데이터 채우고
		list.add("한철");
		list.add("은진");
		list.add("성현");
		list.add("진수");
		list.add("대장");
		*/
		
		HashSet list = new HashSet();
		list.add("한철");
		list.add("은진");
		list.add("성현");
		list.add("진수");
		list.add("대장");
		
		/*
		// list 계열은 꺼내는 함수가 있어서 그 함수를 사용하는 것이 편하다.
		for(int i = 0 ; i < list.size(); i++ ) {
			System.out.print(list.get(i) + ", ");
		}
		System.out.println();
		*/
		
		// 2. Iterator 로 꺼내보자. ArrayList 소속의 iterator() 를 호출해주면 된다.
		Iterator itor = list.iterator();
		
		while(itor.hasNext()) {
			// hasNext()	==> 버퍼에 꺼낼 데이터가 있으면 true, 없으면 false를 반환해준다.
			String tmp = (String) itor.next();
			// 순차적으로 하나씩 꺼내야 하는데
			// 꺼내는 함수는 next() 인데 반환값 타입이 Object 이므로 적절히 강제형변환해서 사용해야 한다.
			System.out.print(tmp + " | ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		new Test09();
	}

}
