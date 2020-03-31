package day17;

import java.util.*;
public class Test04 {

	public Test04() {
		ArrayList<String> list = new ArrayList<String>();
		// list에 데이터를 채워주자.
		list.add("진로");
		list.add("큰손");
		list.add("회장");
		list.add("반장");
		list.add("광호");
		
		// 출력부터하고
		for(String s : list) {
			System.out.print(s + " | ");
		}
		System.out.println();
		
		// 오름차순 정렬해보자.
		Collections.sort(list);
		for(String s : list) {
			System.out.print(s + " | ");
		}
		System.out.println();
		
		Collections.sort(list, new Comparator() {
			// 문자열의 기본 정렬방식은 오름차순 정렬이고
			// 다른 방식으로 정렬을 하려면 Comparator 인터페이스를 구현한 클래스를 만들어줘야한다.
			@Override
			public int compare(Object o1, Object o2) {
				// 이 함수 안에서
				// 반환값이 음수이면 교체하고
				// 양수이면 냅두고
				
				// 문자열로 강제형변환 해주고
				String s1 = (String) o1;
				String s2 = (String) o2;
				
				int result = s1.compareTo(s2);
//				int result = s2.compareTo(s1);
				return -result;
			}
			
		});
		for(String s : list) {
			System.out.print(s + " | ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Test04();
	}

}
