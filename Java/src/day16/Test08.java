package day16;

import java.util.*;
public class Test08 {

	public Test08() {
		// Vector 만들고
		Vector vec = new Vector();
		// 데이터 채우고
		// *** 컬렉션 안에는 모든 데이터를 동시에 보관할 수 있다. 배열을 한가지 타입만 저장할 수 있다.
		vec.add("abcd");
		vec.add(new String("abcd"));
		vec.add(10);					// <== int ----Boxing---> Integer ----------> Object
		vec.add(3.14);					// double -----Boxing---> Double ------------> Object
		vec.add(new int[] {1,2,3});
		
		// 데이터 꺼내고
		for(int i = 0 ; i < vec.size() ; i++ ) {
			Object o = vec.get(i);
			
			if(o instanceof String) {
				System.out.println((String) o);
			} else if(o instanceof Integer) {
				System.out.println((int) o);
			} else if(o instanceof Double) {
				System.out.println((double) o);
			} else if(o instanceof int[]) {
				System.out.println(Arrays.toString((int[]) o));
			}
			System.out.print("그냥 출력 : ");
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
