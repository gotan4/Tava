package day16;

// MessageFormat
import java.text.*;
import java.util.*;

import javax.swing.JOptionPane;
public class Test05 {

	public Test05() {
		/*
			"name : 홍길동, Tel : 010-1111-1111, Age : 24"
			"name : 심청이, Tel : 010-2222-2222, Age : 18"
			
			이 경우 각 문자열의 실제 데이터 부분이 변경이 일어난다.
			이런 경우 문자열을 만드는 방법
		 */
		MessageFormat form = new MessageFormat("Name : {0}, Tel : {1}, Age : {2}");
		
		// 동일한 내용은 그대로 쓰고
		// 변경되는 부분은 {0}, {1}, {2} 로 순서대로 기록한다.
		// 여기서 {}안의 번호는 입력되는 데이터의 순서를 의미한다.
		
		Object[][] data = { {"홍길동", "010-1111-1111", 24}, {"심청이", "010-2222-2222", 18} };
		
		// {0}, {1}, {2} 에 들어갈 데이터를 배열로 준비하고
		String result = form.format(data[0]);
		String result1 = form.format(data[1]);
		JOptionPane.showMessageDialog(null, result + "\n" + result1);
	}

	public static void main(String[] args) {
		new Test05();
	}

}
