package day17;

import java.util.*;

import javax.swing.JOptionPane;
public class Test08 {

	public Test08() {
		Hashtable<String, String> table =  new Hashtable<String, String>();
		table.put("이름", "큰손");
		table.put("번호", "010-9999-9999");
		table.put("재산", "건물주");
		table.put("부업", "재벌");
		
		/*
		for(;;) {
			
			// 데이터 꺼내기
			String key = JOptionPane.showInputDialog("알고싶은 정보를 입력하세요!");
			//먼저 키를 만들고
			if (key.equals("q")) break;
			
			
			//데이터 꺼내서 보여주고
			JOptionPane.showMessageDialog(null, table.get(key));
			
			
		}
		// Map 계열은 키값을 알아야 데이터를 꺼낼수 있다.
		
		*/
		
		Collection<String> con = table.values();
		
		Iterator<String> itor = con.iterator();
		
		while(itor.hasNext()) {
			System.out.print(itor.next() + " | ");
			
		}
		System.out.println();
		
		// 키값만 뽑아보자. 함수는 keys() / keySet()
		Enumeration<String> en = table.keys();
		
		while(en.hasMoreElements()) {
			// 문자열 변수에 담고
			String key = en.nextElement();
			System.out.print(key + " | " + "\n\t");
			// Enumeration도 버퍼에 저장되는 데이터이므로 꺼내는 순간 사라지는 데이터다.
			// 따라서 꺼내면 즉시 사용하던지 따로 보관하던지 해야 한다. 
			System.out.println(key + " : " + table.get(key) );
		}
		System.out.println();
		
		while(en.hasMoreElements()) {
			String key = en.nextElement();
		}
		System.out.println("*****************************************");
		
	}

	public static void main(String[] args) {
		new Test08();
	}

}
