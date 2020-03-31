package day17;

import java.util.*;
public class Test06 {

	public Test06() {
		TreeSet<String> set = new TreeSet<String>();
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elevator");
		set.add("elephant");
		set.add("fan");
		set.add("flower");
		set.add("jfla");
		
		// 이 중에서 b로 시작하는 데이터부터 
		// d로 시작하는 데이터까지만 꺼내서
		// 새로운 Set을 만들어보자.
		TreeSet<String> tmpSet = (TreeSet<String>) set.subSet("b", "dzzzzzzzzzzzzzzzzzzzz");
		
		// 출력한다.
		Iterator<String> itor = tmpSet.iterator();
		while(itor.hasNext()) {
			System.out.print(itor.next() + " | ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		new Test06();
	}

}
