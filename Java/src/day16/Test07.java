package day16;

import java.util.*;
public class Test07 {

	public Test07() {
		Vector vec = new Vector();
		System.out.println(vec.capacity());
		for(int i = 0 ; i < 11 ; i++ ) {
			vec.add(i);
		}
		for(Object obj : vec) {
			System.out.println((int) obj);
		}
		System.out.println("vec.cap : " + vec.capacity());
		for(int i = 0 ; i < 10 ; i++ ) {
			vec.add(i);
		}
		System.out.println("vec.cap : " + vec.capacity());
	}

	public static void main(String[] args) {
		new Test07();
	}

}
